

Feature: WWC54 US049 US_049 After logging into the Student Panel as a user,I should be able to access the "Online Exam" page,make changes, and view Exam Details.


  Scenario: WWC148 TC01 -> US049 Test of seeing and clicking the Online Exam menu in the sidebar of the student panel and viewing the titles in the Upcoming Exam that opens.



    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Given The user sees the Online Exam menu title in the sidebar of the Student panel.
    Then  The user clicks the Online Exam menu in the sidebar of the Student panel.
    Then  The user sees the text "Online Exam" on the page that opens.
    Then  The user confirms with the title text that the active section is Upcoming Exam.
    Then  The user sees the Exam title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Quiz title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Date From title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Date To title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Duration title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Total Attempt title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Attempted title in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Status heading in the Upcoming Exams section of the Online Exam page.
    Then  The user sees the Action heading in the Upcoming Exams section of the Online Exam page.



  Scenario: WWC149 TC02 -> US049 Test of being able to view and click on the "View" button in the Action section of Upcoming Exams and see the fields on the page that opens.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Then  The user clicks the Online Exam menu in the sidebar of the Student panel.
    Given The user sees the View in the Action section of Upcoming Exams.
    Then  Then the user clicks the View in the Action section of Upcoming Exams.
    Then  Then the user sees the fields of the View page that opens and validates the page.


  Scenario: WWC150 TC03 -> US049 User can view the titles in the Closed Exam section of the Online Exam menu.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Then  The user clicks the Online Exam menu in the sidebar of the Student panel.
    Then  The user clicks on the Closed Exam section on the Online Exam page.
    Then  The user confirms with the title text that the active section is Closed Exam.
    Then  The user sees the Exam title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Quiz title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Date From title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Date To title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Duration title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Total Attempt title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Attempted title in the Closed Exam section of the Online Exam page.
    Then  The user sees the Status heading in the Closed Exam section of the Online Exam page.
    Then  The user sees the Action heading in the Closed Exam section of the Online Exam page.


  Scenario: WWC151 TC04 -> US049 Test of being able to view and click on the "View" button in the Action section of Closed Exam and see the fields on the page that opens.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Then  The user clicks the Online Exam menu in the sidebar of the Student panel.
    Then  The user clicks on the Closed Exam section on the Online Exam page.
    Given The user sees the View in the Action section of Closed Exam.
    Then  Then the user clicks the View in the Action section of Closed Exam.
    Then  Then the user sees the fields of the View page opened from the Closed Exam and validates the page.
