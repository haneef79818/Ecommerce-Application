Feature: Validation of ORM Application WebApplication.
	@test1
  Scenario: Test login funcationality for ORM Application.
    Given Navigate to application.
    And Call "loginToApplication" on "LoginPage"
      | USERNAME | Admin |
      | PASSWORD | admin123 |
