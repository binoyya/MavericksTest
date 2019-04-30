$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/com/mevericks/automation/web/featureFiles/redditTest.feature");
formatter.feature({
  "line": 1,
  "name": "Reddit Login",
  "description": "",
  "id": "reddit-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User login with valid credential",
  "description": "",
  "id": "reddit-login;user-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigate to \"reddit\" login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user login with \"username\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged into the reddit home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user able to view his subscribed subreddits",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user able to view one of his subscribed subreddits",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user creates a comment on a post",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user upvote a post",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user downvote a post",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user logged out from the reddit site",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "reddit",
      "offset": 18
    }
  ],
  "location": "StepDefinitions.iNavigateTo(String)"
});
formatter.result({
  "duration": 9040107410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 32
    }
  ],
  "location": "StepDefinitions.userTryToLoginWithAnd(String,String)"
});
formatter.result({
  "duration": 206519128,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userLoggedIntoThredditHomePage()"
});
formatter.result({
  "duration": 11948422934,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userAbleToViewHisSubscribesSubreddits()"
});
formatter.result({
  "duration": 198156439,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userAbleToViewOneOfHisSubscribedSubreddits()"
});
formatter.result({
  "duration": 214297744,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userCreatesACommentOnAPost()"
});
formatter.result({
  "duration": 5436826153,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userUpvoteHisPost()"
});
formatter.result({
  "duration": 115612793,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userDownvoteAPost()"
});
formatter.result({
  "duration": 98225436,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userLoggedOutFromTheRedditSite()"
});
formatter.result({
  "duration": 1015001617,
  "status": "passed"
});
});