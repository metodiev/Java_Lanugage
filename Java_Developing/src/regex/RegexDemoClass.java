package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoClass {

	public static void main(String[] args) {
		
		String text = "Pesho - 4123, Srefan - 41413, Toshko - 214123 1243, Gosho";
	
		String regex = "\\d+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("asd");
		
		while (matcher.find()) {
			String match = matcher.group(0);
			String replacementString = makeReplacementString(match);
			
			matcher.appendReplacement(buffer, replacementString);  
			
		}
		
		

	}
	
	private static String makeReplacementString(String match){
		String result = "";
		
		for (int i = 0; i < match.length(); i++) {
			result = result + "*";
			
		}
		return result;
	}

}
