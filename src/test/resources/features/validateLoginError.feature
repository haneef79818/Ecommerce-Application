Feature: Validation of ORM Application WebApplication.
	@test2
  Scenario: Test login funcationality for ORM Application.
    Given Navigate to application.
    And Call "loginToApplication" on "LoginPage"
      | USERNAME | asd |
      | PASSWORD | dsdddd |