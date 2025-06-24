package pages

import locators.PractiseFormLocators.{DateField, ExperienceButton, Firstname, GenderButton, Lastname, Submit, continentDrop, cookiesAcceptLocator, fileUpload}
import org.openqa.selenium.By
import pages.LoginPage.clickOn
import testdata.PractiseData.fileUploadTestData

import java.sql.Date

object PractiseFormPage extends PractiseBasePage {

  // First Name

  def inputFirstName(text: String): Unit =
    inputText(Firstname, text)

  // Last name
  def inputLastName(text: String): Unit =
    inputText(Lastname, text)

  // Enter Date
def inputDate( text: String): Unit = {
  inputText(DateField, text)
}
// Click Accept Cookie
  def clickCookies(): Unit = {
    acceptCookie (cookiesAcceptLocator)
  }

  // Click Gender
  def gender(): Unit ={
    clickOn(GenderButton)
  }

  // Click Experience
  def experience():Unit ={
    clickOn(ExperienceButton)
  }

  // Scroll to Gender so it appears
def scrollGender(): Unit={
  scroll(GenderButton)
}

  // Select continent
  def selectContinent(text:String): Unit={
    selectDropdown(continentDrop, text)
  }

  // Upload File
//  def fileUploadInput(text: String): Unit = {
//    inputText(fileUpload, text)
//
//  }

  def uploadTestFile(text: String): Unit ={
    uploadFile(fileUploadTestData)
  }

  def scrollSubmit(): Unit ={
    scroll(Submit)
  }
  // click Submit
  def clickSubmit(): Unit = {
    clickOn(Submit)
  }

}

