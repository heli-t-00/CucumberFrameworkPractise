package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.getText.productsOverviewPageSwagLabs.{filterBtn, verifyPage}
import pages.loginPageSwagLabs.{buttonLogin, driver, inputPassword, inputUser, launchBrowser}
import testdata.dataSwagLabs.{passWordText, userNameText}
import utils.ScreenCapture

class ProductsSwagLabsStepDef extends ScalaDsl with EN{

  Given("""^the standard user logged in successfully$""") {()=>
launchBrowser()
    inputUser(userNameText)
    inputPassword(passWordText)
buttonLogin()

  }
  And("""^on the inventory page$""") {()=>

    verifyPage()

  }
  When("""^the user clicks on the sort dropdown$""") {() =>
filterBtn()

  }

  Then("""the dropdown should display the options:"""){(dataTable: io.cucumber.datatable.DataTable) =>
    ScreenCapture.capture(driver, filenamePrefix = "displayFilter")

  }

}
