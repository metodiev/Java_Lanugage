package haset_maps;

import java.util.*;

public class SetAndMapsFistTask {

	public static void main(String[] args) {
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		
		/*set.containsAll(set2);
		System.out.println(set);
		
		//sechenie
		set.retainAll(set2);
		System.out.println(set);*/
		
		//obedinenie
		set.addAll(set2);
		System.out.println(set);
	
		
	}

}
