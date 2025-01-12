Feature:WWC12 US048 Functional Test of the Homework Menu in the Student Panel


  Scenario: WWC62 TC_01 -> US048 Functional Test of the Homework Menu in the Student Panel
    Given The user navigates to the relevant URL and logs in.
    Then The user verifies that there is a clickable and visible "Homework" menu title in the sidebar.
    Then clicks the homework menu.
    Then The user tests that the homework in the "Upcoming Homework" section on the opened page are listed under the following headers: Class, Section, Subject, Homework Date, Submission Date, Evaluation Date, Max Marks, Marks Obtained, Note, Status, and Action.
    Then The user tests that the homework details can be accessed and messages can be sent in the "Action" section.
    Then The user tests that a message can be sent from the "Action" section in the "Closed Homework" section.


  Scenario: WWC144 TC_02 -> US048  Functional Test of the Daily Assignment Section of Homework Menu
    Given The user navigates to the relevant URL and logs in.
    Then clicks the homework menu.
    Then The user enters the "Add Daily Assignment" section and verifies that a new window opens after clicking the "Add Daily Assignment" button.
    Then In the opened window, the user clicks the first option in the subject dropdown, enters a title in the title box, clicks the "Save" button, and verifies that the entered assignment appears in the assignment list.
    Then The user clicks the edit button in the "Action" section of the assignment list, enters data in the opened screen, clicks the save button, and updates the assignments.
    Then The user clicks the delete button of the assignment they wish to delete in the "Action" section of the assignment list and verifies the "Successfully deleted" message.
    Then The user views the column fields on the "Daily Assignment List" page.