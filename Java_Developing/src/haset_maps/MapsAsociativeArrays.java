package haset_maps;

import java.util.*;

public class MapsAsociativeArrays {
	
	public static void main(String[] args){
		
		HashMap<String, Integer> studentsGrades = new HashMap<>();
		
		studentsGrades.put("Pesho", 2);
		studentsGrades.put("Mimi", 6);
		studentsGrades.put("Didi", 3);
		studentsGrades.put("Pesho", 2);
		
		
		System.out.println(studentsGrades.get("Pesho"));
		
	    for (String string : studentsGrades.keySet()) {
			System.out.println(string);
		}
	    
	    
	    for (Integer values : studentsGrades.values()) {
			System.out.println(values);
		}
		
	    
	    for (Map.Entry<String, Integer> data : studentsGrades.entrySet()) {
			//System.out.println(data);
			
			System.out.printf("%s -> %s\n", data.getKey(), data.getValue().toString());
		}
	    
	    HashMap<String, HashSet<Integer>> students = new HashMap<>();
	    
	    students.put("Pesho", new HashSet<>());
	    students.get("Pesho").add(1);
	    
	    System.out.println(students.get("Pesho"));
	    
	}

}
