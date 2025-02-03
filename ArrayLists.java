// ArrayLists.java

import java.util.ArrayList;

public class ArrayLists {
    public static void separateEvenOdd(int[] numbers) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
    
    public static int findSmallestDistance(int[] numbers) {
        if (numbers.length < 2) return -1;
        
        int minIndex = 0;
        int minDistance = Math.abs(numbers[1] - numbers[0]);
        
        for (int i = 1; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i + 1] - numbers[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }
