Selenium Automation Framework
Project Title
Selenium-Based BDD Test Automation Framework Using Java, Cucumber, Maven, PicoContainer, and TestNG Sninper Elite Resistance project
Project Description
This project is a scalable and modular automation testing framework developed in Java using Selenium WebDriver and Cucumber BDD. The framework is designed to automate browser-based functional tests with high maintainability and reusability. Built using the Page Object Model (POM) design pattern, it integrates PicoContainer for dependency injection, eliminating the need to instantiate classes manually using new. Test execution is managed using Maven as the build tool and TestNG for test management and reporting. This is a regression suite prepared for Sniper Elite product which is to test if nothing is broken before the release with new features.
Technologies Used
•	Java – Core programming language
•	Selenium WebDriver – For browser automation
•	Cucumber (BDD) – Feature files written in Gherkin syntax
•	PicoContainer – Dependency injection to manage object lifecycle
•	Maven – Build and dependency management
•	TestNG – Test management and reporting
•	Gherkin – For writing readable and structured feature files
•	POM (Page Object Model) – Design pattern for page interaction abstraction
Maven Plugins & Dependencies Check the pom.xml for: Cucumber-Java Cucumber-JUnit Selenium-Java PicoContainer JUnit
Maven Surefire Plugin
Requirements
Before you begin, ensure you have met the following requirements:
•	Java JDK 8 or above
•	Maven 3.6 or higher
•	IDE like IntelliJ IDEA or Eclipse
•	Google Chrome or any supported browser
•	Internet connection to download Maven dependencies
Installation Instructions
 Clone the Repository 
    git clone
      Install Dependencies Maven will handle all the dependencies defined in the pom.xml. mvn clean install
      Application URL is found in configproperties file url - hhtps://sniperelite.com
      Feature Files: All the test scenorios are written in bdd language using gherkin syntax.
      Step Definitions: Each step in the feature file is mapped to a Java method in the stepDefinitions package. These methods call actions from the corresponding Page Object classes.
      Page Object Model Each web page has a corresponding class under pages directory (e.g., SniperElitePage.java) containing all element locators and methods to interact with them. Each page class contains: WebElements (using locators like @FindBy, By, or WebDriver.findElement()). Methods that perform actions or assertions on those elements. Promotes reuse and maintainability.
      Hooks: Before and After hooks are defined in Hooks.java under runners: @Before – Initializes the WebDriver @After – Closes browser and performs cleanup Manage preconditions and cleanup Can include screenshot capture on failure
      Driver Management: DriverManager.java handles WebDriver instantiation using Singleton pattern. Handles: WebDriver initialization Browser setup/teardown Singleton-like pattern ensures only one driver instance per test Supports browser flexibility (e.g., Chrome, Firefox, Edge)
      **Test Runner: ** This plays a vital role as glue between feature file and step definition which helps to recongnise the steps. The feature file path has to be accurate and stpe definition name should match.
      Dependency Injection with PicoContainer Eliminates new keyword by injecting shared objects (e.g., page classes, WebDriver) into step definitions. Enhances test modularity and scalability. Useful for cross-scenario resource reuse.
      Test Execution: The tests are executed using the tags @smoke and @regression. In order to change tag and run the specific tests, go to run/debug configuration and add the following tags as follows,
      tags = "@smoke @regression",