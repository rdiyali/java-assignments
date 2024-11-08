package binarySearchTree;

public class binarySearchTest {
	
	public static void main(String[] args) {
		
		int[] sortedNumber = {0,2,4,6,7,9,10,12,14,15,26,33,39,100};
		
		System.out.println(binarySearchMethod(sortedNumber, 14));
		
	}
	
	public static  int binarySearchMethod(int[] sortedNumbers, int target) {
		
		 int first = 0, last = sortedNumbers.length-1;
		 
		 while(first <= last ) {
			 int middlePosition = (first+last) / 2;
			 int middleNumber = sortedNumbers[middlePosition];
			 
			 if(target == middleNumber) {
				 return middlePosition;
			 }
			 
			 if(target < middleNumber) {
				 last = middlePosition - 1;
			 } else {
				 first = middlePosition + 1;
			 }
		 }
		 
		 return -1;
	
	}

}
