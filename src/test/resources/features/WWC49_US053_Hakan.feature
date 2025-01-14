Feature: WWC49 US53 Teacher Review Verify

Scenario: WWC130 TC01 ->US53 I should be able to see the “Teacher Reviews” header text after logging in to the Teacher Reviews Page as a user

  Given The user goes to the "studentLogin" page.
  Then  The user enters their username and password.
  Then  The user clicks the "Teacher Review" icon.
  Then  It is verified that the "Teacher Reviews" header text is displayed.

Scenario: WWC131 TC02 ->US53 The user should be able to see teacher details in the Teacher Reviews section and leave a review.

 Given The user navigates to the Teacher Reviews page
  Then Rate button click
  Then After voting, find and click a button such as "Save" or "Submit" to save the vote.
  Then After confirming that the results are correct, end the test and close the page.




