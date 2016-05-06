package __threads;

import java.util.*;
import java.text.DateFormat;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit.*;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.Environment;

public class Threads {

	public static void main(String[] args) {
		
		/*Thread getTime = new GetTime20();
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAggain = new GetTheMail(20);
		
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAggain).start();*/
		
		addThreadsToPool();
		
	}

	public static void addThreadsToPool() {
		
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
			
		//eventPool.scheduleAtFixedRate(new GetTime20(), 0, 2, TimeUnit.SECONDS);
	//	eventPool.scheduleAtFixedRate(new GetTheMail(5), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("CODING"), 0, 3, TimeUnit.SECONDS);
		
		
		System.out.println("Number of theread: "  + Thread.activeCount());
		
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfThreads);
		
		for(Thread i : listOfThreads){
			System.out.println(i.getName());
		}
		
		for(Thread i : listOfThreads){
			System.out.println(i.getPriority());
		}
		
		eventPool.shutdown();
		
	}

}
