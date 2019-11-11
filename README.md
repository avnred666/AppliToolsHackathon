# Project Tech Stack

IDE: Intellij

Scripting: Selenium (Java)

Test Management: TestNG

Build tool: Maven

## Project Structure

```bash
Page Object Model: src/main/java/AppPages
LoginPage - Identifies elements on Login page 
HomePage - Identifies elements on Home page
CanvasChart - Identifies elements on Compare Expenses chart page
```
```bash
Traditional Tests: src/test/java/SeleniumTests
TestBase.java - Initialize driver, Before and After methods
UIElementsTraditionalTests.java - Testcase 1:Login Page UI Elements Test
DataDrivenTestTraditionalTests.java - Testcase 2: Data-Driven Test
TableSortTraditionalTests.java - Testcase 3: Table Sort Test
CanvasChartTraditionalTests.java - Testcase 4: Canvas Chart Test
DynamicContentTraditionalTests.java - Testcase 5: Dynamic Content Test
```

```bash
AppliTools Tests: src/test/java/ApplitoolsTests
TestBaseVisualAITests.java - Initialize Applitools 
UIElementsVisualAITests.java - Test case 1:Login Page UI Elements Test
DataDrivenVisualAITests.java - Test case 2: Data-Driven Test
TableSortVisualAITests.java - Test case 3: Table Sort Test
CanvasChartVisualAITests.java - Test case 4: Canvas Chart Test
DynamicContentVisualAITests.java - Test case 5: Dynamic Content Test
```

```bash
TestNG xml Files: 
testng.xml - Traditional Tests
testng_applitools.xml - Visual AI Tests
```

## Steps to execute
1. Update application URLs provided on TestBase.java for traditional tests and TestBaseVisualAITests.java for applitools tests to individual tests depending on the version of the app you want to run. 
2. To execute Traditional Tests use maven command 

mvn clean test -Ptraditional
3. To execute Traditional Tests use maven command 

mvn clean test -Papplitools
