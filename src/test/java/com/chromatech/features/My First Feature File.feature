Feature: My first feature file

  Scenario: My first test case
    Given a user is on the Chroma Tech Academy practice site "https://chroma.mexil.it/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    Then user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"

  @RunTest
  Scenario Outline: My first test case
    Given a user is on the Chroma Tech Academy practice site "https://chroma.mexil.it/site/login"
    When user enters username "<username>" in username text box
    And enters password "<password>" in password text box
    And clicks on Sign In button
#    Then user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    Examples:
      | username            | password      |
      | general@teacher.com | 123456        |
      | diego@test.com      | hello123@     |
      | chromatect          | student12     |
      | techstudent         | testing123    |
      | oleksandra          | oleksandra123 |
      | tanya               | tanya123      |
      | chris               | chris123      |
      | veronica            | veronica123   |
      | mustafa             | mustafa123    |
      | vlad                | vlad123       |
