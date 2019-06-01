$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EggTimer.feature");
formatter.feature({
  "line": 1,
  "name": "Verification of Countdown functionality",
  "description": "",
  "id": "verification-of-countdown-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Using Scenario and inline Element concept to achieve Data driven approach"
    }
  ],
  "line": 5,
  "name": "Validate the Countdown timer functionality of eggtimer",
  "description": "",
  "id": "verification-of-countdown-functionality;validate-the-countdown-timer-functionality-of-eggtimer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on the eggtimer home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters times and User click Go",
  "rows": [
    {
      "cells": [
        "25 seconds"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Countdown timer start",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the remaining time decreases for each seconds increment",
  "keyword": "Then "
});
formatter.match({
  "location": "EggTimer.User_is_on_the_eggtimer_home_page()"
});
formatter.result({
  "duration": 7569703954,
  "status": "passed"
});
formatter.match({
  "location": "EggTimer.User_enters_times_and_User_Click_Go(DataTable)"
});
formatter.result({
  "duration": 3623095626,
  "status": "passed"
});
formatter.match({
  "location": "EggTimer.countdown_timer_Start()"
});
formatter.result({
  "duration": 13809755,
  "status": "passed"
});
formatter.match({
  "location": "EggTimer.the_remaining_time_decreases_for_each_seconds_increment()"
});
formatter.result({
  "duration": 23403153602,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 15,
      "value": "#Using Scenario Outline and Parameterization concept(Examples) to achieve Data driven approach"
    }
  ],
  "line": 17,
  "name": "Validate the Countdown timer functionality of eggtimer",
  "description": "",
  "id": "verification-of-countdown-functionality;validate-the-countdown-timer-functionality-of-eggtimer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "User is on the eggtimer home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enters \"\u003ctimes\u003e\" and click Go",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Countdown timer start",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the remaining time decreases for each seconds increment",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "verification-of-countdown-functionality;validate-the-countdown-timer-functionality-of-eggtimer;",
  "rows": [
    {
      "cells": [
        "times"
      ],
      "line": 25,
      "id": "verification-of-countdown-functionality;validate-the-countdown-timer-functionality-of-eggtimer;;1"
    },
    {
      "cells": [
        "25 seconds"
      ],
      "line": 26,
      "id": "verification-of-countdown-functionality;validate-the-countdown-timer-functionality-of-eggtimer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Validate the Countdown timer functionality of eggtimer",
  "description": "",
  "id": "verification-of-countdown-functionality;validate-the-countdown-timer-functionality-of-eggtimer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "User is on the eggtimer home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enters \"25 seconds\" and click Go",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Countdown timer start",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the remaining time decreases for each seconds increment",
  "keyword": "Then "
});
formatter.match({
  "location": "EggTimer.User_is_on_the_eggtimer_home_page()"
});
formatter.result({
  "duration": 7302453265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25 seconds",
      "offset": 13
    }
  ],
  "location": "EggTimer.user_enters_times_and_Click_Go(String)"
});
formatter.result({
  "duration": 3881035415,
  "status": "passed"
});
formatter.match({
  "location": "EggTimer.countdown_timer_Start()"
});
formatter.result({
  "duration": 6712031,
  "status": "passed"
});
formatter.match({
  "location": "EggTimer.the_remaining_time_decreases_for_each_seconds_increment()"
});
formatter.result({
  "duration": 23183680367,
  "status": "passed"
});
});