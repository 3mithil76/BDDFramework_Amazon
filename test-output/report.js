$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Search Feature",
  "description": "",
  "id": "amazon-search-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 32,
      "value": "#@SmokeTest @SanityTest @RegTest @ColdFix"
    },
    {
      "line": 33,
      "value": "#Scenario: Amazon Search Feature Test Scenario Using Data Tables With List"
    },
    {
      "line": 34,
      "value": "#The only problem with this method is that you can\u0027t give more than one set of data, that\u0027s why we use data tables with Maps"
    },
    {
      "line": 35,
      "value": "#"
    },
    {
      "line": 36,
      "value": "#Given user is logged in"
    },
    {
      "line": 37,
      "value": "#When user searches for the product"
    },
    {
      "line": 38,
      "value": "#| trimmer |"
    },
    {
      "line": 39,
      "value": "#Then search results related to product should be displayed"
    },
    {
      "line": 40,
      "value": "#| trimmer |"
    },
    {
      "line": 41,
      "value": "#Then User close the browser"
    }
  ],
  "line": 44,
  "name": "Amazon Search Feature Test Scenario Using Data Tables With Maps",
  "description": "",
  "id": "amazon-search-feature;amazon-search-feature-test-scenario-using-data-tables-with-maps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@SmokeTest"
    },
    {
      "line": 43,
      "name": "@SanityTest"
    },
    {
      "line": 43,
      "name": "@RegTest"
    },
    {
      "line": 43,
      "name": "@ColdFix"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "user searches for the product and search results related to product should be displayed",
  "rows": [
    {
      "cells": [
        "productName"
      ],
      "line": 48
    },
    {
      "cells": [
        "trimmer"
      ],
      "line": 49
    },
    {
      "cells": [
        "iphone11"
      ],
      "line": 50
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeatureStepDefinitions.user_is_logged_in()"
});
formatter.result({
  "duration": 9626171400,
  "status": "passed"
});
formatter.match({
  "location": "SearchFeatureStepDefinitions.user_searches_for_the_product(DataTable)"
});
formatter.result({
  "duration": 11366883400,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cAmazon.ca : []iphone11\u003e but was:\u003cAmazon.ca : [trimmer]iphone11\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.SearchFeatureStepDefinitions.user_searches_for_the_product(SearchFeatureStepDefinitions.java:94)\r\n\tat ✽.When user searches for the product and search results related to product should be displayed(search.feature:47)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchFeatureStepDefinitions.User_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});