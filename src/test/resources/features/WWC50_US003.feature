Feature: WWC-50 User Online Admission Test

  @online
  Scenario: WWC-105 US003 As a user, viewing the Online Admission page and Basic Details and data entry test
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And confirms that it redirects to the Online Admission page
    Then verifies that the school enrollment criteria are displayed in the Instructions section on the page
    Then verifies that the required elements (Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email) are visible in the Basic Details section on the page
    And verifies that And Class, First Name, Gender, Date Of Birth TextBoxes are required fields to enter data
    Then enters random data into Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email textBoxes
    Then uploads a photo to the Student Photo section in Basic Details

  @online
  Scenario: WWC-107 US003 Test to display the Parent Detail window and enter data as a user
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And verifies that the Father Name, Mother Name TextBoxes are visible in the Parent Detail field on the sheet
    Then enters random data in the Father Name, Mother Name TextBoxes in the Parent Detail field

  @online
  Scenario: WWC-108 US003 Test to display the Guardians Details elements and enter data as a user
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And that the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes are visible in the Guardian Details field on the And page
    Then verifies that If Guardian Is, Guardian Name, Guardian Relation TextBoxes in the Guardian Details field are required fields to enter data
    And Verifies that the radio buttons in the If Guardian Is question in the And Guardian Details field are visible and clickable
    Then enters random values in the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes in the Guardian Details field
    Then Guardian uploads photos for Parent in the Details field

  @online
  Scenario: WWC-110 US003 Test to display the elements of Miscellaneous Details and Upload Documents as a user and enter data
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    And verifies that the National Identification Number, Previous School Details TextBoxes are visible in the Miscellaneous Details field on the page
    Then enters random values in the National Identification Number, Previous School Details TextBoxes in the Miscellaneous Details field
    And uploads a document to the Upload Documents field

  @online
  Scenario: WWC-111 US003 Test to display the Review Entered Details and Status page as a user
    Given user goes to the 'homePage'
    Then click on the Online Admission menu heading in the top bar
    Then fills out the form on the page and clicks Submit
    And verifies that the student is redirected to the Review Entered Details and Status page and that a Reference Number has been created on behalf of the student
    Then verifies that the Form Status on the page is Not Submitted and the Application Date is the date the record was created on the Online Admission page
    Then verifies that the I Agree To The Terms And Conditions checkBox on the page is visible and clicks
    And clicks the Submit button on the page and verifies that the message Form Has Been Submitted Successfully...!! appears and the Form Status is Submitted
