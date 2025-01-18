

Feature: WWC2 US001 As a user, I must be able to access the website in order to use it

  @paralel1
  Scenario:WWC63 TC_01->US_001  Home Page Accessibility Test

    Given The user navigates to the “homePage” address.
    Then  Verifies that the homepage is successfully reached.

##Feature: WWC-56 US002 Home page navbar on-site access menu headings access test

  Scenario:WWC-115 US002-TC01  Home page accessibility test
  ## cıkabilir

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


##Feature: WWC-50 US003 User Online Admission Test

  @paralel1
  Scenario: WWC-105 US003 As a user, viewing the Online Admission page and Basic Details and data entry test
    Then click on the Online Admission menu heading in the top bar
    And confirms that it redirects to the Online Admission page
    Then verifies that the school enrollment criteria are displayed in the Instructions section on the page
    Then verifies that the required elements (Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email) are visible in the Basic Details section on the page
    And verifies that And Class, First Name, Gender, Date Of Birth TextBoxes are required fields to enter data
    Then enters random data into Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email textBoxes
    Then uploads a photo to the Student Photo section in Basic Details
  # Kontrol

  @paralel1
  Scenario: WWC-107 US003 Test to display the Parent Detail window and enter data as a user
    And verifies that the Father Name, Mother Name TextBoxes are visible in the Parent Detail field on the sheet
    Then enters random data in the Father Name, Mother Name TextBoxes in the Parent Detail field

  @paralel1
  Scenario: WWC-108 US003 Test to display the Guardians Details elements and enter data as a user
    And that the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes are visible in the Guardian Details field on the And page
    Then verifies that If Guardian Is, Guardian Name, Guardian Relation TextBoxes in the Guardian Details field are required fields to enter data
    And Verifies that the radio buttons in the If Guardian Is question in the And Guardian Details field are visible and clickable
    Then enters random values in the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes in the Guardian Details field
    Then Guardian uploads photos for Parent in the Details field
    #Kontrol

  @paralel1
  Scenario: WWC-110 US003 Test to display the elements of Miscellaneous Details and Upload Documents as a user and enter data
    And verifies that the National Identification Number, Previous School Details TextBoxes are visible in the Miscellaneous Details field on the page
    Then enters random values in the National Identification Number, Previous School Details TextBoxes in the Miscellaneous Details field
    And uploads a document to the Upload Documents field
    #Kontrol

  @paralel1
  Scenario: WWC-111 US003 Test to display the Review Entered Details and Status page as a user
    Then fills out the form on the page and clicks Submit
    And verifies that the student is redirected to the Review Entered Details and Status page and that a Reference Number has been created on behalf of the student
    Then verifies that the Form Status on the page is Not Submitted and the Application Date is the date the record was created on the Online Admission page
    Then verifies that the I Agree To The Terms And Conditions checkBox on the page is visible and clicks
    And clicks the Submit button on the page and verifies that the message Form Has Been Submitted Successfully...!! appears and the Form Status is Submitted



##Feature: WWC5 US022 Student Information Management
  ##As an administrator (admin),
  ##I would like to be able to view online admission applications from the admin panel
  ##and complete the enrollment of the applicant students.

  Scenario: WWC78 TC_01 -> US022 Verify Online Admission link and search functionality in Student Information
    Given logged in as an admin
    When click on the "Student Information" option in the left sidebar
    Then see the "Online Admission" link listed
    When click on the "Online Admission" link
    Then see the "Student List" table with the following  headers (Reference No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Student Mobile Number, Form Status, Enrolled, Created At, Action titles)
    When  enter a student name in the search box
    Then see only the details of the relevant student in the search results

  Scenario: WWC90 TC_02 -> US022 Test for validating the display of Form Status and Enrollment Status in the Student List
    Then see the "Student List" table
    Then see the "Form Status" column
    And the form status should be "Not Submitted" for students who have not submitted the form
    And the form status should be "Submitted" for students who have submitted the form
    And see the "Enrolled" column
    And the enrollment status should display a "check" icon for students whose enrollment is complete
    And the enrollment status should display a "-" icon for students whose enrollment is not complete

  Scenario: WWC91 TC_03 -> US022 Test for validating the functionality of deleting applications

    When click the delete icon under the "Action" column for a specific student
    Then a confirmation dialog box is clicked
    And confirm the delete action

  Scenario: WWC93 TC_04 -> US022 Test for editing student details and enrolling a student

    When click the "Edit and Enroll" icon for a specific student
    # Then a confirmation dialog box is clicked
    Then the Online Admission form is displayed with pre-filled student details
    Then the "Admission No" field is filled in
    When the "Fee Details" section is completed, it is verified that the total fee is calculated automatically
    When the plus icon next to the "Fee Details" section is clicked
    Then the fee breakdown details are displayed
    When the Save button is clicked
    Then a confirmation message indicating successful saving is displayed
    Then the "Edit and Enroll" icon for a specific student is clicked
   # Then a confirmation dialog box is clicked
    When the Save and Enroll button is clicked
    Then it is verified that the student's enrollment status is updated to "Enrolled".



