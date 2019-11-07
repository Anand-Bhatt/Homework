$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/signup.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up link on flickr.com",
  "description": "As a user I want to verify sign up link.",
  "id": "sign-up-link-on-flickr.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 35824613100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should sign up successfully",
  "description": "",
  "id": "sign-up-link-on-flickr.com;user-should-sign-up-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage of flickr.com webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Sign Up link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"John\" in first name field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"Smith\"in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"18\" as age",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter random email in email field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"Abcdabcd1234\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on sign up button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should navigate to signup verification email send link",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepdefs.iAmOnHomepageOfFlickrComWebpage()"
});
formatter.result({
  "duration": 1468403700,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpLink()"
});
formatter.result({
  "duration": 4897520000,
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
  "duration": 375582100,
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
  "duration": 310068300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 9
    }
  ],
  "location": "SignUpStepdefs.iEnterAsAge(String)"
});
formatter.result({
  "duration": 106708000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iEnterRandomEmailInEmailField()"
});
formatter.result({
  "duration": 502706200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcdabcd1234",
      "offset": 9
    }
  ],
  "location": "SignUpStepdefs.iEnterInPasswordField(String)"
});
formatter.result({
  "duration": 285587000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 132922100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iShouldNavigateToSignupVerificationEmailSendLink()"
});
formatter.result({
  "duration": 1323056600,
  "status": "passed"
});
formatter.after({
  "duration": 1743106600,
  "status": "passed"
});
});