Clark Automation Project
========================

Summary
--------
- The project has been implemented as a Maven Project using Selenium with Java.
- Cucumber/Gherkin has been used to implement the BDD feature file and Step Definitions.
- Page Object Model (POM) design pattern has been used in combination with Page Factory Design Pattern.
- OOP Principles have been used to optimize the code.
- log4j component has been added to generate logs wherever required.
- Extent Spark reporting has been incorporated. Reports are generated at the end of each execution (Details below).
- The Suite consists of 1 Feature File, 6 Scenarios and 32 Step Definitions and executes in ~ 1 min.
  However, "sleep" method has been added strategically to slow down execution deliberately for demo purposes.

Prerequistes
-------------
- Windows 10
- Java 15.0.2
- Apache Maven 3.8.2
- Chrome Browser  94.0.4606.54 (Preferred) or FireFox 78.14

Instructions to execute the Automation Suite
---------------------------------------------
1) Make sure the prerequisites are installed with the same major version as above. Older versions MAY result in incompatibility issues.
2) Add Java and Maven to PATH in System Properties so that you can run them from any directory.
3) On the project page in github, click on the "Code" button (green) and "Download zip"
  (Alternatively if you have git installed, you can do a git clone)
4) Unzip the download .zip file.
5) On Windows command line, navigate to the project main folder where pom.xml is located.
6) Execute "mvn clean install". This command will download the dependencies, build the project and execute too.
Please be patient while the dependencies are getting downloaded for the first time, and keep your fingers crossed :-)
7) Once the build and run is successful, you can check the execution status for all the Cucumber step definitions on the command line.
8) Project can also be executed from any IDE (assuming dependencies get resolved successfully. 
   To execute from IDE, run "src/test/java/myRunner/RunnerTest.java" as JUnit Test.
10) You can also check the Spark HTML Report at {project_home}/test-output/SparkReport/Spark.html

**Note**: 
1) If mvn clean install throws errors, please open the project in any IDE (IntelliJ/Eclipse/VS Code) and the IDE will download the dependencies. 
You may also need to re-build the project on the IDE.
2) Clark Recommendation funnel redirects to User login page sometimes when you hit the URL. If this happens, please stop the test, close the browser and restart test.
If nothing works, please feel free to contact me :-)

