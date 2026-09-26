import java.util.Arrays;

//Part 3 Recursive Array Methods

public class RecursionAssignment {

    // Method 1 Count Odd Values

    private static int countOdd(int[] numbers, int index) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                if (index >= numbers.length) {
                    return 0;
                } else {
//                    if(numbers[index] % 2 == 0) {
//                        return 0 + countOdd(numbers, index + 1);
//                    } else{
//                        return 1 + countOdd(numbers, index + 1);
//                    }
                    return (numbers[index] % 2) == 0 ? 0 : 1  + countOdd(numbers, index + 1);
                    // resolve current index first then calls next index
                }
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error counting odd numbers in the array: " + e.getMessage());
            throw e;
        }
    }

    // You may use this private helper method:

    public static int countOdd(int[] numbers) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                return + countOdd(numbers, 0);
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error counting odd numbers in the array: " + e.getMessage());
            throw e;
        }
    }

    // Method 2 Find Maximum

    public static int findMaximum(int[] numbers) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                return findMaximum(numbers, 0);
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error finding maximum in the array: " + e.getMessage());
            throw e;
        }
    }

    // You may use this private helper method:

    private static int findMaximum(int[] numbers, int index) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                if(index >= numbers.length){
                    return 0;
                } else {
                    int max = findMaximum(numbers, index + 1);
                    if (numbers[index] > max){
                        return numbers[index];
                    }
                    else{
                        return max;
                    }
                }
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error finding maximum in the array: " + e.getMessage());
            throw e;
        }
    }

    // Method 3 Count Occurrences

    public static int countOccurrences(int[] numbers, int target) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                return countOccurrences(numbers, target, 0);
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error counting occurrences in the array: " + e.getMessage());
            throw e;
        }
    }

    // You may use this private helper method:

    private static int countOccurrences(int[] numbers, int target, int index) {
        try {
            if(numbers == null){
                throw new IllegalArgumentException("Array is null." + numbers);
            } else{
                if(index >= numbers.length){
                    return 0;
                } else{
                    if(numbers[index] == target){
                        return 1 + countOccurrences(numbers, target, index + 1);
                    } else{
                        return countOccurrences(numbers, target, index + 1);
                    }
                }
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("Error counting occurrences in the array: " + e.getMessage());
            throw e;
        }
    }
}
