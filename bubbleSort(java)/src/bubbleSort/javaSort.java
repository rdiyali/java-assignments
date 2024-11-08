package bubbleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class javaSort {
	public static void main(String[] args) {
		ArrayList<Integer> elements = new ArrayList<>();
    	Random rand = new Random();
   
    	int ranNum = 1000000;


    	for (int i = 0; i < ranNum; i++) {
    		int randomInt = rand.nextInt(ranNum);
            elements.add(randomInt);
    	}
    	
    	long startTime = System.nanoTime();
        Collections.sort(elements);
        long endTime = System.nanoTime();
    	long duration = endTime - startTime;
    	
    	
    	System.out.println("\n" + "Time taken to sort: " + (duration / 1_000_000.0) + " milliseconds");
	}
}
