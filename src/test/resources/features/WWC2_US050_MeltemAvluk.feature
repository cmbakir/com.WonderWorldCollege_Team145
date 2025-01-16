
Feature: WWC Able to do student Leave
  @test
  Scenario: [TC01]->US_050] Test to Verify if Apply Leave Side works and redirecting  leave list page


    Given the user access student page
    Given enters student user name
    Given enters student password
    Given clicks submit button
    Given clicks applyleave button from left side
    And verifies access to leave list page

  @test
  Scenario:[TC02]->US_050] Test to verify column fields on the leave list

    Given the user should be displayed column fields


  Scenario:[TC03]->US_050] Test to verifying message leave is  edited
  @test
      Given user clicks edit button
      And verifies editbuttonforms is displayed

      And enters any date into fromDatebox
      And enters any date into toDatebox
      Then enters any reason into reasonbox
      Then clicks editSave button
      And verifies edited leave message


  @test
      Scenario: [TC03]->US_050] Test to verifying message leave is deleted

         Given user clicks delete button
         And accepts message from alert
         And verifies leave is deleted


  @test
  Scenario: [TC04]->US_050] Test to verify add buton is clickable and new leave is added

    Given the user access student page
    Given enters student user name
    Given enters student password
    Given clicks submit button
     Given student  clicks add button
     Then views a new leave table

     And any date into fromdate section
     And any date into toDate section
     And any reason into reason section

     And clicks save button
     And accepts that is saved  from alert

