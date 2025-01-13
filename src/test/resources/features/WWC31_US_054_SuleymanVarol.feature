

Feature: WWC31 US054 Parent Login Test

  Scenario:WWC74 TC 01 -> US054 WWC Parent Login page Form visibility test

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Then  The username and password form on the User Login page should be visible.
    Then  The Sign In button on the User Login page should be visible.
    Then  The Username and password boxes should be on the User Login page.


  Scenario:WWC75 TC 02 -> US054 WWC Parent Login page test

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters username.
    Then  User enters password.
    Then  User clicks sign in button.
    Then  User confirms login.


  Scenario:WWC76 TC 03 -> US054 WWC Parent Login page negativ test


    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters wrong username.
    Then  User enters correckt password.
    Then  User clicks sign in button.
    And   User sees "Invalid Username Or Password" warning message.
    Given User enters correckt username.
    Then  User enters wrong password.
    Then  User clicks sign in button.
    And   User sees "Invalid Username Or Password" warning message.
    Given User enters wrong username.
    Then  User enters wrong password.
    Then  User clicks sign in button.
    And   User sees "Invalid Username Or Password" warning message.


  Scenario: WWC77 TC 04 -> US054 WWC Parent Forgot Password activation test

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Then  The user clicks on the Forgot Password text on the login page.
    Then  The user sees the Forgot Password text on the form on the page that opens.

