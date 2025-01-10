Feature:WWC12 US048 Functional Test of the Homework Menu in the Student Panel

  @pinar
  Scenario: WWC62 TC_01 -> US048 Functional Test of the Homework Menu in the Student Panel
    Given The user verifies that there is a clickable and visible "Homework" menu title in the sidebar.
    Then The user tests that the homework in the "Upcoming Homework" section on the opened page are listed under the following headers: Class, Section, Subject, Homework Date, Submission Date, Evaluation Date, Max Marks, Marks Obtained, Note, Status, and Action.
    Then The user tests that the homework details can be accessed and messages can be sent in the "Action" section.
    Then The user tests that a message can be sent from the "Action" section in the "Closed Homework" section.