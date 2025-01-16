Feature:After logging into the Student Panel as a user, I should be able to access the “Attendance” page and see the Attendance details.


  Scenario: [TC_01->US_051] Verify Attendance menu redirection in the Student panel
    Given User logs in as a student
    When  The Attendance menu title is displayed in the sidebar of the Student panel
    And   User clicks on the Attendance menu
    Then  User should be redirected to the Attendance page
    And   The browser is closed

  Scenario: [TC_02->US_051] Verify attendance records for the selected date
    Given User logs in as a student
    When  The Attendance menu title is displayed in the sidebar of the Student panel
    And   User clicks on the Attendance menu
    And  The user selects a date from the date picker
    And  The attendance records for the selected date should be displayed
    And The browser is closed


  Scenario: [TC_03->US_051] Verify columns on the Attendance page
    Given User logs in as a student
    When The Attendance menu title is displayed in the sidebar of the Student panel
    And User clicks on the Attendance menu
    And The user selects a date from the date picker
    And The following column headers should be visible
    And The browser is closed