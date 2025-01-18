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
    Then see the "Form Status" column
    And the form status should be "Not Submitted" for students who have not submitted the form
    And the form status should be "Submitted" for students who have submitted the form
    And see the "Enrolled" column
    And the enrollment status should display a "check" icon for students whose enrollment is complete
    And the enrollment status should display a "-" icon for students whose enrollment is not complete



  Scenario: WWC91 TC_03 -> US022 Test for validating the functionality of deleting applications
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    And click on the "Online Admission" link
    Then see the "Student List" table
    When click the delete icon under the "Action" column for a specific student
    Then a confirmation dialog box is clicked
    And confirm the delete action


  Scenario: WWC93 TC_04 -> US022 Test for editing student details and enrolling a student
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    And click on the "Online Admission" link
    Then see the "Student List" table
    When click the "Edit and Enroll" icon for a specific student
    Then the Online Admission form is displayed with pre-filled student details
    Then the "Admission No" field is filled in
    When the "Fee Details" section is completed, it is verified that the total fee is calculated automatically
    When the plus icon next to the "Fee Details" section is clicked
    Then the fee breakdown details are displayed
    When the Save button is clicked
    Then a confirmation message indicating successful saving is displayed
    Then the "Edit and Enroll" icon for a specific student is clicked
    When the Save and Enroll button is clicked
    Then it is verified that the student's enrollment status is updated to "Enrolled".



