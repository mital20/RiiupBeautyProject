Feature: open browser
  @test1
  Scenario: User open url successfully
    Given user open browser
    When user enters url
    Then user successfully open the website

    @category
    Scenario Outline: categories
      Given user is on home page
      When User clicks on "<category>" from menu
      Then user should able to navigate to "<related category page>" successfully

      Examples:
        | category | related category page |
        | About us |
