package org.grails.contributors

class HomeController {
	def refreshService
	
    def index = {
		refreshService.contributors()
		
		[coreContributors: Contributor.findAllByRepo("core"), docContributors: Contributor.findAllByRepo("doc")]
	}
}
