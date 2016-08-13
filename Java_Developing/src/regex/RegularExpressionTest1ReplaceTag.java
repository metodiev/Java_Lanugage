package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableSet;
import java.util.TreeSet;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class RegularExpressionTest1ReplaceTag {

	public static void main(String[] args) throws IOException {
		
		
		NavigableSet org = new TreeSet<>();
		
		
		org.add("3");
		org.add("2");
		org.add("1");
		
	
		
		for (Object object : org) {
			
			System.out.println(object);
		}
		
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		while(line.equals("end")){
			
			sb.append(line);
			line = br.readLine();
			
		}
		
		String result = sb.toString().replaceAll("<a>", "[URL]");
		result = result.replaceAll("</a>", "[URL]" );
		
		System.out.println(result);
		System.out.println("test");
	}

}
