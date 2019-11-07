$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/signuppage.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up link on Appearhere.co.uk",
  "description": "As a user I want to verify sign up link.",
  "id": "sign-up-link-on-appearhere.co.uk",
  "keyword": "Feature"
});
formatter.before({
  "duration": 39580801500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should sign up successfully",
  "description": "",
  "id": "sign-up-link-on-appearhere.co.uk;user-should-sign-up-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage of Appearhere.co.uk webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I clik on Sign Up link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on sign up with email field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \"John\" in First Name field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"Smith\" in Last Name field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter random email in email field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"Abcd1234\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on sign up button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should sign up successfully and I should dashboard tab appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepdefs.iAmOnHomepageOfAppearhereCoUkWebpage()"
});
formatter.result({
  "duration": 2554473000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClikOnSignUpLink()"
});
formatter.result({
  "duration": 858111700,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpWithEmailField()"
});
formatter.result({
  "duration": 1404761600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 9
    }
  ],
  "location": "SignUpStepdefs.iEnterInFirstNameField(String)"
});
formatter.result({
  "duration": 1663939900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smith",
      "offset": 9
    }
  ],
  "location": "SignUpStepdefs.iEnterInLastNameField(String)"
});
formatter.result({
  "duration": 299989400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iEnterRandomEmailInEmailField()"
});
formatter.result({
  "duration": 561728400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcd1234",
      "offset": 9
    }
  ],
  "location": "SignUpStepdefs.iEnterInPasswordField(String)"
});
formatter.result({
  "duration": 306182900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 335970800,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iShouldSignUpSuccessfullyAndIShouldDashboardTabAppears()"
});
formatter.result({
  "duration": 7122055900,
  "status": "passed"
});
formatter.after({
  "duration": 1626926300,
  "status": "passed"
});
});