$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Recommendation.feature");
formatter.feature({
  "line": 1,
  "name": "Get the Requirements",
  "description": "",
  "id": "get-the-requirements",
  "keyword": "Feature"
});
formatter.before({
  "duration": 63500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Navigate to Requirements Page",
  "description": "",
  "id": "get-the-requirements;navigate-to-requirements-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on landing Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Accept the Cookies",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Bedarf",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageSteps.user_is_on_landingPage()"
});
formatter.result({
  "duration": 7699979700,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.accept_cookies()"
});
formatter.result({
  "duration": 568368400,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.navigate_to_Bedarf()"
});
formatter.result({
  "duration": 675073200,
  "status": "passed"
});
formatter.after({
  "duration": 22300,
  "status": "passed"
});
formatter.before({
  "duration": 53600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Gather User details for Recommendations",
  "description": "",
  "id": "get-the-requirements;gather-user-details-for-recommendations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on Recommendations Page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select Birthday",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select Gender",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select Location",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Select Refinance",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Select Vehicle Ownership",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Select Family Situation",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Enter Number of Children",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Select Profession",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Select Free Time Options",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Select Animals",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter Salary",
  "keyword": "Then "
});
formatter.match({
  "location": "RecommendationPageSteps.user_is_on_Recommendation_Page()"
});
formatter.result({
  "duration": 6472000,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_birthday()"
});
formatter.result({
  "duration": 1656831100,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_gender()"
});
formatter.result({
  "duration": 405730500,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_location()"
});
formatter.result({
  "duration": 437878600,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_refinance()"
});
formatter.result({
  "duration": 426365600,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_vehicle_ownerShip()"
});
formatter.result({
  "duration": 466758400,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_family_situation()"
});
formatter.result({
  "duration": 843913600,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.enter_number_of_children()"
});
formatter.result({
  "duration": 640965900,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_profession()"
});
formatter.result({
  "duration": 782685500,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_free_time_options()"
});
formatter.result({
  "duration": 472655200,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.select_animals()"
});
formatter.result({
  "duration": 517924200,
  "status": "passed"
});
formatter.match({
  "location": "RecommendationPageSteps.enterSalary()"
});
formatter.result({
  "duration": 3254887100,
  "status": "passed"
});
formatter.after({
  "duration": 12400,
  "status": "passed"
});
formatter.before({
  "duration": 20600,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Register User\tAnd View Recommendations",
  "description": "",
  "id": "get-the-requirements;register-user-and-view-recommendations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User is on Registration Page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Enter Credentials and Submit",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Verify Recommendations Message",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Click View Recommendations",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterUserPageSteps.check_user_on_registerPage()"
});
formatter.result({
  "duration": 26083100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserPageSteps.enter_credentials()"
});
formatter.result({
  "duration": 273834300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserPageSteps.verify_reco_message()"
});
formatter.result({
  "duration": 1282110300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserPageSteps.click_view_recos()"
});
formatter.result({
  "duration": 101422100,
  "status": "passed"
});
formatter.after({
  "duration": 11100,
  "status": "passed"
});
formatter.before({
  "duration": 91700,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Select Type of Policy",
  "description": "",
  "id": "get-the-requirements;select-type-of-policy",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "User is on Select Policy Type Page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Select Policy Type",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Select Existing Contract",
  "keyword": "And "
});
formatter.match({
  "location": "SelectPolicyPageSteps.user_is_on_Select_recos_page()"
});
formatter.result({
  "duration": 1773341200,
  "status": "passed"
});
formatter.match({
  "location": "SelectPolicyPageSteps.select_policy()"
});
formatter.result({
  "duration": 314555900,
  "status": "passed"
});
formatter.match({
  "location": "SelectPolicyPageSteps.select_existing_contract()"
});
formatter.result({
  "duration": 538305400,
  "status": "passed"
});
formatter.after({
  "duration": 15200,
  "status": "passed"
});
formatter.before({
  "duration": 26300,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Confirm Selection",
  "description": "",
  "id": "get-the-requirements;confirm-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "User is on Final Selection Page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Select Multiple Policies",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Confirm Selection",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Verify Confirmation Page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Navigate to Contracts",
  "keyword": "And "
});
formatter.match({
  "location": "ConfirmSelectionPageSteps.user_is_confirm_policy_page()"
});
formatter.result({
  "duration": 969047600,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmSelectionPageSteps.select_multiple_policies()"
});
formatter.result({
  "duration": 638382000,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmSelectionPageSteps.confirm_selection()"
});
formatter.result({
  "duration": 54671200,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmSelectionPageSteps.verify_confirmation_page()"
});
formatter.result({
  "duration": 601112000,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmSelectionPageSteps.vnavigate_to_contracts()"
});
formatter.result({
  "duration": 48482100,
  "status": "passed"
});
formatter.after({
  "duration": 9500,
  "status": "passed"
});
formatter.before({
  "duration": 16600,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Verify Contract Details",
  "description": "",
  "id": "get-the-requirements;verify-contract-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "User is on Final Contracts Page",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Verify the Contract Details",
  "keyword": "Then "
});
formatter.match({
  "location": "FinalContractPageSteps.verify_user_is_on_contracts_page()"
});
formatter.result({
  "duration": 510850300,
  "status": "passed"
});
formatter.match({
  "location": "FinalContractPageSteps.verify_contract_details()"
});
formatter.result({
  "duration": 1623313300,
  "status": "passed"
});
formatter.after({
  "duration": 8300,
  "status": "passed"
});
});