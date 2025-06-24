package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.getText.productsOverviewPageSwagLabs.verifyPage
import pages.loginPageSwagLabs.{buttonLogin, inputPassword, inputUser, launchBrowser}
import testdata.dataSwagLabs.{passWordText, userNameText}


class swagLabsStepDefs extends ScalaDsl with EN {

  Given("""^the user is on the Login page$"""){()
    launchBrowser()
    println("user navigates to login page") //open browser and go to login page
  }
  Given("""^the user enters valid credentials$""") { () =>

    inputUser(userNameText)
    inputPassword(passWordText)
  }


  When("""^the user clicks the Login button$""") { () =>
buttonLogin()
  }


  Then("""^the user successfully login$""") { () =>
    println("user sees products page")
    verifyPage()
  }

//
//  Given("""the user enters invalid credentials "<usernames>" "<password>"""") { () =>
//    launchBrowser()
//  }
//
//
//  When("""the user clicks the Login button""") { () =>
//    inputUser(userNameText)
//    inputPassword(passWordText)
//  }
//
//
//
//  Then("""the user should not be able to login""") { () =>
//
//  }
//
//  And ("""an error message appears"""){ () =>
//  }

}