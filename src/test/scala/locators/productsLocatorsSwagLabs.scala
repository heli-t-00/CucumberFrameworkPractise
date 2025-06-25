package locators

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select

import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

object productsLocatorsSwagLabs {

  // Products page

  val productsHeader: By = By.cssSelector("#header_container > div.header_secondary_container > span")
  println(productsHeader)
  val expectedHeader: String = "Products"

  val productSort: By = By.className("product_sort_container")
  val driver = pages.loginPageSwagLabs.driver
  val dropdownElement = driver.findElement(By.className("product_sort_container"))
  val select = new Select(dropdownElement)
  val actualOptions = select.getOptions.map(_.getText)

//Products List
  val productBackpack: By = By.cssSelector("button[name*=sauce-labs-backpack]")
  val productBikelight: By = By.cssSelector("button[name*=sauce-labs-bike-light]")
  val productTshirt: By = By.cssSelector("button[name*=sauce-labs-bolt-t-shirt]")
  val productJacket: By = By.cssSelector("button[name*=sauce-labs-fleece-jacket]")
  val productOnesie: By = By.cssSelector("button[name*=sauce-labs-onesie]")
  val productTshirtRed: By = By.cssSelector("button[name*=allthethings]")



}
