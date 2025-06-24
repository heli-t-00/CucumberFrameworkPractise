package utils

import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}
import pages.LoginPage.driver

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date


object ScreenCapture {
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)

  // CREATED a reusable METHOD 'capture' to take screenshot, this can be called in stepdef, After hook or Base page class
  def capture(driver: WebDriver, filenamePrefix: String = "PractiseFormFeature_"): Unit = {

    try {
      //take screenshot and store in file
      val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())

      val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)

      // Take a screenshot with FIXED name - this will overwrite everytime
      FileHandler.copy(srcFull, new File("/Users/helen.to/Documents/screenshotAutomation/TestResult.png"))
      println("Screenshot")

      /*Example====
//      FileHandler.copy(srcTimestamp, new File(s"/Users/helen.to/Documents/screenshotAutomation/TestResult_$timeStamp.png")) */

      //Save another screenshot, using timestamp in file name - avoids being overwritten
      FileHandler.copy(srcTimestamp, new File(s"/Users/helen.to/Documents/screenshotAutomation/${filenamePrefix}_$timeStamp.png"))
      println(s"Screenshot saved with timestamp: ${filenamePrefix}_$timeStamp.png")

      println("Screenshot with timestamp")
    } catch {
      case e: Exception =>
        // If something goes wrong, show error message
        println("could not capture screenshot")
        e.printStackTrace()
    }

  }






}