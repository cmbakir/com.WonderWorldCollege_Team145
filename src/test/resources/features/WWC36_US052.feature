Feature:WWC36 US052 After logging into the Student Panel as a user, I should be able to access the Examinations page and see the relevant exams.

  Scenario: WWC101 TC_01 -> US_052 Test of Accessing the Exam Program Page from the Exam Program Link.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User sees the Exam Schedule menu in the menu that opens.
    Then  User clicks the Exam Schedule menu.
    And   User verifies that they are on the "https://qa.wonderworldcollege.com/user/examschedule" page.

  Scenario: WWC102 TC_02 -> US_052 Test to make the relevant exam visible in the table when the user filters the exam from the search box.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Given The user enters the "mathematik 1" exam that wants to find into the search box.
    Then  The user confirms that the filter has been made with the exam name under the Exam title in the table.

  Scenario:WWC103 TC_03 -> US_052 Tests the Visibility of Column Headers on the Exam Page.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Then Kullanici  Exam Schedule  sayfasindaki S.No. basligini görür
    Then  Kullanici  Exam Schedule  sayfasinda ki Exam basligini görür.
    Then  Kullanici  Exam Schedule  sayfasinda ki Description basligini görür
    And  Kullanici, Exam Schedule  sayfasinda ki Action basligini görür

  Scenario: WWC104 TC_04 -> US_052 Testing User's Access to "View" Option.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Then  Kullanici  Exam Schedule  sayfasinda Actionun altinda ki  View i gorur.
    And   Kullanici  Exam Schedule  sayfasinda Actionun altinda ki  View’in erisilebilir oldugunu dogrular.

  Scenario: WWC106 TC_05 -> US_052 Verification Test for Visibility of Column Headings on the Exam Detail Page.

    Given User goes to homePage address
    Then  Clicks on Login button on homepage
    Given User enters student username.
    Then  User enters student password.
    Then  User clicks sign in button.
    Given User clicks the Examination menu on the sidebar of the student panel.
    Then  User clicks the Exam Schedule menu.
    Given The user clicks View under Action on the Exam Schedule page.
    Then The user verifies that the opened section is the exam detail section.
    Then the user verifies the exam details table headers
