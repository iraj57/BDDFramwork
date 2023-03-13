@CompleteTest
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'irajs64@gmail.com' and password 'Omaha@123'
    And User click on login button
    And User should be logged in into Account
@updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'SSSS' and Phone '5647895489'
    And User click on Update button
    Then User profile information should be updated

	@addAddress
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
    |country|fullName|PhoneNumber|StreetAddress|apt|city|state|zipCode|
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'