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
