@Functionaltest
Feature: Wordpress login sanity check

	Background: pre-requisite step
	Given: User is presented the login page
	
	@Smoketest @Sanitytest 
	Scenario Outline: Validate user is able to login
	Given Open firefox browser
	When Enter valid "<userName>" and "<password>"
	Then User Logged In Successfully
	Then Close browser
	
	Examples:
	|userName|password|
	|"rajeev"|"test"|
	|"rajeev1"|test1"|