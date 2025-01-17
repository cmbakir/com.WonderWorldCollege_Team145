Feature: WWC48  US_040 As an administrator (teacher) I would like to have a page where I can prepare homework for students and assign it to them.

  Scenario: WWC190 TC01 -> US040 The "Add Homework" page link should appear under the Homework menu title and be directed to the correct page when clicked.

    Given Go to "TeacherHomeUrl"
    Then  Click on Add Homework Link
    Then  Verify Redirect


 Scenario: WWC112-113  TC02&TC03 -> US40 The Class, Section, Subject Group, Subject drop-down menus and the Search button in the Select Criteria section on the Assignment page should be visible and active.

   Given Go to HomeWork
   Then  Class Dropdown Menu Control
   Then  Section Dropdown Menu Control
   Then  Subject Group Dropdown Menu Control
   Then  Subject Dropdown Menu Control
   Then  Search Button Control

  Scenario: WWC114 TC04 -> US040 In the Evaluate Homework window, a note should be written to the student and the Save button should be clicked to save it.
        Given Go to Homework List
        Then Click on the icon to access and delete the Assignment List
        Then Continue to complete the deletion process


  Scenario: WWW126 TC05 ->US040 When you click the edit icon under the Action heading in the Assignment List, your assignment should be editable and re-saveable in the Edit Assignment window that opens.
    Given Access to Homework List
    Then Click on the edit icon
    Then Edit Homework
    Then Click on the save button
    Then Verify that you are registered

    Scenario: WWC127 TC06 -> US040 The assignment record should be deleted by clicking the delete icon under the Action heading in the Assignment List.
      Given Go to Homework List
      Then  Click on the icon to access and delete the Assignment List
      Then  Continue to complete the deletion process


      Scenario: WWC128 TC07 -> US040 When the Add button is clicked, the Assignment Add Class, Section, Subject Group, Topic, Assignment Date, Due Date, Maximum Points, Description Boxes and the Save button should be visible and functional.
        Given Go to HomeWork icon
        Then Add Homework click
        Then Add+ icon click
        Then Fill in the relevant fields Class, Section, Course Group, Lesson, Assignment Date, Due Date, Maximum Points and Description and save.
        Then Verify and close the page

        Scenario: wwc129 TC08 -> US040 Once the data is entered and the Save button is clicked, a new assignment record should open.
          Given Go to WWC
          Then Upcoming Homework and Closed Homework visibility verification
          Then Closed Homework in all deleted
