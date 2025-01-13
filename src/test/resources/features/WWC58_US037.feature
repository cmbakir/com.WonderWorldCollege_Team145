

Feature: WWC58 US037 As an administrator (teacher), I want to access the attendance record of a class for a particular day.

  Scenario:WWC145  TC01 -> US037 Test of displaying the Period Attendance By Date page link under the Attendance menu title in the sidebar of the Teacher panel and being directed to the Period Attendance By Date page when clicked.


    Given User goes to TeacherLogin address
    Given User enters Teacher username.
    Then  User enters Teacher password.
    Then  User click sign in button.
    Given The user clicks the Attendance dropdawn menu in the sidebar.
    Then The user sees the Period Attendance By Date menu under the Attendance dropdawn menu.
    Then The user clicks the Period Attendance By Date menu under the Attendance dropdawn menu.
    Then The user confirms that they are on the Period Attendance By Date page with the "Select Criteria" title text.

  Scenario: WWC146 TC_02 -> US_037 On the Period Attendance By Date page, in the Select Criteria section, the Class, Section dropdown menus, the Date box and the Search button are visible and tested to be active.

    Given User goes to TeacherLogin address
    Given User enters Teacher username.
    Then  User enters Teacher password.
    Then  User click sign in button.
    Given The user clicks the Attendance dropdawn menu in the sidebar.
    Then The user clicks the Period Attendance By Date menu under the Attendance dropdawn menu.
    Given The user sees the text Class in the Select Criteria section.
    Then The user sees the Class dropdown box in the Select Criteria section.
    And The user tests that the Class dropdown box is active in the Select Criteria section.
    Given The user sees the text Section in the Select Criteria section.
    Then The user sees the Section dropdown menu in the Select Criteria section.
    And The user tests that the Section dropdown is active in the Select Criteria section.
    Given The user sees the text Date in the Select Criteria section.
    Then The user sees the Date box in the Select Criteria section.
    And The user tests that the Date box is active in the Select Criteria section.
    Given The user sees the Search button in the Select Criteria section.
    And The user tests that the Search button in the Select Criteria section is active.

  Scenario:WWC147 TC_03 -> US_037 Test for creating a Student List (with Student and course title) according to the selected criteria and displaying the attendance records of all students.

    Given User goes to TeacherLogin address
    Given User enters Teacher username.
    Then  User enters Teacher password.
    Then  User click sign in button.
    Given The user clicks the Attendance dropdawn menu in the sidebar.
    Then The user clicks the Period Attendance By Date menu under the Attendance dropdawn menu.
    Then user clicks on the Class dropdown menu in the Select Criteria section.
    Then user selects "Class 11" from the class dropdown menu in the Selected Criteria Section.
    Then user clicks on the Section dropdown menu in the Select Criteria section.
    Then user selects "A" from the Section dropdown menu in the Selected Criteria Section.
    Then user clicks on the Date Box menu in the Select Criteria section.
    Then user selects "08/01/2025" from the Date Box menu in the Select Criteria Section.
    Then user clicks the Search Button.
    Then user sees the Student title in the opened Student List.
    Then user sees the Course name "Computer (220)" in the opened Student List.
    And user sees the attendance records of all students.



