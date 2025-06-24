package pages

import locators.loginLocatorsSwagLabs.{login, password, username}


object loginPageSwagLabs extends BasePageSwagLabs {

  // — User Name —

  def inputUser(text: String): Unit = {
    inputText(username, text)
  }

  // — Password —

  def inputPassword (text: String): Unit ={
    inputText(password, text)
      }

  // — Login Button —
  def buttonLogin(): Unit ={
    clickOn(login)
  }


}

