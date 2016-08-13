package haset_maps;

import java.util.*;

public class TreeSetHashDemo {
	
	public static void main(String[] args){
		
		TreeSet<String> set = new TreeSet<String>();
		
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(2);
		set.add("pesho");
		set.add("Gosho");
		set.add("Pesho");
		set.add("Adil");
		set.add("pesho");
		set.add("pesho");
		
		
		System.out.println(set);
		
		
	}

}
