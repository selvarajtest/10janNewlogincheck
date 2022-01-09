Feature: To check vaidity of forgotPassword link

  @smoke
  Scenario: To validate forgorpassword link then pass the credentials and to check  the validatation of credentials.
    Given User should launch the chrome and load the url
    When User should click account in homepage and then click sigin
    And User should click the Forgotpassword and to enter the credentials and click continue
    						|raj@gmail.com|john@ua.com|
    Then user should verify the password Reset verification page.

