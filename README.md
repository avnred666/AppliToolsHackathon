# Project Tech Stack
- IDE: Intellij
- Scripting: Selenium (Java)
- Test Management: TestNG
- Build tool: Maven

## Project Structure
**Page Object Model: src/main/java/AppPages**
- LoginPage - Identifies elements on Login page 
- HomePage - Identifies elements on Home page
- CanvasChart - Identifies elements on Compare Expenses chart page

**Traditional Tests: src/test/java/SeleniumTests**
- TestBase.java - Initialize driver, Before and After methods
- UIElementsTraditionalTests.java - Testcase 1:Login Page UI Elements Test
- DataDrivenTestTraditionalTests.java - Testcase 2: Data-Driven Test
- TableSortTraditionalTests.java - Testcase 3: Table Sort Test
- CanvasChartTraditionalTests.java - Testcase 4: Canvas Chart Test
- DynamicContentTraditionalTests.java - Testcase 5: Dynamic Content Test

**AppliTools Tests: src/test/java/ApplitoolsTests**
- TestBaseVisualAITests.java - Initialize Applitools 
- UIElementsVisualAITests.java - Testcase 1:Login Page UI Elements Test
- DataDrivenVisualAITests.java - Testcase 2: Data-Driven Test
- TableSortVisualAITests.java - Testcase 3: Table Sort Test
- CanvasChartVisualAITests.java - Testcase 4: Canvas Chart Test
- DynamicContentVisualAITests.java - Testcase 5: Dynamic Content Test

**TestNG xml File**
- testng.xml - Traditional Tests
- testng_applitools.xml - Visual AI Tests

## Steps to execute
-  Update application URLs provided on TestBase.java for traditional tests and TestBaseVisualAITests.java for applitools tests to individual tests depending on the version of the app you want to run. 
-  To execute Traditional Tests use maven command 
**mvn clean test -Ptraditional**
- To execute Traditional Tests use maven command 
**mvn clean test -Papplitools**

##AppliTools Test Results for V2
- Please find the applitools test results at: https://eyes.applitools.com/app/test-results/00000251828773739668/?accountId=T8r4Qx05mkmicH8eYB4Xzg~~
