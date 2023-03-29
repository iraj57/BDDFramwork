@CompleteTest
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'irajs64@gmail.com' and password 'Omaha@1234'
    And User click on login button
    And User should be logged in into Account

	@addAddress
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
    |country|fullName|PhoneNumber|StreetAddress|apt|city|state|zipCode|
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'