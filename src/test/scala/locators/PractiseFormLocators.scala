package locators

import org.openqa.selenium.By

object PractiseFormLocators {

  // Practise Form
  val Firstname: By = By.name("firstname")
  val Lastname: By = By.name("lastname")
  val GenderButton: By = By.id("sex-0")
  val ExperienceButton: By = By.id("exp-3")
  val DateField: By = By.id("datepicker")
  val profCheckbox: By = By.id("profession-0")
  val continentDrop: By = By.id("continents")
  val fileUpload: By = By.xpath("//*[@id='photo']")
  val Submit: By = By.cssSelector("button[id='submit']")
  val cookiesAcceptLocator: By = By.id("ez-accept-necessary")

}

