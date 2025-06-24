Feature: Practise Form
 @Form @smoke
   
  Scenario: Form Submission
    Given the user is on the form submission page
    When the user enters First name Last name date
    And the user clicks radio button and checkbox
    And the user select dropdown
    And the user uploads file
    And the user clicks submit button
    Then forms should be submitted

