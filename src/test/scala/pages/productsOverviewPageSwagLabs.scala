package pages .getText
import locators.productsLocatorsSwagLabs.{expectedHeader, productsHeader}
import pages.loginPageSwagLabs.getText
import utils.Assertion

object productsOverviewPageSwagLabs {
  // — Verifying the header —
  def verifyPage(): Unit = {
    Assertion.assert(getText(productsHeader),expectedHeader )
  }
}

