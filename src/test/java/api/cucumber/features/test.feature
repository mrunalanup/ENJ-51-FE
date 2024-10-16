Feature: Bulk Question Upload

  As an admin,
  I want to upload an Excel or CSV file for bulk question uploads
  So that I can efficiently manage questions for the exam



  Scenario: Verify Admin's Upload Portal web page
    Given Open the browser
    When I open Admin Upload Portal
    And I check the First dropdown option
    And I check the Second dropdown option
    And I check the Third dropdown option
    And click on upload button
    Then Close the browser





