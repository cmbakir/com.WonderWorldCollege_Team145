Feature: WWC5 US022 Student Information Management
  As an administrator (admin),
  I would like to be able to view online admission applications from the admin panel
  and complete the enrollment of the applicant students.

  Scenario: WWC78 TC_01 -> US022 Verify Online Admission link and search functionality in Student Information
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    Then see the "Online Admission" link listed
    When click on the "Online Admission" link
    Then see the "Student List" table with the following  headers (Reference No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Student Mobile Number, Form Status, Enrolled, Created At, Action titles)
    When  enter a student name in the search box
    Then see only the details of the relevant student in the search results



  Scenario: WWC90 TC_02 -> US022 Test for validating the display of Form Status and Enrollment Status in the Student List
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    And click on the "Online Admission" link
    Then see the "Student List" table
    And for each row in the "Form Status" column:
      | Condition       | Expected Display |
      | Not Submitted   | Not Submitted    |
      | Submitted       | Submitted        |
    And for each row in the "Enrolled" column:
      | Condition            | Expected Display |
      | Enrollment Complete  | check icon       |
      | Enrollment Incomplete| -                |



  Scenario: WWC91 TC_03 -> US022 Test for validating the functionality of deleting applications
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    And click on the "Online Admission" link
    Then see the "Student List" table
    When click the delete icon under the "Action" column for a specific student
    Then see a confirmation dialog
    And confirm the delete action
    Then the table should update
    And the deleted student should no longer be visible in the list


  Scenario: WWC93 TC_04 -> US022 Test for editing student details and enrolling a student
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    And click on the "Online Admission" link
    Then see the "Student List" table
    When click the "Edit and Enroll" icon for a specific student
    Then see the Online Admission form with pre-filled student details
    And the details should match the student's submitted information
    When fill out the "Fees Details" section
    Then the total fee should be calculated automatically
    When click the (+) icon next to the "Fees Details" section
    Then see the fee breakdown details
    When fill out all required fields and click the "Save" button
    Then see a confirmation message indicating the save was successful
    When click the "Save and Enroll" button
    Then the student's enrollment status should change to "Enrolled"



