package bubbleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class runner {
    public static void main(String[] args) {
        
        ArrayList<Integer> elements = new ArrayList<>();
        Random rand = new Random();
        int ranNum = 100000;

        for (int i = 0; i < ranNum; i++) {
            int randomInt = rand.nextInt(ranNum);
            elements.add(randomInt);
        }
        
        ArrayList<Integer> elementsForCollectionSort = new ArrayList<>(elements);
        
        long startTime = System.nanoTime();
        bubbleSort(elements);
        long endTime = System.nanoTime();
        double bubbleSortTime = (endTime - startTime) / 1_000_000.0; 
        
        long startJavaTime = System.nanoTime();
        Collections.sort(elementsForCollectionSort);
        long endJavaTime = System.nanoTime();
        double collectionsSortTime = (endJavaTime - startJavaTime) / 1_000_000.0; 
        
       // System.out.println("Sorted array:");
       // for (int i = 0; i < elements.size(); i++) {
       //     System.out.print(elements.get(i) + "\t");
       //     
       //     if ((i + 1) % 10 == 0) {
       //         System.out.println();
       //     }
       // }

        System.out.println("\nTime taken by Bubble Sort: " + bubbleSortTime + " milliseconds");
        System.out.println("Time taken by Collections.sort: " + collectionsSortTime + " milliseconds");
    }
    
    public static void bubbleSort(ArrayList<Integer> elements) {
        int temp;
        boolean swapped;
        for (int i = 0; i < elements.size() - 1; i++) {
            swapped = false;
            for (int x = 0; x < elements.size() - 1; x++) {
                if (elements.get(x) > elements.get(x + 1)) {
                    temp = elements.get(x + 1);
                    elements.set(x + 1, elements.get(x));
                    elements.set(x, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
