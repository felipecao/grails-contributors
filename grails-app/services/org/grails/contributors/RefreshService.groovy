/*
* Copyright 2011 Bobby Warner
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.grails.contributors

import groovy.json.JsonSlurper
import org.codehaus.groovy.grails.commons.*

/**
* Service to call GitHub API
*
* @author Bobby Warner
*/
class RefreshService {
    static transactional = false
    static scope = "singleton"

    def contributors() {	
		log.info("Contributors refresh method called")
		
		Refresh lastRefresh = Refresh.get(Refresh.count())
		def today = new Date()
		
		if (lastRefresh?.dateCreated < today - 1) {
			log.info("Contributors refresh being executed")
			
			def refresh = new Refresh()
			def start = System.currentTimeMillis() 
			
			Contributor.executeUpdate("delete Contributor c")
			
			def config = ConfigurationHolder.config
	        String baseUrl = config.github.url
			String coreApiCall = "repos/show/grails/grails-core/contributors"
			String docApiCall = "repos/show/grails/grails-doc/contributors"
		
			def coreUrl = new URL(baseUrl + coreApiCall)
			def coreResult = new JsonSlurper().parseText(coreUrl.getText())
			def docUrl = new URL(baseUrl + docApiCall)
			def docResult = new JsonSlurper().parseText(docUrl.getText())
		
			coreResult.contributors.each {
				new Contributor(repo: "core", login: it.login, contributions: it.contributions).save()
			}
		
			docResult.contributors.each {
				new Contributor(repo: "doc", login: it.login, contributions: it.contributions).save()
			}
			
			def stop = System.currentTimeMillis()  
			refresh.executionTime = stop - start
			refresh.save()
		}
    }
}
