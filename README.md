
**Before testing make sure that you have already set JAVA_HOME, M2_HOME, ANDROID_HOME (for android app testing) environment variables.**

## Mobile testing
Preconditions: 
1. Install and run Appium server with such parameters: 

  - address: 127.0.0.1, port: 4723

###### Android testing:
2. Run emulator or real device. 
3. Set required capabilities in /src/main/resources/config.properties (such as android.deviceName, android.appPath)
4. Create a test using Appium Inspector or another tool to search elements' locators.
5. Create required xml file with test suite. For example, mobile.xml
6. Open terminal and go to the project directory
7. Run command 

`mvn clean -Dsuite=functional.xml test`

Make sure that all required packages are installed! 