##Feature:WWC35 US044 As a user, I should be able to log in to the Student Panel with the given username and password.


  Scenario: WWC95 TC_01 -> US044 Viewing Test of Student Login Form

    Given The user navigates to the user login page.
    Then The user verify that a login form is viewed on the User Login page.
    Then The user verify that Login Form includes username and password text boxes


  Scenario: WWC96 TC_02 -> Positive Student Login Test with Valid Username And Password

   Then The user enters their username and password correctly and clicks the sign in button
    Then accesses the student home page.

  ## Scenario:WWC99 TC_05 -> Test For Forgot Password Page
  ##  Given The user navigates to the user login page.
  ##  Then The user clicks the forgot password button and verify that the forgot password page opens
  ##  Then The user enters the email to the emailbox of the forgot password page
  ##  Then selects the student radio button and then clicks the submit button
  ##  Then verifies that success message "Please Check Your Email To Recover Your Password" is viewed




  ##Feature: WWC-60 US047 Student dashboard  my profile page viewing and access


  Scenario:WWC-144 US047-TC02 Display test of the box containing student information in the My profile section

    Given On the page that opens, I should be able to see the box consisting of Student's name, Admission No, Role Number, Class, Section, Gender, barcode field

  Scenario:WWC-122 US047-TC03 Display test  top navbar menu  in the My profile page

    Given As a student, I should be able to see that the My Profile page consists of Profile, Exam, and Documents menus in the navbar

  Scenario:WWC-123 US047-TC04 Functionality test of profile menu field

    Given  I should be able to see the relevant fields when I log in to profil as a user

  Scenario:WWC-124 US047-TC05 Functionality test of exam menu field

    Given I should be able to see the relevant fields when I log in to Exam as a user

  Scenario:WWC-125 US047-TC06 Functionality test of document menu field

    Given I should be able to go to the relevant fields when I log in to Documents as a user



##Feature:WWC12 US048 Functional Test of the Homework Menu in the Student Panel


  Scenario: WWC62 TC_01 -> US048 Functional Test of the Homework Menu in the Student Panel

    Then The user verifies that there is a clickable and visible "Homework" menu title in the sidebar.
    Then clicks the homework menu.
    Then The user tests that the homework in the "Upcoming Homework" section on the opened page are listed under the following headers: Class, Section, Subject, Homework Date, Submission Date, Evaluation Date, Max Marks, Marks Obtained, Note, Status, and Action.
    Then The user tests that the homework details can be accessed and messages can be sent in the "Action" section.
    Then The user tests that a message can be sent from the "Action" section in the "Closed Homework" section.

  Scenario: WWC144 TC_02 -> US048  Functional Test of the Daily Assignment Section of Homework Menu
    Given The user navigates to the relevant URL and logs in.
    Then The user enters the "Add Daily Assignment" section and verifies that a new window opens after clicking the "Add Daily Assignment" button.
    Then In the opened window, the user clicks the first option in the subject dropdown, enters a title in the title box, clicks the "Save" button, and verifies that the entered assignment appears in the assignment list.
    Then The user clicks the edit button in the "Action" section of the assignment list, enters data in the opened screen, clicks the save button, and updates the assignments.
    Then The user clicks the delete button of the assignment they wish to delete in the "Action" section of the assignment list and verifies the "Successfully deleted" message.
    Then The user views the column fields on the "Daily Assignment List" page.





