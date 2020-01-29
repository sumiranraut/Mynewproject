Feature: Register

Scenario: Register on TestMe App
Given user open TestMe App
When user click signup
And enter user name as "Sumiran96"
And enter first name as "Sumiran"
And enter last name as "Raut"
And enter password as "Sumiran12345"
And enter confirm password as "Sumiran12345"
And select Gender as "Male"
And enter email as "sumiranraut96@gmail.com"
And enter mobile number as "8408913067"
And enter dob as "25-09-1996"
And enter Address as "Wardha"
And enter answer as "Wardha"
Then user click Register

@login
Scenario: Login using datatable
Given user open TestMe App
When user click signin
And user enter credentials as
|lalitha|
|Password123|

@Searchbox
Scenario: Alex search for Headphone
Given user open TestMe App
When user click signin
And user enter credentials as
|lalitha|
|Password123|
And Alex enter in search box
And user click on Find Details
Then user click on Add to cart