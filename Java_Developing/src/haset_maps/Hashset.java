package haset_maps;

import java.util.*;

public class Hashset {

	public static void main(String[] args){
		
		
		Random rand = new Random(47);
		
		List<String> names = Arrays.asList("Pesho", "Goso", "Ivan", "Pesho", "Pesho");
		HashSet<String> set = new <String>HashSet();
		
		
		for (int i = 0; i < 10000; i++) {
			set.add(names.get(rand.nextInt(names.size())));
		}
		
		System.out.println(set);
		
	}
	
}