##Feature: WWC54 US049 US_049 After logging into the Student Panel as a user,I should be able to access the "Online Exam" page,make changes, and view Exam Details.


  Scenario: WWC148 TC01 -> US049 Test of seeing and clicking the Online Exam menu in the sidebar of the student panel and viewing the titles in the Upcoming Exam that opens.

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

    Given The user sees the View in the Action section of Upcoming Exams.
    Then  Then the user clicks the View in the Action section of Upcoming Exams.
    Then  Then the user sees the fields of the View page that opens and validates the page.

  Scenario: WWC150 TC03 -> US049 User can view the titles in the Closed Exam section of the Online Exam menu.

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

    Then  Then the user clicks the View in the Action section of Closed Exam.
    Then  Then the user sees the fields of the View page opened from the Closed Exam and validates the page.




##Feature:  WWC13 US050 Able to do student Leave

  Scenario: WWC86 TC01->US_050 Test to Verify if Apply Leave Side works and redirecting  leave list page

    Given clicks applyleave button from left side
    And verifies access to leave list page

  Scenario: WWC87 TC02->US_050 Test to verify column fields on the leave list

    Given the user should be displayed column fields
    Given clicks applyleave button from left side
    And verifies access to leave list page
    Given user clicks edit button
    And verifies editbuttonforms is displayed
    And enters any date into fromDatebox
    And enters any date into toDatebox
    Then enters any reason into reasonbox
    Then clicks editSave button
    And verifies edited leave message

 ## Scenario:WWC-92 TC03->US_050 Test to verifying message leave is deleted

   ## Given clicks applyleave button from left side
    ##Given user clicks delete button
    ##And accepts message from alert
    ## And verifies leave is deleted

  Scenario: WWC-94 TC04->US_050 Test to verify add buton is clickable and new leave is added

    Given clicks applyleave button from left side
    Given student  clicks add button
    Then views a new leave table
    And any date into fromdate section
    And any date into toDate section
    And any reason into reason section
    And clicks save button
    And accepts that is saved  from alert



##Feature: WWC42 US051 After logging into the Student Panel as a user, I should be able to access the “Attendance” page and see the Attendance details.

  Scenario: [TC_01->US_051] Verify Attendance menu redirection in the Student panel
    When  The Attendance menu title is displayed in the sidebar of the Student panel
    And   User clicks on the Attendance menu
    Then  User should be redirected to the Attendance page

  Scenario: [TC_02->US_051] Verify attendance records for the selected date

    When  The Attendance menu title is displayed in the sidebar of the Student panel
    And   User clicks on the Attendance menu
    And  The user selects a date from the date picker
    And  The attendance records for the selected date should be displayed

  Scenario: [TC_03->US_051] Verify columns on the Attendance page

    When The Attendance menu title is displayed in the sidebar of the Student panel
    And User clicks on the Attendance menu
    And The user selects a date from the date picker
    And The following column headers should be visible



