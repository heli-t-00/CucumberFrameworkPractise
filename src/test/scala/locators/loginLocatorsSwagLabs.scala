package locators

import org.openqa.selenium.By

object loginLocatorsSwagLabs {

  // Login Page
  val username: By = By.id("user-name")
  val password: By = By.id("password")
  val login:   By = By.id("login-button")

  val errorMessage: By = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
}
