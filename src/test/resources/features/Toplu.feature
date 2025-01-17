Feature: WWC2 US001 As a user, I must be able to access the website in order to use it

  @paralel1
  Scenario:WWC63 TC_01  Home Page Accessibility Test

    Given The user navigates to the “homePage” address.
    Then  Verifies that the homepage is successfully reached.

Feature: WWC-56 US002 Home page navbar on-site access menu headings access test

  Scenario:WWC-115 US002-TC01  Home page accessibility test

  Scenario: WWC-116 US002-TC02 Latest news functionality test with scrolling text in the home page top bar

    Given The user sees Latest News information as a scrolling text on the top bar of the home page.

  Scenario:WWC-117 US002-TC03 Test of site logo refreshing

    Given The user click on the site logo at the top bar of the home page and  confirm that the home page has been refreshed

  Scenario:WWC-118 US002-TC04 Functional test of menu headings in the home page nav bar

    Given The user verifies that  menu headings  are visible on the top bar of the home page.
    And  The user access these pages

  Scenario: WWC-119 US002-TC05 Functional test of the Academics dropdown menu in the home page top bar

    Given The user verifies the pages in the Academics drop-down menu in the top bar of the home page.
    And  The user access these 8 pages


Feature: WWC-50 US003 User Online Admission Test

  @online
  Scenario: WWC-105 US003 As a user, viewing the Online Admission page and Basic Details and data entry test
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And confirms that it redirects to the Online Admission page
    Then verifies that the school enrollment criteria are displayed in the Instructions section on the page
    Then verifies that the required elements (Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email) are visible in the Basic Details section on the page
    And verifies that And Class, First Name, Gender, Date Of Birth TextBoxes are required fields to enter data
    Then enters random data into Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email textBoxes
    Then uploads a photo to the Student Photo section in Basic Details

  @online
  Scenario: WWC-107 US003 Test to display the Parent Detail window and enter data as a user
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And verifies that the Father Name, Mother Name TextBoxes are visible in the Parent Detail field on the sheet
    Then enters random data in the Father Name, Mother Name TextBoxes in the Parent Detail field

  @online
  Scenario: WWC-108 US003 Test to display the Guardians Details elements and enter data as a user
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And that the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes are visible in the Guardian Details field on the And page
    Then verifies that If Guardian Is, Guardian Name, Guardian Relation TextBoxes in the Guardian Details field are required fields to enter data
    And Verifies that the radio buttons in the If Guardian Is question in the And Guardian Details field are visible and clickable
    Then enters random values in the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes in the Guardian Details field
    Then Guardian uploads photos for Parent in the Details field

  @online
  Scenario: WWC-110 US003 Test to display the elements of Miscellaneous Details and Upload Documents as a user and enter data
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And verifies that the National Identification Number, Previous School Details TextBoxes are visible in the Miscellaneous Details field on the page
    Then enters random values in the National Identification Number, Previous School Details TextBoxes in the Miscellaneous Details field
    And uploads a document to the Upload Documents field

  @online
  Scenario: WWC-111 US003 Test to display the Review Entered Details and Status page as a user
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    Then fills out the form on the page and clicks Submit
    And verifies that the student is redirected to the Review Entered Details and Status page and that a Reference Number has been created on behalf of the student
    Then verifies that the Form Status on the page is Not Submitted and the Application Date is the date the record was created on the Online Admission page
    Then verifies that the I Agree To The Terms And Conditions checkBox on the page is visible and clicks
    And clicks the Submit button on the page and verifies that the message Form Has Been Submitted Successfully...!! appears and the Form Status is Submitted



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
    Then a confirmation dialog box is clicked
    Then the Online Admission form is displayed with pre-filled student details
    Then the "Admission No" field is filled in
    When the "Fee Details" section is completed, it is verified that the total fee is calculated automatically
    When the plus icon next to the "Fee Details" section is clicked
    Then the fee breakdown details are displayed
    When the Save button is clicked
    Then a confirmation message indicating successful saving is displayed
    Then the "Edit and Enroll" icon for a specific student is clicked
    Then a confirmation dialog box is clicked
    When the Save and Enroll button is clicked
    Then it is verified that the student's enrollment status is updated to "Enrolled".



