Feature: WWC18 US038 As an administrator (teacher) I would like to have a page where I can
         view all my permissions in order to create an online permission record and check
         the permissions I have used

  @@paralel2
  Scenario:WWC65 TC_01 -> Testing the Ability to Create an Online Leave Record as a Teacher User

    Given The user logs in as a teacher on the relevant Admin login screen using their username and password.
     Then The teacher user clicks on the Human Resource dropdown menu in the sidebar of the panel.
      And The teacher user views the Apply Leave page link under the Human Resource menu.
     Then The teacher user verifies that clicking on the Apply Leave tab navigates to the corresponding page.
      And The teacher user views and clicks the Apply Leave button located at the top right corner of the Apply Leave page.
     Then In the opened Add Details window, the fields Apply Date, Available Leave, Leave From Date, Leave To Date, Reason box, and the Save button should be visible and active.
      And In the Add Details window, the user fills in the required fields, clicks the Save button, and creates a new leave record.


  Scenario:WWC140 TC_02 -> Testing the Ability to Check Leaves as a Teacher User

    Given The user logs in as a teacher on the relevant Admin login screen using their username and password.
    Then The teacher user clicks on the Human Resource dropdown menu in the sidebar of the panel.
    And The teacher user views the Apply Leave page link under the Human Resource menu.
    Then The teacher user verifies that clicking on the Apply Leave tab navigates to the corresponding page.
    When All created leave records are displayed in the Leaves List with the headings Staff, Leave Type, Leave Date, Days, Apply Date, Status, and Action.
    Then It is verified that the status of the leave record is displayed under the Status heading in the Leaves List.
    And Under the Action heading in the Leaves List, the delete icon is displayed for leave records with a status of pending.
    Then the icon under the Action heading is clicked, the corresponding record is deleted.
    And The details window of the selected leave record can be accessed by clicking the view icon under the Action heading.
