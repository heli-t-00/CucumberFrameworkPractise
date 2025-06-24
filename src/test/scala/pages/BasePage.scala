package pages

import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import support.DriverManager
import utils.ConfigReader

trait BasePage {
  def driver: WebDriver = DriverManager.driver

  def js: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]


  def browserLaunch(): Unit = {
    val testUrl = ConfigReader.get("base.url")
    driver.get(testUrl)
  }

  // Locator Identification
  def findById(id: String): WebElement = driver.findElement(By.id(id))

  def findByName(name: String): WebElement = driver.findElement(By.name(name))

  def findByLinkText(link: String): WebElement = driver.findElement(By.linkText(link))

  def findByPartialLinkText(partialLink: String): WebElement = driver.findElement(By.partialLinkText(partialLink))

  def findByTagName(tag: String): WebElement = driver.findElement(By.tagName(tag))

  def findByCssSelector(css: String): WebElement = driver.findElement(By.cssSelector(css))

  def findByXpath(xpath: String): WebElement = driver.findElement(By.xpath(xpath))

  // Common Actions

  def inputText(selector: By, text: String): Unit = {

    driver.findElement(selector).sendKeys(text)

  }

  def getText(selector: By): String = {
    val element = driver.findElement(selector)
    js.executeScript("arguments[0].scrollIntoView();", element)
    element.getText
  }

  def clickOn(selector: By): Unit = {
    driver.findElement(selector).click()
  }


  //  def getText(selector: By): String =
  //    driver.findElement(selector).getText

}
