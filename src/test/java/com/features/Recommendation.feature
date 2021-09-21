Feature: Automation Project to gather requirements and purchase an Insurance

Scenario: Navigate to Requirements Page

	Given Browser is launched
    When User is on landing Page
	Then Accept the Cookies
	Then Navigate to Recommendations


Scenario: Gather User details for Recommendations

	Given User is on Recommendations Page
	When Select Birthday
	Then Select Gender
	Then Select Location
	Then Select Refinance
	Then Select Vehicle Ownership
	Then Select Family Situation
	Then Enter Number of Children
	Then Select Profession
	Then Select Free Time Options
	Then Select Animals
	Then Enter Salary

Scenario: Register User	And View Recommendations
	When User is on Registration Page
    Then Enter Credentials and Submit
    Then Verify Recommendations Success Message
    And Click View Recommendations
    
    
 Scenario: Select Type of Policy  
    Given User is on Select Policy Type Page
    Then Select Policy Type
    And Select Existing Contract
    
    
 Scenario: Confirm Selection
    Given User is on Final Selection Page
    Then Select Company
    Then Select Nature Of Policy
    Then Confirm Selection
    Then Verify Confirmation Page
    And Navigate to Contracts
       
    
 Scenario: Verify Contract Details
    Given User is on Final Contracts Page
    Then Verify Policy Details "Privathaftpflicht" and "Axa"
    And Complete the Test
   
     
   
