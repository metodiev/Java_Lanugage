package __exeption_errors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class RuntimeException {

	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		/*** Exception in Java
		Arithmetic
		ClassNotFound
		IllegalArgument
		IndexOutOfBounds
		InputMismatchException
		IOException
		*/
		divideByZero(2);
		System.out.println("How old are you");
		int age = chackValidAge();
		
		if(age != 0){
			System.out.println("You are " + age + " years old");
		}
		
		getAFile("./filename.txt");
		
	}
	
	public static void getAFile(String fileName){
		try {
			FileInputStream file = new FileInputStream("filename");

			
		} catch (FileNotFoundException e) {
			System.out.println("Sorry can't find that file");
		}
		catch(IOException e){
			System.out.println("Unknown IO Error");
		}
		
		/*catch(ClassNotFoundException e | IOException e){
			
		}*/
		
		catch(Exception e){
			System.out.println("Some error occured");
		}
		finally {
			System.out.println("");
		}
		
	}
	
	
	public static int chackValidAge(){
		try {
			return input.nextInt();
		} catch (InputMismatchException e) {
			input.next();
			System.out.println("The number isn't correct");
		}
		return 0;
	}
	
	
	
	
	public static void divideByZero(int a){
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			 System.out.println("You can divide by zero");
			 System.out.println(e.getMessage());
			 
			 System.out.println(e.toString());
			 e.printStackTrace();
		}
	}

}
