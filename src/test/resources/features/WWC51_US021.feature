Feature: WWC-51 Admin Chat Section Test

  @chat
  Scenario: WWC-162 TC_01 -> US_021 Test to access and view the Chat section as admin
    Given user logs in as admin
    And confirms that the Chat icon is displayed in the top bar of the admin panel
    Then clicks on the Chat icon and confirms that he is redirected to the Chat page
    And confirms that conversations are displayed in the left bar of the page
    And verifies that the number of incoming messages appears as an icon if there is a notification from a chat in the left bar of the page

  @chat
  Scenario: WWC-163 TC_02 -> US_021 Test to start a new chat and send messages in the Chat area as admin
    Given user logs in as admin
    Then clicks on the Chat icon and confirms that he is redirected to the Chat page
    Then click on the + icon on the page and search for 'hakan' in the window that opens, click on the first result and click on the Add button
    And verifies that the message Record Saved Successfully is displayed
    Then clicks on the added chat and verifies that the message field is displayed on the right side
    Then Write Your Message writes a message in the textBox and verifies that the send message button is clickable
    And presses the send message button and verifies that the message has been sent
