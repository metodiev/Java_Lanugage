package bufferreader;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TestScannerDemo {

	public static void main(String[] args) throws IOException {
		   
	      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        
	       String test ;
	       test = br.readLine();*/
	       
	       System.out.println(returnCatch());
	     
	}
	
	
	
	public static int  returnCatch(){
		
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		}
		finally {
			System.out.println("asd");
		}
		
		
	}

}
