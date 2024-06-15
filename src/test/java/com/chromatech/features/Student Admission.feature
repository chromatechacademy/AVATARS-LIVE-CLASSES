Feature: Student Admission Scenarios

  @StudentAdmission
  Scenario: Student Admission with Unique Admission Number
    Given a user is on the Chroma Tech Academy practice site "https://chroma.mexil.it/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user clicks on Student Information module
    And clicks on Student Admission sub module
    And enters Unique Admission Number "12345"