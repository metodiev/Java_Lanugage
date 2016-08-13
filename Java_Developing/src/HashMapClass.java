
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class HashMapClass {

	private static final String TEXT = "Test text words Count " + 
			"word count teSt";
	
	public static void main(String[] args) {
		Map<String, Integer> wordsCount = createWordsCounts(TEXT);
		
		printWordsCount(wordsCount);

	}

	private static Map<String, Integer> createWordsCounts(String text) {
		Scanner textScanner = new Scanner(text);
		
		Map<String, Integer> words = new TreeMap<String, Integer>();
		while(textScanner.hasNext()){
			String word = textScanner.next();
			Integer count = words.get(word);
			
			if(count == null){
				count = 0;
			}
			
			words.put(word, count +1 );
		}
		return words;
		
	}

	private static void printWordsCount(Map<String, Integer> wordsCounts) {
		
		for(Map.Entry<String, Integer> wordEntry : wordsCounts.entrySet()){
			 System.out.printf(
			          "word '%s' is seen %d times in the text%n",
			          wordEntry.getKey(), wordEntry.getValue());
		}
		
		
	}

}
