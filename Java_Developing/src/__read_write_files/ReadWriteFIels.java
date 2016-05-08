package __read_write_files;

import java.io.*;

public class ReadWriteFIels {

	public static void main(String[] args) {
		 
		Customer[] customers = getCustomers();
		
		PrintWriter writer = createFile("");

	}
	
	private static class Customer{
		public String firstName, lastName;
		public int custAge;
		
		public Customer(String firstName, String lastName, int custAge){
			this.firstName = firstName;
			this.lastName = lastName;
			this.custAge = custAge;
		}
		
	
	}
	
	private static Customer[] getCustomers(){
		
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("Firstname", "Lastname", 26);
		customers[2] = new Customer("Firstname0", "Lastname0", 27);
		customers[3] = new Customer("Firstname1", "Lastname1", 28);
		customers[4] = new Customer("Firstname2", "Lastname2", 29);
		customers[5] = new Customer("Firstname3", "Lastname3", 30);
		
		
		return customers;
	}
	
	private static PrintWriter createFile(String fileName){
		try {
			File listOfNames = new File(fileName);
			PrintWriter infoToWrite = new PrintWriter(
					new BufferedWriter(
							new FileWriter(listOfNames)));
		} catch (IOException e) {}
			System.out.println("An IO error occured");
			return null;
		
	}
	
}
