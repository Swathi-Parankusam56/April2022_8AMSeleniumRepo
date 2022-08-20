$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/hooks.feature");
formatter.feature({
  "name": "Amazon product Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying login is successful with valid credientials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@s1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should ne on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.user_should_ne_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills username  and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.user_fills_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on SignIn button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.clicks_on_SignIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.user_is_navigated_to_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To check product added to addtokart page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@s2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on product page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.user_is_on_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoud selects the product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.user_shoud_selects_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product should add to kart page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.HooksStepDefination.product_should_add_to_kart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});