##Feature:WWC36 US052 After logging into the Student Panel as a user, I should be able to access the Examinations page and see the relevant exams.

  Scenario: WWC101 TC_01 -> US_052 Test of Accessing the Exam Program Page from the Exam Program Link.

    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User sees the Exam Schedule menu in the menu that opens.
    Then  User clicks the Exam Schedule menu.
    And   User verifies that they are on the "https://qa.wonderworldcollege.com/user/examschedule" page.

  Scenario: WWC102 TC_02 -> US_052 Test to make the relevant exam visible in the table when the user filters the exam from the search box.

    ##Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Given The user enters the "mathematik 1" exam that wants to find into the search box.
    Then  The user confirms that the filter has been made with the exam name under the Exam title in the table.

  Scenario:WWC103 TC_03 -> US_052 Tests the Visibility of Column Headers on the Exam Page.

    ##Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Then Kullanici  Exam Schedule  sayfasindaki S.No. basligini görür
    Then  Kullanici  Exam Schedule  sayfasinda ki Exam basligini görür.
    Then  Kullanici  Exam Schedule  sayfasinda ki Description basligini görür
    And  Kullanici, Exam Schedule  sayfasinda ki Action basligini görür

  Scenario: WWC104 TC_04 -> US_052 Testing User's Access to "View" Option.

    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Then  Kullanici  Exam Schedule  sayfasinda Actionun altinda ki  View i gorur.
    And   Kullanici  Exam Schedule  sayfasinda Actionun altinda ki  View’in erisilebilir oldugunu dogrular.

  Scenario: WWC106 TC_05 -> US_052 Verification Test for Visibility of Column Headings on the Exam Detail Page.

    Given The user clicks View under Action on the Exam Schedule page.
    Then The user verifies that the opened section is the exam detail section.
    Then the user verifies the exam details table headers



##Feature: WWC49 US53 Teacher Review Verify

  Scenario: WWC130 TC01 ->US53 I should be able to see the “Teacher Reviews” header text after logging in to the Teacher Reviews Page as a user

    Then  The user clicks the "Teacher Review" icon.
    Then  It is verified that the "Teacher Reviews" header text is displayed.

  Scenario: WWC131 TC02 ->US53 The user should be able to see teacher details in the Teacher Reviews section and leave a review.

    Given The user navigates to the Teacher Reviews page
    Then Rate button click
    Then After voting, find and click a button such as "Save" or "Submit" to save the vote.
    Then After confirming that the results are correct, end the test and close the page.




##Feature: WWC11 US33 Examination Group Creating Test

  Scenario: WWC43 TC01->US_033 Test to verify Examination Test Bar,Page For Students

    Given  user clicks "adminAndTeacherLogin"
    Then   enters user name
    And    enters password
    Then   click signIn button
    Then   verifies examinations  test bar is visible

  Scenario: WWC79 TC02->US_033 Verifying Name,Save button, Description textBoxes and Exam Type dropdown menu is visible

    Then   verifies examinations  test bar is visible
    And user clicks Examinations bar
    And  user clicks examGroup bar
    And    verifies redirecting examGroupPage
    And    verifies namesection
    And    verifies ExamTypeDropDownMenu
    Then   verifies description area
    And    verifies save button

  Scenario: WWC80 TC03->US_033 Test to verify New Exam Group

    Then   verifies examinations  test bar is visible

    And user clicks Examinations bar
    And  user clicks examGroup bar
    And    verifies redirecting examGroupPage
    And    verifies namesection
    And    verifies ExamTypeDropDownMenu
    Then   verifies description area
    And    verifies save button

  Scenario: WWC81 TC04->US_033 Test to verify Created New and all Exam Group are visible on the list

    Then   verifies examinations  test bar is visible

    And user clicks Examinations bar
    And  user clicks examGroup bar
    And    verifies redirecting examGroupPage
    And    verifies namesection
    And    verifies ExamTypeDropDownMenu
    Then   verifies description area
    And    verifies save button

    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group

  Scenario: WWC82 TC05->US_033 Test to verify if add exam(+) button works

    Then   verifies examinations  test bar is visible

    And user clicks Examinations bar
    And  user clicks examGroup bar
    And    verifies redirecting examGroupPage
    And    verifies namesection
    And    verifies ExamTypeDropDownMenu
    Then   verifies description area
    And    verifies save button

    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group
    # TC05

    Given user clicks add button  under action buttons
    And verify redirected Exam List Page

  Scenario: WWC83 TC06->US_033 Test to Edit exam group list is edited after entered new updates

  Scenario: WWC82 TC05->US_033 Test to verify if add exam(+) button works
   # TC01
    Then   verifies examinations  test bar is visible

 # TC02
    And user clicks Examinations bar
    And  user clicks examGroup bar
    And    verifies redirecting examGroupPage
    And    verifies namesection
    And    verifies ExamTypeDropDownMenu
    Then   verifies description area
    And    verifies save button

   # TC03 ve TC04
    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group
    # TC05

    Given user clicks add button  under action buttons
    And verify redirected Exam List Page

    # TC06
    Given user clicks edit button under actions buton
    Then user enters new name
    Then selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group


  Scenario: WWC84 TC07->US_033 Testing if The relevant exam group is deleted

       # TC01
    Then   verifies examinations  test bar is visible

 # TC02
    And user clicks Examinations bar
    And  user clicks examGroup bar
    And    verifies redirecting examGroupPage
    And    verifies namesection
    And    verifies ExamTypeDropDownMenu
    Then   verifies description area
    And    verifies save button

   # TC03 ve TC04
    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group
    # TC05

    Given user clicks add button  under action buttons
    And verify redirected Exam List Page

    # TC06
    Given user clicks edit button under actions buton
    Then user enters new name
    Then selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group

      # TC07
    Given User clicks delete button under action section
    And confirm deleted exam group




