import java.util.Arrays;

// Part 4 Searching Algorithms

public class SearchAlgorithms {

    // Method 1 Recursive Linear Search

    public static int recursiveLinearSearch(int[] numbers, int target) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                return recursiveLinearSearch(numbers, target, 0);
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error finding " + target + " in the array using Recursive Linear Search: " + e.getMessage());
            throw e;
        }
    }

    // You may use this private helper method:

    private static int recursiveLinearSearch(int[] numbers, int target, int index) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                if(index >= numbers.length) {
                    return -1;
                } else if (numbers[index] == target){
                    return index;
                } else {
                    return recursiveLinearSearch(numbers, target, index + 1);
                }
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error finding " + target + " in the array using Recursive Linear Search: " + e.getMessage());
            throw e;
        }
    }

    //  Method 2 Iterative Binary Search

    public static int binarySearch(int[] numbers, int target) {
        try {
            if(numbers == null || numbers.length == 0){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                int start = 0;
                int end = numbers.length;
                    do {
                        int mid = start + end / 2;
                        if(numbers[mid] == target){
                            return mid;
                        } else if (numbers[mid] < target) {
                            start = mid + 1;
                        } else{
                            end = mid - 1;
                        }
                    } while (start < end);
                return -1;
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error finding " + target + " in the array using Iterative binary search: " + e.getMessage());
            throw e;
        }
    }
}
