Feature: WWC5 US022 Student Information Management
  As an administrator (admin),
  I would like to be able to view online admission applications from the admin panel
  and complete the enrollment of the applicant students.

  Scenario: WWC78 TC_01 -> US022 Verify Online Admission link and search functionality in Student Information
    Given I am logged in as an admin
    When I click on the "Student Information" option in the left sidebar
    Then I should see the "Online Admission" link listed
    When I click on the "Online Admission" link
    Then I should see the "Student List" table with the following  headers (Reference No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Student Mobile Number, Form Status, Enrolled, Created At, Action titles)
    When I enter a student name in the search box and press Enter
    Then I should see only the details of the relevant student in the search results



  Scenario: WWC90 TC_02 -> US022 Test for validating the display of Form Status and Enrollment Status in the Student List
    Given I am logged in as an admin
    When I click on the "Student Information" option in the left sidebar
    And I click on the "Online Admission" link
    Then I should see the "Student List" table
    And for each row in the "Form Status" column:
      | Condition       | Expected Display |
      | Not Submitted   | Not Submitted    |
      | Submitted       | Submitted        |
    And for each row in the "Enrolled" column:
      | Condition            | Expected Display |
      | Enrollment Complete  | check icon       |
      | Enrollment Incomplete| -                |



  Scenario: WWC91 TC_03 -> US022 Test for validating the functionality of deleting applications
    Given I am logged in as an admin
    When I click on the "Student Information" option in the left sidebar
    And I click on the "Online Admission" link
    Then I should see the "Student List" table
    When I click the delete icon under the "Action" column for a specific student
    Then I should see a confirmation dialog
    And I confirm the delete action
    Then the table should update
    And the deleted student should no longer be visible in the list


  Scenario: WWC93 TC_04 -> US022 Test for editing student details and enrolling a student
    Given I am logged in as an admin
    When I click on the "Student Information" option in the left sidebar
    And I click on the "Online Admission" link
    Then I should see the "Student List" table
    When I click the "Edit and Enroll" icon for a specific student
    Then I should see the Online Admission form with pre-filled student details
    And the details should match the student's submitted information
    When I fill out the "Fees Details" section
    Then the total fee should be calculated automatically
    When I click the (+) icon next to the "Fees Details" section
    Then I should see the fee breakdown details
    When I fill out all required fields and click the "Save" button
    Then I should see a confirmation message indicating the save was successful
    When I click the "Save and Enroll" button
    Then the student's enrollment status should change to "Enrolled"



