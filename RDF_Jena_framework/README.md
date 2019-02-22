# Doston Hamrakulov

## Working with RDF files and making queries with Jena Framework over RDF files in Java
Here, we make queries on RDF file by using Jena Framework in Java. We have different RDF files and queries done to retieve specific information. Each queries description is given below.

## Installing Jena in Ubuntu ##

* Download Jena framework from:
    * http://jena.apache.org/
    * Or use in the directory which I have added"
* Extract .jar files in any directory:
    * In my case: /home/doston/Partation/Validating-XML-file-against-XSD-document-in-Python-and-Java/RDF_Jena_framework/apache-jena-3.10.0
    * But you can simple extract them in Download folder
* Setting up your Environment:

An environment variable JENA_HOME is used by all the command line tools to configure the class path automatically for you. You can set this up as follows:

**On Linux / Mac**

* export JENA_HOME=the directory you downloaded Jena to
* export PATH=$PATH:$JENA_HOME/bin
* sparql --version


**On Linux / Mac**

* SET JENA_HOME =the directory you downloaded Jena to
* SET PATH=%PATH%;%JENA_HOME%\bat
* sparql.bat --version


**Basic Steps**
1. Download Java SDK
2. Download Jena framework
3. Set PATH, CLASSPATH and JENA_HOME environment variables
4. Open an IDE such as Eclipse, NetBeans or IntelliJ
5. Create a new Java Application Project
6. Add external Jena libraries and javadoc to project
7. Autogenerate a Class Litera.java from the Litera.rdf via jena.schemagen
8. Create java sourcecode files
9. Compile and Run



**Now, We can go on some examples:**
1. Write a Java program using the Jena framework, which reads the information about the authors and displays it
   1. We use given RDF files.
   2. Write java code
   3. Solution on Viewauthor.java

2. Write a Java program using the Jena framework, that displays which author wrote which book
   1. We use given RDF files.
   2. Write java code
   3. Solution on Merge.java

3. Write a Java program using the Jena framework, which additionally shows which author translated which book.
   1. We use given RDF files.
   2. Write java code
   3. Solution on BookTrans.java

4. Write a Java program using the Jena framework, which displays where authors and translators live
   1. We use given RDF files.
   2. Write java code

5. Write a Java program using the Jena framework, which displays whether there are translators who live in the same city like an author whose book they translated.
   1. We use given RDF files.
   2. Write java code





### Programming languages and frameworks
```[Python, Java]
// Python, Java
```

### IDE
```[atom, intellij idea]
// atom, Intellij Idea
```

## Author
**Doston Hamrakulov**
>*Software Engineer, Web Developer, Freelancer*


## Enjoyin in open-source community


