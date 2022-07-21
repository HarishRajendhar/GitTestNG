Feature: Login with valid credentials
  Verify if user is able to Login in to the site or not

  @SmokeTest
  Scenario Outline: Login with invalid credentials
    #   Given User is on homepage
    When User navigates to Login Page
    And User enters "<username>" and "<password>"
    Then Invalid login message is displayed

    Examples: 
      | username          | password   |
      | thaheer@dckap.com | "Test@153" |
      | "testuser_2"      | "Test@153" |
@testing
  Scenario: Login as a authenticated user
    # Given User is on homepage
    When User navigates to Login Page
    And User enters username and Password
    Then Success message is displayed

   
  Scenario Outline: Basic Flow steps
  Steps include Create a new project
   # When User enters "<username>" and "<password>"
   # And Click on Light It Up button
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
    
    @testing
    Scenario: Import Api
    Steps will be import the existing Api 
    When Hover on Advanced icon
    And Click on importbutton
    
    @smokeTest
    Scenario:Create a flow using import flow option
    When Hover on Advanced icon
    And Create flow using import option
    Then Save the flow
   # Given Navigate to project settings page
    #When Select timezone
    #And Enable console logs
    #Then Save project settings
    @Pipe
    Scenario Outline:Create a nw pipe
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
     Then Navigate to project workspace
    Given Create a pipe
    
    And Turn on pipe Status
   And Sync the pipe
   # And Turn on pipe console logs
   And Add scheduler

      
    Examples:
      | username          | password   | projectname | description     |
      | shaikth@dckap.com | Thaheer498 | Automation  | testing project |
      
      
      
@projectinvitation
  Scenario Outline: Invite new project to users
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    Then Navigate to project workspace
    When Hover on Advanced icon
    Then Navigate to manage access page
     And Send Project invite to user mail
    And Signout from login

    Examples: 
      | username          | password   |
      | shaikth@dckap.com | Thaheer498 |

  Scenario Outline: Check Invited cards are displaying or not
    And User enters "<username>" and "<password>"
    Then Success message is displayed
    Then Check invite cards
    And Accept invitation
    And Signout from login

    Examples: 
      | username               | password   |
      | thaheer123@yopmail.com | Th@heer498 |

  @changepassword
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
