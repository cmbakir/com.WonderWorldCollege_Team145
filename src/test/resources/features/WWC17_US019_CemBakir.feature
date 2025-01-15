Feature: WWC18 US038 As an administrator (admin), I want to have an admin panel to do my administrative work
  and I want to be able to log in to the admin panel with the registered email and password

  @c17
  Scenario:XXXX TC_01 -> Admin Login Screen Functionality and Visibility Test.

    Given It is verified that the URL used for accessing the Admin panel is reachable
    Then On the site login page, it is confirmed that the login window is visible on the left side, and the “What’s New In Wonder World College” information is visible on the right side
    And It is verified that the text “Admin Login” is visible within the login window on the site login page
    And It is verified that the Username and Password text boxes and the Sign In button within the login window on the site login page are visible and functional


  @c17
  Scenario:XXXX TC_02 -> Admin Login Screen Forgot Password Test.

    Given Clicking the “Forgot password?” link opens a new page, where the email text box and Submit button are confirmed to be visible and functional
    Then It is verified that entering an email in the email text box on the Forgot Password page and clicking the Submit button sends an email to the entered email address
    And It is verified that clicking the “Admin Login” link on the Forgot Password page redirects the user to the site login page
    Then It is verified that clicking the “User login” link on the site login page redirects the user to the “user login” page
    And It is confirmed that there is a link on the site login page to return to the Front Site, and clicking it redirects to the homepage
    Then Entering a registered email and password in the text boxes on the site login page and clicking the Sign In button confirms successful login to the respective panel
    And Entering an unregistered email and password in the text boxes on the site login page and clicking the Sign In button confirms that login to the panel is not possible


