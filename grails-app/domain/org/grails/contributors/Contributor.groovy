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

class Contributor {
	String repo
	String login
	Integer contributions
	String email
	String location
	String company
	String name
	String blog

    static constraints = {
		email(nullable: true)
		location(nullable: true)
		company(nullable: true)
		name(nullable: true)
		blog(nullable: true)
    }
}
