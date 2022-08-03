$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FetureTags/Tags.feature");
formatter.feature({
  "name": "Feature for the demo tags",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sample Scenario1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browseropen",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.TagsStep.browseropen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browseropen",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.TagsStep.browseropen()"
});
formatter.result({
  "status": "passed"
});
});