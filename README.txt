Prerequisites
Use JDK 11, download at https://www.oracle.com/sg/java/technologies/javase-jdk11-downloads.html
Set your JAVA_HOME environment variable to the root folder of your JDK installation.
Download maven from https://maven.apache.org/download.cgi
Installation instructions at https://maven.apache.org/install.html
Add bin folder of your maven installation into PATH enviornment variable.
Check prerequisites by openning command prompt and typing mvn -v. The command should work and you should see the Java version being 11.

To run server:
Open command prompt
Change directory to root folder (cz3002-p2)
mvn clean install
mvn jetty:run

In a web browser go to:  http://localhost:8080/.

You should see a web page with Welcome to Struts 2!