##Feature: WWC58 US037 As an administrator (teacher), I want to access the attendance record of a class for a particular day.

  Scenario:WWC145  TC01 -> US037 Test of displaying the Period Attendance By Date page link under the Attendance menu title in the sidebar of the Teacher panel and being directed to the Period Attendance By Date page when clicked.

    Given The user clicks the Attendance dropdawn menu in the sidebar.
    Then The user sees the Period Attendance By Date menu under the Attendance dropdawn menu.
    Then The user clicks the Period Attendance By Date menu under the Attendance dropdawn menu.
    Then The user confirms that they are on the Period Attendance By Date page with the "Select Criteria" title text.

  Scenario: WWC146 TC_02 -> US_037 On the Period Attendance By Date page, in the Select Criteria section, the Class, Section dropdown menus, the Date box and the Search button are visible and tested to be active.

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

   ## Then The user clicks the Period Attendance By Date menu under the Attendance dropdawn menu.
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



##Feature: WWC18 US038 As an administrator (teacher) I would like to have a page where I can
  ##view all my permissions in order to create an online permission record and check
  ##the permissions I have used


  Scenario:WWC65 TC_01 -> Testing the Ability to Create an Online Leave Record as a Teacher User

    Then The teacher user clicks on the Human Resource dropdown menu in the sidebar of the panel.
    And The teacher user views the Apply Leave page link under the Human Resource menu.
    Then The teacher user verifies that clicking on the Apply Leave tab navigates to the corresponding page.
    And The teacher user views and clicks the Apply Leave button located at the top right corner of the Apply Leave page.
    Then In the opened Add Details window, the fields Apply Date, Available Leave, Leave From Date, Leave To Date, Reason box, and the Save button should be visible and active.
    And In the Add Details window, the user fills in the required fields, clicks the Save button, and creates a new leave record.


  Scenario:WWC140 TC_02 -> Testing the Ability to Check Leaves as a Teacher User

    And The teacher user views the Apply Leave page link under the Human Resource menu.
    Then The teacher user verifies that clicking on the Apply Leave tab navigates to the corresponding page.
    When All created leave records are displayed in the Leaves List with the headings Staff, Leave Type, Leave Date, Days, Apply Date, Status, and Action.
    Then It is verified that the status of the leave record is displayed under the Status heading in the Leaves List.
    And Under the Action heading in the Leaves List, the delete icon is displayed for leave records with a status of pending.
    Then the icon under the Action heading is clicked, the corresponding record is deleted.
    And The details window of the selected leave record can be accessed by clicking the view icon under the Action heading.




