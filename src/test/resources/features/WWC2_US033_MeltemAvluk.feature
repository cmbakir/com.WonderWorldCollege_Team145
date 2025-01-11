
  Feature: WWC Sinav Group Olusturma Testi
    @meltem1
    Scenario: [TC01]->US_033] Test to verify Examination Test Bar,Page For Students

      Given  user clicks "adminAndTeacherLogin"
      Then   enters user name
      And    enters password
      Then   click signIn button
      Then   verifies examinations  test bar is visible


    @meltem1
      Scenario: [TC02]->US_033] Verifying Name,Save button, Description textBoxes and Exam Type dropdown menu is visible
      Given  user clicks "adminAndTeacherLogin"
      Then   enters user name
      And    enters password
      Then   click signIn button
      Then   verifies examinations  test bar is visible
      And user clicks Examinations bar
        And  user clicks examGroup bar
        And    verifies redirecting examGroupPage
        And    verifies namesection
        And    verifies ExamTypeDropDownMenu
        Then   verifies description area
        And    verifies save button



