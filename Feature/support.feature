@tag
Feature: 
  Creating a support ticket without attachment

  Scenario Outline: Create new ticket with and without attachments
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    When Click on help support icon
    And Click on new ticket button
    Then Submit the ticket
    And page refresh
    When Click on help support icon
    And Click on new ticket button
    And Upload any documents
    Then Submit the ticket
    

    Examples: 
      | username          | password   |
      | shaikth@dckap.com | Thaheer498 |
