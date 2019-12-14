@TestToRun
Feature: As i new user i should be able to successfully register on the newtours website

  Scenario: Test that User's  firstname, last name and Username are shown on the confirmation page after registration
    Given I am on the newtours website
    When I click on the signup link
    And enter my firstname as "lateef", lastname as "abdul", Username as "latAbdul", password as "password", phoneNumber as "07123456789" and email as "latAbdul@yahoo.com"
    And select "UNITED KINGDOM" as country
    And clicks submit button
    Then the "lateef", "abdul" and "latAbdul" are displayed on the confirmation page


  Scenario Outline: Test that User's  firstname, last name and Username are shown on the confirmation page after registration -Using selectBYVisibleText
    Given I am on the newtours website
    When I click on the signup link
    And enter my "<firstName>", "<lastName>", "<userName>", "<password>", "<phoneNumber>" and "<emailAddress>"
    And select "UNITED KINGDOM" as country
    And clicks submit button
    Then the "<firstName>", "<lastName>" and "<userName>" are displayed on the confirmation page
    Examples:
      | firstName | lastName   | userName | password    | phoneNumber | emailAddress       |
      | mirenA    | PaulA      | mPaulA   | myPaswordA  | 07866463848 | mPaulA@gmail.com   |
      | Toyin     | Andrew     | tAndrew  | ThePassword | 07666473838 | tAndrew@yahoo.com  |
      | Adisa     | Abdulsalam | aAbdulsa | ookPassword | 07666233338 | aAbdulsa@yahoo.com |

  Scenario Outline: Test that User's  firstname, last name and Username are shown on the confirmation page after registration Using selectbyIndex
    Given I am on the newtours website
    When I click on the signup link
    And enter my "<firstName>", "<lastName>", "<userName>", "<password>", "<phoneNumber>" and "<emailAddress>"
    And select country number 6
    And clicks submit button
    Then the "<firstName>", "<lastName>" and "<userName>" are displayed on the confirmation page
    Examples:
      | firstName | lastName | userName | password   | phoneNumber | emailAddress     |
      | mirenA    | PaulA    | mPaulA   | myPaswordA | 07866463848 | mPaulA@gmail.com |
#      | Toyin     | Andrew     | tAndrew  | ThePassword | 07666473838 | tAndrew@yahoo.com  |
#      | Adisa     | Abdulsalam | aAbdulsa | ookPassword | 07666233338 | aAbdulsa@yahoo.com |


  Scenario Outline: Test that User's  firstname, last name and Username are shown on the confirmation page after registration and check the correct image is displayed
    Given I am on the newtours website
    When I click on the signup link
    And enter my "<firstName>", "<lastName>", "<userName>", "<password>", "<phoneNumber>" and "<emailAddress>"
    And select country number 6
    And clicks submit button
#    Then the "<firstName>", "<lastName>" and "<userName>" are displayed on the confirmation page
    Then the "<firstName>", "<lastName>" and "<userName>" are displayed on the confirmation page with the correct image
  @dev
    Examples:
      | firstName | lastName | userName | password   | phoneNumber | emailAddress     |
      | mirenA    | PaulA    | mPaulA   | myPaswordA | 07866463848 | mPaulA@gmail.com |
  @Production
    Examples:
      | firstName | lastName | userName  | password      | phoneNumber | emailAddress         |
      | mirenProd | Paulprod | mPaulProd | myPaswordProd | 07866463848 | mPaulAProd@gmail.com |


  Scenario Outline: Test that User's  firstname, last name and Username are shown on the confirmation page after registration Using selectbyIndex and Uisng Unique email address each time
    Given I am on the newtours website
    When I click on the signup link
#    And enter my "<firstName>", "<lastName>", "<userName>", "<password>", "<phoneNumber>" and "<emailAddress>"
    And enter my "<firstName>", "<lastName>", "<userName>", "<password>", "<phoneNumber>" and unique "<emailAddress>"
    And select country number 6
    And clicks submit button
    Then the "<firstName>", "<lastName>" and "<userName>" are displayed on the confirmation page
    Examples:
      | firstName | lastName | userName | password   | phoneNumber | emailAddress     |
      | mirenA    | PaulA    | mPaulA   | myPaswordA | 07866463848 | mPaulA@gmail.com |
      | mirenAb  | Paulb    | mPaulb   | myPaswordb | 07866463848 | mPaulA@gmail.com |
      | mirer    | Paulr    | mPaulr   | myPaswordr | 07866463848 | mPaulA@gmail.com |