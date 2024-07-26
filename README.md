# Description

This project demonstrates the use of the Randoop unit test generation tool. Randoop can be integrated into a project by downloading the JAR file and incorporating it into the Java project.
Using the CommandLine, Randoop generates a test class that encompasses all testable classes within the project.

# Instruction

### Prerequisite

1. Intellij
2. Any Java version

### Procedure

1. You need to compile your project, because Randoop needs bytecode.
2. Project Structure -> add JAR -> select Randoop -> apply
3. create a text file `myclasses` to specify which classes we should test
4. Run the following command for creating unit tests:

  `java -classpath ./out/production/RandoopExample:randoop-all-4.3.3.jar randoop.main.Main gentests --classlist=myclasses.txt` 
