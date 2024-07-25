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
