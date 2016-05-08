package __java_algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		
		bubble_sort(input);
		

	}
	
	private static void printNumbers(int [] input){
		for (int i = 0; i < input.length; i++) {
			
			System.out.println(input[i] + ", ");
			
		}
		System.out.println();
	}
	
	
	private static void swapNumbers(int i, int j, int [] arr){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	
	//sort numbers BubbleSort
	public static void bubble_sort(int arr[]){
		int n = arr.length;
		int k;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n -1 ; j++) {
				k  = j+1;
				if(arr[j] > arr[k]){
					swapNumbers(j, k, arr);
				}
			}
		}
		printNumbers(arr);
	}

}
