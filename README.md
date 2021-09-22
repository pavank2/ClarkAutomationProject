Clark Automation Project
==============

Prerequistes
-------------
Windows 10
Java 15.0.2
Apache Maven 3.8.2
Chrome Browser  94.0.4606.54

Instructions to execute the Automation Suite
---------------------------------------------
1) Make sure the prerequisites are installed with the same major version as above. Older versions MAY result in incompatibility issues.
2) Add Java and Maven to PATH in System Properties so that you can run them from any directory.
3) Go to github URL of the project (https://github.com/pavank2/ClarkAutomationProject) and click on the "green" and "Download zip"
  (Alternatively if you have git installed, you can do a git clone)
4) Unzip the download .zip file.
5) On Windows command line, navigate to the project main folder where pom.xml is located.
6) Execute "mvn clean install". This command will download the dependencies, build the project and execute too.
Please be patient while the dependencies are getting downloaded for the first time, and keep your fingers crossed :-)
7) You can check the status on the command line for all the Cucumber step definitions. (Please ignore the exception for Extent report pdf)
8) You can also check the Spark HTML Reports at the test-output/SparkReport/Spark.html

*This will be Italic*

**This will be Bold**

- This will be a list item
- This will be a list item