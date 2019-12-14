@TestToRun
Feature: Test Login functionality

  Scenario: Happy path for Login
    Given I am on the newtours website
    When i click on Sign-On link
    And i enter valid Login details as "mPaulA" for Username and "myPaswordA" for password
    And click on Submit button
    Then "Find a Flight: Mercury Tours:" page is displayed

  Scenario: Negative test using invalid Login details
    Given I am on the newtours website
    When i click on Sign-On link
    And i enter Invalid Login details as "mPaulA122330" for Username and "myPaswordA8484949" for password
    And click on Submit button
    Then "Sign-on: Mercury Tours" page is displayed


  Scenario: Happy path for Login and check the image displayed
    Given I am on the newtours website
    When i click on Sign-On link
    And i enter valid Login details as "mPaulA" for Username and "myPaswordA" for password
    And click on Submit button
    Then "Find a Flight: Mercury Tours:" page is displayed
    And the correct image is displayed


