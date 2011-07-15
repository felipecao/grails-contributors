package org.grails.contributors

import groovy.json.JsonSlurper

class HomeController {

    def index = {
		String baseUrl = grailsApplication.config.github.url
		String coreApiCall = "repos/show/grails/grails-core/contributors"
		String docApiCall = "repos/show/grails/grails-doc/contributors"
		
		
		def coreUrl = new URL(baseUrl + coreApiCall)
		def coreResult = new JsonSlurper().parseText(coreUrl.getText())
		
		def docUrl = new URL(baseUrl + docApiCall)
		def docResult = new JsonSlurper().parseText(docUrl.getText())
		
		assert coreResult instanceof Map
		assert docResult instanceof Map
		
		coreResult.contributors.each {
			new Contributor(repo: "core", login: it.login, contributions: it.contributions).save()
		}
		
		docResult.contributors.each {
			new Contributor(repo: "doc", login: it.login, contributions: it.contributions).save()
		}
		
		[coreContributors: Contributor.findAllByRepo("core"), docContributors: Contributor.findAllByRepo("doc")]
	}
}
