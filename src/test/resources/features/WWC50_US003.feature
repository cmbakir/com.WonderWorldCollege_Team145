Feature: WWC-50 User Online Admission Test

  @smoke
  Scenario: WWC-105 US003 As a user, viewing the Online Admission page and Basic Details and data entry test
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And confirms that it redirects to the Online Admission page
    Then verifies that the school enrollment criteria are displayed in the Instructions section on the page
    Then verifies that the required elements (Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email) are visible in the Basic Details section on the page
    And verifies that And Class, First Name, Gender, Date Of Birth TextBoxes are required fields to enter data
    Then enters random data into Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email textBoxes
    Then uploads a photo to the Student Photo section in Basic Details
