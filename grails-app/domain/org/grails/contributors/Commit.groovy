package org.grails.contributors

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
class Commit {
    String commitId
    String url
    String committerLogin
    String committerEmail
    String message
    Date commitDate
    Date dateCreated

    static constraints = {
        commitId(nullable: false, unique: true)
        url(nullable: false)
        committerLogin(nullable: false)
        committerEmail(nullable: false)
        message(size: 1..4000)
        // TODO: convert from "2010-12-09T13:50:17-08:00" to Date
        commitDate(nullable: true)
    }
}
