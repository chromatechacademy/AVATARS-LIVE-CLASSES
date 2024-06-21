Feature: Student Admission Scenarios

  @StudentAdmission
  Scenario Outline: Student Admission with Unique Admission Number
    Given a user is on the Chroma Tech Academy practice site "https://chroma.mexil.it/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user clicks on Student Information module
    And clicks on Student Admission sub module
    And enters Unique Admission Number "<Admission Number>"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "<First Name>"
    And enters last name "<Last Name>"
    And selects "<Gender>" from gender drop down
    And selects "<Date of Birth>" for Date of Birth Calendar
    And enters father name "<Father Name>"
    And selects Father radio button for If guardian is field
    And enters guardian phone number "<Guardian Phone Number>"
    And saves submission
    Then test account is reset with admission number "<Admission Number>", class "SDET", section "Cucumber Fundamentals"
    Examples:
      | Admission Number | First Name | Last Name | Gender | Date of Birth | Father Name    | Guardian Phone Number |
      | 123456789013346  | Amelia     | Smith     | Female | 02/06/1996    | David Smith    | 620-123-4567          |
      | 123456789023447  | Benjamin   | White     | Male   | 01/05/1995    | John White     | 620-234-5678          |
      | 123456789033548  | Emily      | Harris    | Female | 04/01/2001    | Michael Harris | 620-345-6789          |
      | 123456789043649  | Michael    | Thomas    | Male   | 01/03/2000    | Robert Thomas  | 620-456-7890          |
      | 123456789053750  | Chloe      | Walker    | Female | 02/02/1999    | Mark Walker    | 620-567-8901          |
      | 123456789063851  | Daniel     | Jackson   | Male   | 01/07/1997    | Paul Jackson   | 620-678-9012          |
      | 123456789073952  | Lily       | Baker     | Female | 05/12/1993    | James Baker    | 620-789-0123          |
      | 123456789084053  | William    | Lee       | Male   | 01/04/1994    | David Lee      | 620-890-1234          |
      | 123456789094154  | Sophie     | Wilson    | Female | 03/06/2000    | Richard Wilson | 620-901-2345          |
      | 123456789104255  | Alexander  | Howard    | Male   | 05/12/1991    | Brian Howard   | 620-012-3456          |
      | 123456789114356  | Grace      | Rodriguez | Female | 02/01/1998    | Jeff Rodriguez | 620-123-4567          |
      | 123456789124457  | Lucas      | Scott     | Male   | 01/09/1996    | Ken Scott      | 620-234-5678          |
      | 123456789134558  | Olivia     | Wright    | Female | 05/10/1997    | Howard Wright  | 620-345-6789          |
      | 123456789144659  | Gabriel    | Evans     | Male   | 05/11/1995    | Fred Evans     | 620-456-7890          |
      | 123456789154760  | Charlotte  | Taylor    | Female | 02/03/2002    | Ralph Taylor   | 620-567-8901          |
      | 123456789164861  | Samuel     | Miller    | Male   | 01/05/1993    | Charles Miller | 620-678-9012          |
      | 123456789174962  | Bella      | Anderson  | Female | 04/01/1998    | Eric Anderson  | 620-789-0123          |
      | 123456789185063  | Noah       | Lewis     | Male   | 01/08/1994    | Ron Lewis      | 620-890-1234          |
      | 123456789195164  | Lily       | Parker    | Female | 06/07/1998    | Ray Parker     | 620-901-2345          |
      | 123456789205265  | Arthur     | Cook      | Male   | 02/09/1995    | Gary Cook      | 620-012-3456          |