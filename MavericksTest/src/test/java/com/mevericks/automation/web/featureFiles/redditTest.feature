Feature: Reddit Login
@test

  Scenario: User login with valid credential
    Given user navigate to "reddit" login page
    When user login with "username" and "password"
    And user logged into the reddit home page
    And user able to view his subscribed subreddits
    And user able to view one of his subscribed subreddits
    And user creates a comment on a post
    And user upvote a post
    And user downvote a post
    Then user logged out from the reddit site
