package support

import io.cucumber.scala.{EN, ScalaDsl, Scenario}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import utils.ScreenCapture.capture
class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()
//  options.addArguments("--headless=new") // COMMENT OUT - to see the test run

  Before {
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver(options)
    DriverManager.driver.manage().window().maximize()
  }

  After { scenario: Scenario =>
    if (scenario.isFailed) {
      capture(DriverManager.driver, filenamePrefix = "FailedScenario")
    }
    println("Closing browser after scenario...")
//    DriverManager.driver.quit()
  }
}
