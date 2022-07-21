
Feature: Create a template
  Creating new template

  
  Scenario Outline: Title of your scenario
   Verify if user is able to Login with valid credentials
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    Then Navigate to project workspace
    And Switch to "<projectname>"
     When Hover on Advanced icon
    And Navigate to exchange
   # And Create new template
   # Then Save and publish the template
   
   Examples:
      | username          | password   |projectname|
      | shaikth@dckap.com | Thaheer498 |Mi|
   
    Scenario: Updating the template
    When Update Template
    
    
    

 
