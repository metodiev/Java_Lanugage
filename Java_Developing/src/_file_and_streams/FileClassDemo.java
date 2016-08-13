package _file_and_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class FileClassDemo {
	
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Miroslav\\Desktop\\Luxoft Interviewer.txt");
		
		File writeFile = new File("C:\\Users\\Miroslav\\Desktop\\output.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile))){
			
			bw.write("Text to write in file");
			bw.newLine();
			bw.write("sadasdsgk,kasdmfglskdmfgsdlkfmgsdklfgmsdmfkl");
			
		}
	
		
		
		File[] filesList = file.listFiles();
		
		//try with resourses
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			
		/*	String readLine = br.readLine();
			
			while (readLine != null) {
				System.out.println(readLine);
				
				readLine = br.readLine();
				
			}*/
			
			
			String readLine = null;
			
			
			while ((readLine  = br.readLine()) != null) {
				System.out.println(readLine);
				
				
				
			}
		}
		
		
		//System.out.println(filesList.length);
		
		boolean isDirectory = file.isDirectory();
		System.out.println(isDirectory);
	}

}
