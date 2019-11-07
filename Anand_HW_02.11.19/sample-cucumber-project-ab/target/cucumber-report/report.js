$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce demo homepage feature",
  "description": "As a user I want to check all categories link on homepage",
  "id": "nopcommerce-demo-homepage-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to click on all categories on homepage",
  "description": "",
  "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Nopcommerce demo homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"\u003ccategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to see sub-category of \"\u003ccategory\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;",
  "rows": [
    {
      "cells": [
        "category"
      ],
      "line": 10,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;1"
    },
    {
      "cells": [
        "Computers"
      ],
      "line": 11,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;2"
    },
    {
      "cells": [
        "Electronics"
      ],
      "line": 12,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;3"
    },
    {
      "cells": [
        "Apparel"
      ],
      "line": 13,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;4"
    },
    {
      "cells": [
        "Digital Downloads"
      ],
      "line": 14,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;5"
    },
    {
      "cells": [
        "Books"
      ],
      "line": 15,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;6"
    },
    {
      "cells": [
        "Jewelry"
      ],
      "line": 16,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;7"
    },
    {
      "cells": [
        "Gift Cards"
      ],
      "line": 17,
      "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13582123600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to click on all categories on homepage",
  "description": "",
  "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Nopcommerce demo homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Computers\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to see sub-category of \"Computers\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.iAmOnNopcommerceDemoHomepage()"
});
formatter.result({
  "duration": 187084200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 12
    }
  ],
  "location": "HomePageStepdefs.iClickOn(String)"
});
formatter.result({
  "duration": 1689547400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 41
    }
  ],
  "location": "HomePageStepdefs.iShouldBeAbleToSeeSubCategoryOf(String)"
});
formatter.result({
  "duration": 217800,
  "status": "passed"
});
formatter.after({
  "duration": 792858700,
  "status": "passed"
});
formatter.before({
  "duration": 11962897500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able to click on all categories on homepage",
  "description": "",
  "id": "nopcommerce-demo-homepage-feature;user-should-be-able-to-click-on-all-categories-on-homepage;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Nopcommerce demo homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Electronics\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to see sub-category of \"Electronics\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.iAmOnNopcommerceDemoHomepage()"
});
formatter.result({
  "duration": 40400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 12
    }
  ],
  "location": "HomePageStepdefs.iClickOn(String)"
});
formatter.result({
  "duration": 2278560800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 41
    }
  ],
  "location": "HomePageStepdefs.iShouldBeAbleToSeeSubCategoryOf(String)"
});
formatter.result({
  "duration": 140100,
  "status": "passed"
});
formatter.after({
  "duration": 798062200,
  "status": "passed"
});
