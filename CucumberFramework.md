# Cucumber Framework
# Understanding the Framework
(note: every team may have a slightly different framework therefore, first step is to always review the project framework to understand where codes are kept)

# KEY CONCEPTS to Remember

| Concept               | Description                                                        |
|-----------------------|--------------------------------------------------------------------|
| **Feature file**      | Describe what to test – use Gherkin Syntax (Given, When, Then)     |
| **Step Definitions**  | The actual code that performs steps                                |
| **Page Object Model** | Code representing web pages                                        |
| **Locators**          | Help find buttons, fields etc. on webpages                         |
| **Hooks**             | Code to run BEFORE / AFTER each test                               |
| **Driver**            | Controls browser                                                   |
| **Utils**             | Extra tools like wait, screenshots etc.                            |

## **src/test/resources**
- **Features** – this folder stores `.feature` files written in Gherkin
- **Config.properties** – a file where environment/config settings are stored (e.g., URL, browser type)

## **src/test/scala**
- **Locators** – stores element locators like buttons/fields used in automation
- **Pages** – contains Page Classes (POM). Each web page you test gets a class with methods like `loginPage.enterUsername()`
- **Runner** – where your test runner class lives. Tells Cucumber which tests to run
- **Stepdefs (Step Definitions)** – this is where the code connects the Features (`.feature` files) to actual AUTOMATION code
    - Example:  
      Gherkin step: `Given I open the login page`  
      Code in Stepdefs will open the browser and navigate to the login page
- **Support:**
    - Utilities like:
        - `DriverManager`: sets up the browser (Chrome, Firefox)
        - `Hooks`: Before / After test steps (opening browser, taking screenshots on failure)
- **Testdata** – keeps external test data (e.g., usernames/passwords)
- **Utils** – helper tools for:
    - Waiting for elements
    - Taking screenshots
    - Assertions (checking expected vs actual outcomes)  
