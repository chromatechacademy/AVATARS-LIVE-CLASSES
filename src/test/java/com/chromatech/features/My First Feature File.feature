Feature: My first feature file

  @RunTest
  Scenario: My first test case
    Given a user is on the Chroma Tech Academy practice site ""
    When user enters username "general@teacher.com" in username text box
    And enters password in password text box
    And clicks on Sign In button
    Then user is directed to the CTSMS dashboard page