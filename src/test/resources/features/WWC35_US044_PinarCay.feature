Feature:WWC35 US044 As a user, I should be able to log in to the Student Panel with the given username and password.


  Scenario: WWC95 TC_01 -> US044 Viewing Test of Student Login Form

    Given The user navigates to the user login page.
    Then The user verify that a login form is viewed on the User Login page.
    Then The user verify that Login Form includes username and password text boxes


  Scenario: WWC96 TC_02 -> Positive Student Login Test with Valid Username And Password

    Given The user navigates to the user login page.
    Then The user enters their username and password correctly and clicks the sign in button
    Then accesses the student home page.


  Scenario: WWC97 TC_03 -> Negative Student Login Test with Invalid Username
    Given The user navigates to the user login page.
    Then The user enters an invalid username and valid password and clicks the sign in button
    Then Verifies that the error message “Invalid Username Or Password” is displayed.


  Scenario: WWC98 TC_04 -> Negative Student Login Test with Invalid Password
    Given The user navigates to the user login page.
    Then The user enters a valid username and an invalid password and clicks the sign in button
    Then Verifies that the error message “Invalid Username Or Password” is displayed.

  @login
  Scenario:WWC99 TC_05 -> Test For Forgot Password Page
    Given The user navigates to the user login page.
    Then The user clicks the forgot password button and verify that the forgot password page opens
    Then The user enters the email to the emailbox of the forgot password page
    Then selects the student radio button and then clicks the submit button
    Then verifies that success message "Please Check Your Email To Recover Your Password" is viewed



