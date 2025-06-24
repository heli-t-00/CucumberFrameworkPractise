package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.PractiseFormPage.{browserLaunch, clickCookies, clickSubmit, driver, experience, gender, inputDate, inputFirstName, inputLastName, scrollGender, scrollSubmit, selectContinent, uploadTestFile}
import testdata.PractiseData.{continentText, fileUploadTestData, firstnameText, lastnameText}
import utils.ScreenCapture

class PractiseFormSteps extends ScalaDsl with EN {

  Given("""the user is on the form submission page""") { () =>
    browserLaunch()
    clickCookies()

  }
  When("""the user enters First name Last name date""") { () =>
    inputFirstName(firstnameText)
    inputLastName(lastnameText)
    inputDate("12 June 2025")
ScreenCapture.capture(driver, filenamePrefix = "inputnames")
  }
  And("""the user clicks radio button and checkbox""") { () =>
    scrollGender()
    gender()
    experience()
  }

  And("""the user select dropdown""") { () =>
    selectContinent(continentText)


  }
  And("""the user uploads file""") { () =>
//fileUploadInput(fileUploadTestData)
uploadTestFile(fileUploadTestData)
  }

  And("""the user clicks submit button""") { () =>
    scrollSubmit()
    clickSubmit()
ScreenCapture.capture(driver)
  }

  Then("""forms should be submitted""") { () =>
    ScreenCapture.capture(driver, filenamePrefix = "endoftest")
    println("Test is COMPLETED")
  }

}
