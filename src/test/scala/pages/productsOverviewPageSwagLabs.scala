package pages .getText
import locators.productsLocatorsSwagLabs.{expectedHeader, productSort, productsHeader}
import pages.loginPageSwagLabs.{clickOn, getText}
import utils.Assertion

object productsOverviewPageSwagLabs {
  // — Verifying the header —
  def verifyPage(): Unit = {
    Assertion.assert(getText(productsHeader),expectedHeader )
  }

  def filterBtn(): Unit ={
    clickOn(productSort)
  }


}

