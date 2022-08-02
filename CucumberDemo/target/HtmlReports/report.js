$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/loginpage.feature");
formatter.feature({
  "name": "To Test LoginFunctionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To check login is successful with valid credientials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "customer is on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user should click on login",
  "keyword": "And "
});
formatter.step({
  "name": "user should navigate to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ravilella",
        "12345"
      ]
    },
    {
      "cells": [
        "sai+12345",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check login is successful with valid credientials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "customer is on login page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters ravilella and 12345",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click on login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should navigate to home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "To check login is successful with valid credientials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "customer is on login page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters sai+12345 and ",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click on login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should navigate to home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});