##Feature: As an administrator (teacher), I would like to have a feature where I can send a notification email to everyone registered in the school system.

  Scenario: [TC_01->US_039] Verify Attendance menu redirection in the Student panel

    ## When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    When The teacher clicks on the "Send Email" link
    Then The page is redirected to the Send Email page with a URL containing "Send Email"

  Scenario: [TC_02->US_039]  Verify visibility and functionality of Email Template dropdown and text boxes

    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable


  Scenario: [TC_03->US_039]  User selects options inside the message box

    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked

  Scenario: [TC_04->US_039] User removes selected options from the message box

    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And The user removes the selected options

  Scenario: [TC_05->US_039]  Verify visibility and functionality of Email Template dropdown and text boxes

    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And The user clicks on the submit button
    And The user submits the message and verifies successful delivery


  Scenario: [TC_07->US_039]  Selecting the Message Sending Mode

    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And  The user selects the Schedule option and sets a future date
    And The user clicks on the submit button
    And The user submits the message and verifies successful delivery

  Scenario: [TC_08->US_039]  Sending a Message to Selected Recipients

    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The message should be sent to the specified recipients
    And  The user selects the Schedule option and sets a future date
    And The user clicks on the submit button
    And The user submits the message and verifies successful delivery




##Feature: WWC48  US_040 As an administrator (teacher) I would like to have a page where I can prepare homework for students and assign it to them.

  Scenario: WWC190 TC01 -> US040 The "Add Homework" page link should appear under the Homework menu title and be directed to the correct page when clicked.

    Then  Click on Add Homework Link
    Then  Verify Redirect


  Scenario: WWC112-113  TC02&TC03 -> US40 The Class, Section, Subject Group, Subject drop-down menus and the Search button in the Select Criteria section on the Assignment page should be visible and active.

    Then  Class Dropdown Menu Control
    Then  Section Dropdown Menu Control
    Then  Subject Group Dropdown Menu Control
    Then  Subject Dropdown Menu Control
    Then  Search Button Control

  Scenario: WWC114 TC04 -> US040 In the Evaluate Homework window, a note should be written to the student and the Save button should be clicked to save it.
    Given Go to Homework List
    Then Click on the icon to access and delete the Assignment List
    Then Continue to complete the deletion process


  Scenario: WWC128 TC07 -> US040 When the Add button is clicked, the Assignment Add Class, Section, Subject Group, Topic, Assignment Date, Due Date, Maximum Points, Description Boxes and the Save button should be visible and functional.
    Given Go to HomeWork icon
    Then Add Homework click
    Then Add+ icon click
    Then Fill in the relevant fields Class, Section, Course Group, Lesson, Assignment Date, Due Date, Maximum Points and Description and save.
    Then Verify and close the page

  Scenario: wwc129 TC08 -> US040 Once the data is entered and the Save button is clicked, a new assignment record should open.

    Then Upcoming Homework and Closed Homework visibility verification
    Then Closed Homework in all deleted


  Scenario: WWC127 TC06 -> US040 The assignment record should be deleted by clicking the delete icon under the Action heading in the Assignment List.
    Given Go to Homework List
    Then  Click on the icon to access and delete the Assignment List
    Then  Continue to complete the deletion process
    Then click logout


##Feature: WWC31 US054 Parent Login Test

  Scenario:WWC75 TC 02 -> US054 WWC Parent Login page test

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters username.
    Then  User enters password.
    Then  User clicks sign in button.
    Then  User confirms login.



##Feature:WWC29 US056 Username Change Test for a Parent User

  Scenario: WWC61 TC_01 -> US056 Positive Username Change Test for a Parent User
    Given The user navigates to the parent “homePage” address.
    Then The user views the "Change Password" button from the profile image.
    Then The user clicks the "Change Username" button and accesses the relevant page.
    Then The user enters the correct username combination and verifies that the message "Username has been changed successfully" is received.



##Feature:WWC8 US057 Test for Viewing the Details of the 'My Profile' Menu

  Scenario: WWC64 TC_01 -> US057 Test for Viewing the Details of the 'My Profile' Menu
    Given The user navigates to the parent “homePage” address.
    Then The user accesses the "My Profile" page.
    Then The user views the fields for Student's Name, Admission No, Class, Section, and Gender on this page.
    Then The user verifies that the Profile, Fees, Exam, and Documents sections and their functions are visible.
    Then The user verifies that the Profile, Fees, Exam, and Documents sections are clickable, and the relevant fields are visible.

























