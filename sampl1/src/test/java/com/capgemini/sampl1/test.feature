Feature: Addition of two numbers
 
  Scenario: Addition is done
    Given I give inputs 10 and 20
    When sum is called
    Then result will be 30