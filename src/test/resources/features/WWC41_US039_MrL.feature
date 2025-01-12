Feature: As an administrator (teacher), I would like to have a feature where I can send a notification email to everyone registered in the school system.

  Scenario: [TC_01->US_039] Verify Attendance menu redirection in the Student panel

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    When The teacher clicks on the "Send Email" link
    Then The page is redirected to the Send Email page with a URL containing "Send Email"
    And The browser is closed

  Scenario: [TC_02->US_039]  Verify visibility and functionality of Email Template dropdown and text boxes

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The browser is closed


  Scenario: [TC_03->US_039]  User selects options inside the message box

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And The browser is closed

  Scenario: [TC_04->US_039] User removes selected options from the message box

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And The user removes the selected options
    And The browser is closed


  Scenario: [TC_05->US_039]  Verify visibility and functionality of Email Template dropdown and text boxes

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And The user clicks on the submit button
    And The user submits the message and verifies successful delivery
    And The browser is closed


  Scenario: [TC_06->US_039]  Adding Recipients to the List by Selecting Classes
#bug
    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The teacher selects the Class options
    And The options "Class 1, Class 2, ..., Class 12" should be displayed for selection
    And The user selects a class and adds it to the recipient list
    And The class should be successfully added to the recipient list
    And The browser is closed


  Scenario: [TC_07->US_039]  Selecting the Message Sending Mode

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The selected options should be highlighted or marked
    And  The user selects the Schedule option and sets a future date
    And The user clicks on the submit button
    And The user submits the message and verifies successful delivery
    And The browser is closed

  Scenario: [TC_08->US_039]  Sending a Message to Selected Recipients

    Given The teacher is logged into the system
    When The teacher clicks the sidebar menu in the teacher panel
    Then The "Send Email" link under the "Communicate" menu is visible
    And The teacher clicks on the "Send Email" link
    And The Email Template dropdown is visible and clickable
    And The Message text box is visible and editable
    And The message should be sent to the specified recipients
    And  The user selects the Schedule option and sets a future date
    And The user clicks on the submit button
    And The user submits the message and verifies successful delivery
    And The browser is closed
