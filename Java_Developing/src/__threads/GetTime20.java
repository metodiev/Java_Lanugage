package __threads;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime20 extends Thread {
	
	public void run(){
		
		Date rightNow;
		Locale CurrentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for (int i = 1; i < 20; i++) {
			rightNow = new Date();
			CurrentLocale = new Locale("en");
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, CurrentLocale);
			
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, CurrentLocale);
			
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e ) {
				
			}
			
		}
		
		
	}

}
