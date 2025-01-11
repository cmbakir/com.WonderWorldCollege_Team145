Feature: WWC18 US038 As an administrator (teacher) I would like to have a page where I can
         view all my permissions in order to create an online permission record and check
         the permissions I have used

  @cem17
  Scenario:WWC18 TC_01 -> Testing the Ability to Create an Online Leave Record as a Teacher User

    Given The user logs in as a teacher on the relevant Admin login screen using their username and password.
     Then The teacher user clicks on the Human Resource dropdown menu in the sidebar of the panel.
      And The teacher user views the Apply Leave page link under the Human Resource menu.
     Then The teacher user verifies that clicking on the Apply Leave tab navigates to the corresponding page.
      And The teacher user views and clicks the Apply Leave button located at the top right corner of the Apply Leave page.
     Then In the opened Add Details window, the fields Apply Date, Available Leave, Leave From Date, Leave To Date, Reason box, and the Save button should be visible and active.
      And In the Add Details window, the user fills in the required fields, clicks the Save button, and creates a new leave record.


  Scenario:WWC140 TC_02 -> Testing the Ability to Check Leaves as a Teacher User

