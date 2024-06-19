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
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Chroma Tech"
    And enters last name "Academy"
    And selects "Female" from gender drop down
    And selects "04/01/1990" for Date of Birth Calendar
    And enters father name "Chroma Father"
    And selects Father radio button for If guardian is field
    And enters guardian phone number "703-687-5816"
    And saves submission