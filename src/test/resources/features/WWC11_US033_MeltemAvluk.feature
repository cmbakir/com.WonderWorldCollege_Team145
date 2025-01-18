
Feature: WWC11 Examination Group Creating Test
  @test
  Scenario: WWC43 TC01->US_033 Test to verify Examination Test Bar,Page For Students

    Given  user clicks "adminAndTeacherLogin"
    Then   enters user name
    And    enters password
    Then   click signIn button
    Then   verifies examinations  test bar is visible


  @test
  Scenario: WWC79 TC02->US_033 Verifying Name,Save button, Description textBoxes and Exam Type dropdown menu is visible


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

  @test
  Scenario: WWC80 TC03->US_033 Test to verify New Exam Group

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



  @test
  Scenario: WWC81 TC04->US_033 Test to verify Created New and all Exam Group are visible on the list

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


    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group


  @test


  Scenario: WWC82 TC05->US_033 Test to verify if add exam(+) button works

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


    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group
    # TC05

    Given user clicks add button  under action buttons
    And verify redirected Exam List Page



  Scenario: WWC83 TC06->US_033 Test to Edit exam group list is edited after entered new updates

    Given user clicks edit button under actions buton
    Then user enters new name
    Then selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group

  Scenario: WWC82 TC05->US_033 Test to verify if add exam(+) button works
   # TC01
    Given  user clicks "adminAndTeacherLogin"
    Then   enters user name
    And    enters password
    Then   click signIn button
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


    @test

    Scenario: WWC84 TC07->US_033 Testing if The relevant exam group is deleted

       # TC01
      Given  user clicks "adminAndTeacherLogin"
      Then   enters user name
      And    enters password
      Then   click signIn button
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

