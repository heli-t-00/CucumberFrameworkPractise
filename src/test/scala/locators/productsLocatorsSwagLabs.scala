package locators

import org.openqa.selenium.By

object productsLocatorsSwagLabs {

  // Products page

  val productsHeader: By = By.cssSelector("#header_container > div.header_secondary_container > span")
  println(productsHeader)
  val expectedHeader: String = "Products"

}
