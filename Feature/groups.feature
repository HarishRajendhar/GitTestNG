@groups
Feature: Creating group then send group invitations

  Scenario Outline: Creating new group
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    And User click on user groups
    Then Click on Add new button
    And user enter "<groupname>" and "<description>"
    And Enter user mail id "<usermailid>"
    And Signout from login

    Examples: 
      | username          | password   | groupname  | description                         | usermailid             |
      | shaikth@dckap.com | Thaheer498 | Automation | Group created by selenium weddriver | thaheer123@yopmail.com |

  Scenario Outline: Check Invited cards are displaying or not
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    Then Check invite cards
    And Accept invitation
    And Signout from login

    Examples: 
      | username               | password   |
      | thaheer123@yopmail.com | Th@heer498 |

  Scenario Outline: Sending project invitation to the group
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    When User click on project icon
    Then Navigate to project workspace
    When Hover on Advanced icon
    Then Navigate to manage access page
    Given Send project invite to "<groupname>"

    Examples: 
      | username          | password   | groupname |
      | shaikth@dckap.com | Thaheer498 | Autom     |
