$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page of gmx webpage",
  "description": "As a user I want to verify home page",
  "id": "home-page-of-gmx-webpage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should click on drop down functionality on  homepage successfully",
  "description": "",
  "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage of gmx.com webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"\u003ccategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see sub-category of \"\u003ccategory\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;",
  "rows": [
    {
      "cells": [
        "category"
      ],
      "line": 9,
      "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;1"
    },
    {
      "cells": [
        "Free Email"
      ],
      "line": 10,
      "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;2"
    },
    {
      "cells": [
        "Features"
      ],
      "line": 11,
      "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;3"
    },
    {
      "cells": [
        "Apps"
      ],
      "line": 12,
      "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 27453400500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should click on drop down functionality on  homepage successfully",
  "description": "",
  "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage of gmx.com webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Free Email\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see sub-category of \"Free Email\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.iAmOnHomepageOfGmxComWebpage()"
});
formatter.result({
  "duration": 1232145200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Email",
      "offset": 12
    }
  ],
  "location": "HomePageStepdefs.iClickOn(String)"
});
formatter.result({
  "duration": 1105047400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Email",
      "offset": 41
    }
  ],
  "location": "HomePageStepdefs.iShouldBeAbleToSeeSubCategoryOf(String)"
});
formatter.result({
  "duration": 107800,
  "status": "passed"
});
formatter.after({
  "duration": 1681610600,
  "status": "passed"
});
formatter.before({
  "duration": 22931041800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should click on drop down functionality on  homepage successfully",
  "description": "",
  "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage of gmx.com webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Features\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see sub-category of \"Features\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.iAmOnHomepageOfGmxComWebpage()"
});
formatter.result({
  "duration": 371041300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Features",
      "offset": 12
    }
  ],
  "location": "HomePageStepdefs.iClickOn(String)"
});
formatter.result({
  "duration": 1176036400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Features",
      "offset": 41
    }
  ],
  "location": "HomePageStepdefs.iShouldBeAbleToSeeSubCategoryOf(String)"
});
formatter.result({
  "duration": 88800,
  "status": "passed"
});
formatter.after({
  "duration": 1688084200,
  "status": "passed"
});
formatter.before({
  "duration": 17680853300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should click on drop down functionality on  homepage successfully",
  "description": "",
  "id": "home-page-of-gmx-webpage;user-should-click-on-drop-down-functionality-on--homepage-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage of gmx.com webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Apps\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see sub-category of \"Apps\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.iAmOnHomepageOfGmxComWebpage()"
});
formatter.result({
  "duration": 109136000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apps",
      "offset": 12
    }
  ],
  "location": "HomePageStepdefs.iClickOn(String)"
});
formatter.result({
  "duration": 1043560600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apps",
      "offset": 41
    }
  ],
  "location": "HomePageStepdefs.iShouldBeAbleToSeeSubCategoryOf(String)"
});
formatter.result({
  "duration": 122400,
  "status": "passed"
});
formatter.after({
  "duration": 1204975700,
  "status": "passed"
});
});