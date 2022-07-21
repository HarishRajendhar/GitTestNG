Feature: Single module testing

  Scenario Outline: Login as a authenticated user
      Verify if user is able to Login with valid credentials

    When User enters "<username>" and "<password>"
    And Click on Light It Up button

    Examples: 
      | username          | password   |
      | shaikth@dckap.com | Thaheer498 |

  Scenario: Import Api
    Steps will be import the existing Api

    Then Navigate to project workspace
    When Hover on Advanced icon
    And Click on importbutton

  Scenario: Adding
    Then Navigate to project workspace
    When Hover on Advanced icon
    And Create flow using drag and drop option
    Then Save the flow

  @hai
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
    And Turn on pipe Status
    And Sync the pipe
    # And Turn on pipe console logs
    And Add scheduler
    And Signout from login
    
   

    Examples: 
      | username          | password   | projectname |
      | shaikth@dckap.com | Thaheer498 | Mi          |
