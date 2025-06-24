package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import locators.loginLocatorsSwagLabs.errorMessage
import pages.getText.productsOverviewPageSwagLabs.verifyPage
import pages.loginPageSwagLabs.{buttonLogin, driver, errorMess, inputPassword, inputUser, launchBrowser}
import testdata.dataSwagLabs.{passWordText, userNameText, userNameWrong}
import utils.ScreenCapture


class swagLabsStepDefs extends ScalaDsl with EN {

  Given("""^the user is on the Login page$""") {
    ()
    launchBrowser()
    println("user navigates to login page") //open browser and go to login page
    ScreenCapture.capture(driver, filenamePrefix = "loginlandingpage")
  }
  Given("""^the user enters valid credentials$""") { () =>

    inputUser(userNameText)
    inputPassword(passWordText)

  }

  Given("""^the user enters invalid credentials$""") { () =>

    inputUser(userNameWrong)
    inputPassword(passWordText)

  }

  Given("""the user enters username {string} and password {string}""") {(username: String, password: String) =>
inputUser(username)
    inputPassword(password)
  }


  When("""^the user clicks the Login button$""") { () =>
    buttonLogin()
  }


  Then("""^the user successfully login$""") { () =>
    println("user sees products page")
    ScreenCapture.capture(driver, filenamePrefix = "success")
    verifyPage()
  }

  Then("""^the user unsuccessfully login$""") { () =>
    println("error message")
    ScreenCapture.capture(driver, filenamePrefix = "unsuccess")
    errorMess(errorMessage)
  }

Then("""the login should be {string}""") {(result:String) =>
if(result == "successful") {
  verifyPage()
} else if (result == "unsuccessful") {
  errorMess(errorMessage)
}

}






}