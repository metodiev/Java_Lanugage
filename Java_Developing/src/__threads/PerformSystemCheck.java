package __threads;

import java.util.concurrent.locks.ReentrantLock;;

public class PerformSystemCheck implements Runnable{
	
	private String checkWhat;
	
	
	ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkWhat){
		
		this.checkWhat = checkWhat;
	}
	//first way to protect the method from java to be inviable is 
	//synchronized public void run()
	 public void run(){
		lock.lock();
		System.out.println("Checking " + this.checkWhat);
		
		lock.unlock();
	}
	
}
