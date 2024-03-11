# IES_107876
Introdução à Engenharia de Software


**Create a project:** $ mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -
DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

 ## Steps
+ Compile the source code of your Java project
  
```
 mvn compile
```
+ Get dependencies, compiles the project and creates the jar

```
 mvn package 
```
+ Removes the target directory in your project

```
mvn clean install 
```
+ Adapt to match your own package structure and class name
```
mvn exec:java -Dexec.mainClass="com.mycompany.app.WeatherStarter"
```

+  Git repository commit history
```
 git log --reverse --oneline
```
