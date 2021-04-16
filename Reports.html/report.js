$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality of Adactin application",
  "description": "",
  "id": "login-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enter valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enter-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter \"Balaganesan\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter \"L4Y507\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Use verify valid username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launch_application()"
});
formatter.result({
  "duration": 5302606500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Balaganesan",
      "offset": 12
    }
  ],
  "location": "LoginStepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 918141900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "L4Y507",
      "offset": 12
    }
  ],
  "location": "LoginStepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 370583800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.use_verify_valid_username_and_password()"
});
formatter.result({
  "duration": 2506417100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User enter hotel details",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enter-hotel-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User enter location",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter hotel",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter room_type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter room_nos",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter date_in",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter date_out",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enter adult",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter children",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter submit",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_location()"
});
formatter.result({
  "duration": 584440600,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_hotel()"
});
formatter.result({
  "duration": 492666800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_room_type()"
});
formatter.result({
  "duration": 413065600,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_room_nos()"
});
formatter.result({
  "duration": 350885100,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_date_in()"
});
formatter.result({
  "duration": 371226000,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_date_out()"
});
formatter.result({
  "duration": 304774200,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_adult()"
});
formatter.result({
  "duration": 343760800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_children()"
});
formatter.result({
  "duration": 276234800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_enter_submit()"
});
formatter.result({
  "duration": 2889550600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "scenario description",
  "description": "",
  "id": "login-functionality-of-adactin-application;scenario-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User select radio_button",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User select Continue_button",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingStepDefinition.user_select_radio_button()"
});
formatter.result({
  "duration": 367554200,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepDefinition.user_select_Continue_button()"
});
formatter.result({
  "duration": 2532580300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User confirms booking",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-confirms-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User enters firstname",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters lastname",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User enters billingaddress",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enters ccnumber",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enters cc_type",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enters cc_expirymonth",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters cc_expiryyear",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters ccv_no",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects book_now",
  "keyword": "Then "
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_firstname()"
});
formatter.result({
  "duration": 915424100,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_lastname()"
});
formatter.result({
  "duration": 376316900,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_billingaddress()"
});
formatter.result({
  "duration": 671350700,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_ccnumber()"
});
formatter.result({
  "duration": 509727100,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_cc_type()"
});
formatter.result({
  "duration": 604102500,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_cc_expirymonth()"
});
formatter.result({
  "duration": 743591000,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_cc_expiryyear()"
});
formatter.result({
  "duration": 548512300,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_enters_ccv_no()"
});
formatter.result({
  "duration": 311573200,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmStepDefinition.user_selects_book_now()"
});
formatter.result({
  "duration": 274487100,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "User Logsout",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-logsout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User select logout",
  "keyword": "Given "
});
formatter.match({
  "location": "LogoutStepDefinition.user_select_logout()"
});
formatter.result({
  "duration": 9302208100,
  "status": "passed"
});
});