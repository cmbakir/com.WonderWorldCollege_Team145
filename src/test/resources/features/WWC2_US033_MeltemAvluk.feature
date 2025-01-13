
Feature: WWC Sinav Group Olusturma Testi
  @test
  Scenario: [TC01]->US_033] Test to verify Examination Test Bar,Page For Students

    Given  user clicks "adminAndTeacherLogin"
    Then   enters user name
    And    enters password
    Then   click signIn button
    Then   verifies examinations  test bar is visible


  @test
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

  @test
  Scenario:[TC03]->US_033] Test to verify New Exam Group
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
  Scenario:[TC04]->US_033] Test to verify Created New and all Exam Group are visible on the list
    Given user enters new name
    And  selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group


  @test


  Scenario: [TC05]->US_033] Test to verify if add exam(+) button works

    Given user clicks add button  under action buttons
    And verify redirected Exam List Page


  @test
  Scenario: [TC06]->US_033] Test to Edit exam group list is edited after entered new updates


    Given user clicks edit button under actions buton
    Then user enters new name
    Then selects exam type from dropdown menu
    Then types any description to box
    Then click save button
    Then verifies recorded new exam group


    @test

    Scenario: [TC07]->US_033] Testing if The relevant exam group is deleted
      Given User clicks delete button under action section
      Then clicks tamam from alert
      And confirm deleted exam group

