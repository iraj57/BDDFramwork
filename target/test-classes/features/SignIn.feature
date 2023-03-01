@CompleteTest
Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @testJenkins
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'irajs64@gmail.com' and password 'Omaha@123'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                     | password  |
      | transformers@tekschool.us | Tek@12345 |
      | irajs64@gmail.com   			| Omaha@123 |

	@registerTest
  Scenario: Verify user can create an acount into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password  | confirmPassword |
      | fullName | email | Omaha@123 | Omaha@123       |
    And User click on SignUp button
    Then User should be logged into account page