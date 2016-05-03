package _1_language;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class IntroClass {

	/***
	 * Writing 
	 * Compiling it into bytecode
	 * running the bytecode
	 * 
	 */
	
	
	
	/***
	 * JVM - JAva Virtual machine - On JVM you can run java programs 
	 * JVM - Set the memory available to the JVM - java -mx20m java program // for max; java -ms20m java program // for minimum
	 * JVM - Java memory command line arguments - java -Xms32m -Xmx200m -XX:MaxPermSize=128m com.SomeJavaProgram
	 * javac - java compiler
	 * jar - Java Archive
	 * JMX - Java Management Extensions ; Java technology that supplies tool for managing and monitoring applications
	 * javadoc - HTML documentation based on Java Source code
	 *  The java Tool - Execute the java class; load the byte code of the specified class and invokes the main() method java Tool can also run jar files
	 *  The javadoc Tool - generates HTML documentation from Java source files
	 *  The jar Tool - create a JAR archive file by combining multiple files of Java application, you can also use the jar tool to extract the content of JAR file
	 *  The javap Tool - displays information about the methods, variables and parameters present in the classl; javap -help
	 *  The jarsinger Tool - sign Java ARchive JAR files and verify the signatures of signed JAR files
	 *  native2ascii Tool - convert files with native encoded characters to a file with Unicode; native2ascii -reverse|encoding|Joption
	 *  jconsole Tool - JMX-compliant graphical toll for monitoring a Java virtual machine 
	 */  
	
	/***
	 * COmpile java with Command line or terminal
	 * 
	 * 1. Write your java code(filename.java must be such as java class)
	 * 2. navigate to the file directory and run command: javac filename.java
	 * 3. Command will create filename.class file now you can run the java program by typing java filename.class
	 */
	
	
	/***
	 * Create Jar file
	 * 
	 * 1. Create jar file - jar cf jar-file input file
	 * 2. View the content of JAR file - jar tf jar-file
	 * 3. Extract the content of JAR file jar xf jar-file
	 * 4. Extract the specific files from a JAR file - jar xf jar-file archived-file name
	 * 5. Run jar application - java -jar filename.jar
	 */
	
	/***
	 * Create JavaDoc
	 * 
	 * @author - the author name of 
	 * {@code}
	 * @deprecated - some class or member is deprecated
	 * {@docRoot} - the root directory of the current documentation
	 * @exception - an exception in some method
	 * @param - a method parameter
	 * @see - link to another topic
	 * @since - release date
	 * @version - version of the class
	 * @return - a method's return value.
	 * 
	 * @param args
	 */
	
	/***
	 * Garbage Collection
	 *  Use System.runFinalization()
	 *  Use System.gc 
	 */
	
	/***
	 * Variables are date placeholder. The are two data types in Java:
	 * 1. Reference - provide a reference to an object
	 * 2. Primitive types - hold a primitive data (hold in stack data)
	 */
	
	/***
	 * Annotation  - form of syntactic metadata that can be added to Java source code, Classes methods, variables, parameters and packages may be annotated
	 * Annotation - is a super - interface of all annoatations
	 * 
	 * Retention - oikicy determines at what poing an annotation is discarded
	 *
	 * Annotations are notes in Java programs to instruct the Java compiler to do something. 
	 * Java provides three standard annotations and four standard meta-annotations.
	 * Annotation Standards - Deprecated, Override, Suppress Warnings
	 * Annotation standard meta-annotations part of jala.lang.annotation - Documented, Inherited, Retention, Target
	 * 
	 *  An annotation type is a Java interface.
	 *  All annotation types are subinterfaces of the java.lang.annotation.Annotation interface.
	 *  It has one method, annotation Type, that returns an java.lang.Class object.
	 * 
	 * No annotation can inherit another.
	 * All methods declared by an annotation must be without parameters.
	 * Annotations cannot be generic.
	 * They cannot specify a throws clause.
	 * 
	 */
	
	
	
	
	//Declare Constant
	
	static final float number = 3.14F;
	static final float PI = (float) 22 / 7 ;
	
	
	public static void main(String[] args) {
		
		//for Garbage Collector
		System.runFinalization();
		System.gc();
		
		System.out.println("Java language");
		
		System.out.println(PI);
		
		

	}

}
