@logspage
Feature: To check the console logs

  Scenario Outline: Download console logs
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    #When User click on project icon
    # Then Navigate to project workspace
    # And Switch to "<projectname>"
    And Switch to different "<account>"
    Then Navigate to logs page
    And Download log
    And Click on view detailed logs

    #Then Download report in csv format
    Examples: 
      | username          | password   | projectname | account |
      | shaikth@dckap.com | Thaheer498 | Mi          | thaheer  |

  Scenario Outline: Switch to other users account
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    And Switch to different "<account>"

    Examples: 
      | username          | password   | projectname | account |
      | shaikth@dckap.com | Thaheer498 | Mi          |thaheer |

  Scenario Outline: Switch to different project in one account
    When User enters "<username>" and "<password>"
    And Click on Light It Up button
    #When User click on project icon
    Then Navigate to project workspace
    And Switch to "<projectname>"

    Examples: 
      | username          | password   | projectname | account |
      | shaikth@dckap.com | Thaheer498 | Mi          | thaheer  |
