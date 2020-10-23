rm -f src/*.class
rm -f myJarFile.jar
javac src/Main.java
java src/Main
jar -cvf myJarFile.jar src/Main.class