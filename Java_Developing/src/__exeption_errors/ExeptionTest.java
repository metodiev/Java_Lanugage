package __exeption_errors;

public class ExeptionTest {

	public static void main(String[] args) {
		
		int i = 10000;
		
		while(i > 0){
			try {
				int p = 10/0;
			} catch (Exception e) {
			System.out.println("Invalid Operation");
			}
			
			System.out.println("asdasd");
			i--;
		}
			
		

	}

}
