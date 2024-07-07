#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Flipkart Automation

  @tag1
  Scenario: Navigate to Flipkart and verify categories, validate carousel, and compare products
    Given I navigate to Flipkart
    Then I fetch all categories visible below the search bar and verify the text
    And I validate the carousel showing offers
    When I select a product and search for it
    Then I open the details page of the product
    And I check the compare checkbox and validate if the compare modal opens
    When I click on the compare modal
    Then I validate the selected device is visible on the compare page
    And I add three more products to the compare page making a total of four products
    Then I fetch ratings and reviews for all four products
