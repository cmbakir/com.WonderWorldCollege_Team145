Feature:WWC29 US056 Username Change Test for a Parent User

  @change
  Scenario: WWC61 TC_01 -> US056 Positive Username Change Test for a Parent User
    Given The user navigates to the parent “homePage” address.
    Then The user views the "Change Password" button from the profile image.
    Then The user clicks the "Change Username" button and accesses the relevant page.
    Then The user enters the correct username combination and verifies that the message "Username has been changed successfully" is received.


  Scenario: WWC152 TC_02 -> US056 Negative Username Change Test for a Parent User
    Given The user navigates to the parent “homePage” address.
    Then The user views the "Change Password" button from the profile image.
    Then The user clicks the "Change Username" button and accesses the relevant page.
    Then The user enters a username combination with fewer than 5 characters and verifies that the following warning message is received: "Username must contain a minimum of 5 characters."
