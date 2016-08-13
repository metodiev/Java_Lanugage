package haset_maps;

import java.util.*;
public class LinkedHashSetDemo {
public static void main(String[] args){
		
		
		Random rand = new Random(47);
		
		List<String> names = Arrays.asList("Pesho", "Goso", "Ivan", "Pesho", "Pesho", "pesho", "PESHO");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.addAll(names);
		set.add("peSho");
		/*for (int i = 0; i < 10000; i++) {
			set.add(names.get(rand.nextInt(names.size())));
		}*/
		
		System.out.println(set);
		
	}
	
	
}
