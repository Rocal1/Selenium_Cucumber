Feature: Login into the application

Scenario: Validation login - Happy Path
    Given Inicialize the browser with chrome
    And Navigate to "https://QAClickAcademy.com" site
    And Click on Login link in home page to land on Secure sign in Page
    When User enters "Username" and "Password" and logs in
    Then Verify that user is succesfully logged in
    
Scenario: Validation login - Happy Path
    Given Inicialize the browser with chrome
    And Navigate to "https://QAClickAcademy.com" site
    And Click on Login link in home page to land on Secure sign in Page
    When User enters "Jhon" and "1234" and logs in
    Then Verify that user is succesfully logged in