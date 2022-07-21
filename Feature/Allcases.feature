Feature: Login with Invalid credentials
  Verify if user is able to Login with invalid credentials

  Scenario Outline: Login with invalid credentials
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    And page refresh

    Examples: 
      | username          | password   |
      | thaheer@dckap.com | "Test@153" |
      | "testuser_2"      | "Test@153" |

  @test1
  Scenario Outline: Login as a authenticated user
    Verify if user is able to Login with valid credentials

    When User enters "<username>" and "<password>"
    And Click on Light It Up button

    Examples: 
      | username          | password   |
      | shaikth@dckap.com | Thaheer498 |

  Scenario Outline: Basic Flow steps
    Steps include Create a new project

    # When User enters "<username>" and "<password>"
    #And Click on Light It Up button
    When User click on project icon
    And Create new project
    And User1 enters "<projectname>" and "<description>"

    Examples: 
      | username          | password   | projectname | description     |
      | shaikth@dckap.com | Thaheer498 | Automation  | testing project |

  Scenario: Create a new credentials
    Steps includes create new credentilas then test connection

    Then Navigate to project workspace
    Given User click on credentials icon
    And Create new credentials
    Then Test credential connection

  Scenario: Create new custom system and APi
    Steps will create new custom system for Big Commerce and Api for the created system

    When Hover on Advanced icon
    And Create new system Bigcommerce
    When Hover on Advanced icon
    And Create new API

  Scenario: Import Api
    Steps will be import the existing Api

    When Hover on Advanced icon
    And Click on importbutton
    #Scenario: Create a flow using import flow option
    When Hover on Advanced icon
    And Create flow using import option
    Then Save the flow
    Given Navigate to project settings page
    When Select timezone
    And Enable console logs
    Then Save project settings
    And Signout from login

  Scenario Outline: Switch to different project in one account then create a pipe with mapings
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    #When User click on project icon
    Then Navigate to project workspace
    And Switch to "<projectname>"
    # Then Edit the offers Pipe
    Given Create a pipe
    When Select a flow with mapings
    Then Select Credentials
    And Enter config detaisl
    And Configure mapping
    Then Save the Pipe
   # And Turn on pipe Status
   # And Sync the pipe
    # And Turn on pipe console logs
    And Add scheduler
    And Signout from login

    Examples: 
      | username          | password   | projectname |
      | shaikth@dckap.com | Thaheer498 | Mi          |

  Scenario Outline: Send new project invitation to the existing  users
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    Then Navigate to project workspace
    When Hover on Advanced icon
    Then Navigate to manage access page
    # And Revoke Invitations
    And Send Project invite to user mail
    And Signout from login

    Examples: 
      | username          | password   |
      | shaikth@dckap.com | Thaheer498 |

  Scenario Outline: Check project invite cards are displaying or not and accept the project invitation
    It will check for the invite cards after login

    And User enters "<username>" and "<password>"
    Then Success message is displayed
    Then Check invite cards
    And Accept invitation
    And Signout from login

    Examples: 
      | username               | password   |
      | thaheer123@yopmail.com | Th@heer498 |

  Scenario Outline: Creating a new group
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    And User click on user groups
    Then Click on Add new button
    And user enter "<groupname>" and "<description>"
    And Enter user mail id "<usermailid>"
    And Signout from login

    Examples: 
      | username          | password   | groupname  | description                         | usermailid             |
      | shaikth@dckap.com | Thaheer498 | Automation | Group created by selenium webdriver | thaheer123@yopmail.com |

  Scenario Outline: Check group Invite cards are displaying or not and accept group invitations
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    Then Check invite cards
    And Accept invitation
    And Signout from login

    Examples: 
      | username               | password   |
      | thaheer123@yopmail.com | Th@heer498 |

  Scenario Outline: Sending project invitation to the group
    steps will send project invite to the existing group

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

  Scenario Outline: Create new ticket with and without attachments
    # When User enters "<username>" and "<password>"
    # And Click on Light It Up button
    When Click on help support icon
    And Click on new ticket button
    Then Submit the ticket
    And page refresh
    #When Click on help support icon
    And Click on new ticket button
    And Upload any documents
    Then Submit the ticket
    And page refresh
    And Signout from login

    Examples: 
      | username          | password   |
      | shaikth@dckap.com | Thaheer498 |

  Scenario Outline: Download console logs
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    When User click on project icon
    Then Navigate to project workspace
    # And Switch to "<projectname>"
    #And Switch to different "<account>"
    Then Navigate to logs page
    And Download log
    #And Click on view detailed logs
    And Signout from login

    #Then Download report in csv format
    Examples: 
      | username          | password   | projectname | account |
      | shaikth@dckap.com | Thaheer498 | Mi          | thaheer |

  Scenario Outline: Switch to other users account
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    And Switch to different "<account>"
    And Signout from login

    Examples: 
      | username          | password   | account |
      | shaikth@dckap.com | Thaheer498 | sureka  |

  Scenario Outline: Switch to different project in one account
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    #When User click on project icon
    Then Navigate to project workspace
    And Switch to "<projectname>"
    And Signout from login

    Examples: 
      | username          | password   | projectname |
      | shaikth@dckap.com | Thaheer498 | Mi          |

  Scenario Outline: Change password
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    And select Change password
    Then Enter "<password>" and "<newpassword>"
    And Signout from login
    And User enters "<username>" and "<password>"
    Then Invalid login message is displayed
    And page refresh
    And User enters "<username>" and "<newpassword>"
    Then Success message is displayed

    Examples: 
      | username               | password   | newpassword |
      | thaheer123@yopmail.com | Th@heer498 | Thaheer498  |
