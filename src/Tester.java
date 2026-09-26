import jdk.swing.interop.SwingInterOpUtils;

public class Tester {
    public static void main(String[] args) {

        System.out.println((int[]) null);

        System.out.println("                            Part 3 Recursive Array Methods: ");
        System.out.println();

        System.out.println("                            Method 1 Count Odd Values ");
        System.out.println();

        System.out.println("Expected: 3 (normal array), Actual: " + RecursionAssignment.countOdd(new int[]{4, 7, 2, 9, 5}));
        System.out.println();
        System.out.println("Expected: 0 (normal array), Actual: " + RecursionAssignment.countOdd(new int[]{2, 4, 6, 8}));
        System.out.println();
        System.out.println("Expected: 0 (empty array), Actual: " + RecursionAssignment.countOdd(new int[]{}));
        System.out.println();
        System.out.println("Expected: 0 (one element), Actual: " + RecursionAssignment.countOdd(new int[]{2}));
        System.out.println();
        System.out.println("Expected: 1 (one element), Actual: " + RecursionAssignment.countOdd(new int[]{3}));
        System.out.println();
        System.out.println("Expected: 3 (negative numbers), Actual: " + RecursionAssignment.countOdd(new int[]{-4, -7, 2, -9, 5}));
        System.out.println();
        System.out.println("Expected: 0 (negative numbers, Actual: " + RecursionAssignment.countOdd(new int[]{2, -4, 6, -8}));
        System.out.println();
        System.out.println();
        System.out.println("Expected: 3 (repeated target), Actual: " + RecursionAssignment.countOdd(new int[]{4, 7, 2, 7, 5}));
        System.out.println();
        System.out.println("Expected: 4 (repeated target), Actual: " + RecursionAssignment.countOdd(new int[]{3, 3, 3, 3}));
        System.out.println();
        System.out.println("Expected: 1 (at start), Actual: " + RecursionAssignment.countOdd(new int[]{3, 3, 3, 3}));
        System.out.println();
        System.out.println("Expected: 1 (at end), Actual: " + RecursionAssignment.countOdd(new int[]{3, 3, 3, 3}));
        System.out.println();
        System.out.println("Expected: 0 (missing target, Actual: " + RecursionAssignment.countOdd(new int[]{2, 2, 2, 2}));
        System.out.println();
        //System.out.println("Expected: Illegal Argument Exception (null array), Actual: " + RecursionAssignment.countOdd((int[]) null));
        System.out.println();




        System.out.println("                        Method 2 Find Maximum ");
        System.out.println();





        System.out.println("Expected: 9 (normal array), Actual: " + RecursionAssignment.findMaximum(new int[]{4, 7, 2, 9, 5}));
        System.out.println();
        System.out.println("Expected: 8 (normal array), Actual: " + RecursionAssignment.findMaximum(new int[]{2, 4, 6, 8}));
        System.out.println();
        System.out.println("Expected: 0 (empty array), Actual: " + RecursionAssignment.findMaximum(new int[]{}));
        System.out.println();
        System.out.println("Expected: 2 (one element), Actual: " + RecursionAssignment.findMaximum(new int[]{2}));
        System.out.println();
        System.out.println("Expected: 3 (one element), Actual: " + RecursionAssignment.findMaximum(new int[]{3}));
        System.out.println();
        System.out.println("Expected: 5 (some negative numbers), Actual: " + RecursionAssignment.findMaximum(new int[]{-4, -7, 2, -9, 5}));
        System.out.println();
        System.out.println("Expected: -2 (negative numbers, Actual: " + RecursionAssignment.findMaximum(new int[]{-2, -4, -6, -8}));
        System.out.println();
        System.out.println();
        System.out.println("Expected: 7 (repeated target), Actual: " + RecursionAssignment.findMaximum(new int[]{4, 7, 2, 7, 5}));
        System.out.println();
        System.out.println("Expected: 3 (repeated target), Actual: " + RecursionAssignment.findMaximum(new int[]{3, 3, 3, 3}));
        System.out.println();
        System.out.println("Expected: 0 (at start), Actual: " + RecursionAssignment.findMaximum(new int[]{0, 1, 1, 1}));
        System.out.println();
        System.out.println("Expected: -1 (at end), Actual: " + RecursionAssignment.findMaximum(new int[]{-3, -3, -3, -1}));
        System.out.println();
        //System.out.println("Expected: Illegal Argument Exception (null array), Actual: " + RecursionAssignment.findMaximum((int[]) null));
        System.out.println();




        System.out.println("                         Method 3 Count Occurrences ");
        System.out.println();




        System.out.println("Expected: 3 (normal array), Actual: " + RecursionAssignment.countOccurrences(new int[]{4, 7, 2, 7, 7}, 7));
        System.out.println();
        System.out.println("Expected: 0 (normal array), Actual: " + RecursionAssignment.countOccurrences(new int[]{4, 7, 2}, 9));
        System.out.println();
        System.out.println("Expected: 0 (empty array), Actual: " + RecursionAssignment.countOccurrences(new int[]{}, 5));
        System.out.println();
        System.out.println("Expected: 0 (one element), Actual: " + RecursionAssignment.countOccurrences(new int[]{2}, 3));
        System.out.println();
        System.out.println("Expected: 1 (one element), Actual: " + RecursionAssignment.countOccurrences(new int[]{3}, 3));
        System.out.println();
        System.out.println("Expected: 3 (negative numbers), Actual: " + RecursionAssignment.countOccurrences(new int[]{-4, -7, 2, -7, -7}, -7));
        System.out.println();
        System.out.println("Expected: 0 (negative numbers, Actual: " + RecursionAssignment.countOccurrences(new int[]{2, -4, 6, -8}, -3));
        System.out.println();
        System.out.println("Expected: 0 (negative numbers, Actual: " + RecursionAssignment.countOccurrences(new int[]{2, -4, 6, -8}, 3));
        System.out.println();
        System.out.println("Expected: 2 (repeated target), Actual: " + RecursionAssignment.countOccurrences(new int[]{4, 7, 2, 7, 5}, 7));
        System.out.println();
        System.out.println("Expected: 4 (repeated target), Actual: " + RecursionAssignment.countOccurrences(new int[]{3, 3, 3, 3}, 3));
        System.out.println();
        System.out.println("Expected: 1 (at start), Actual: " + RecursionAssignment.countOccurrences(new int[]{5, 3, 3, 3}, 5));
        System.out.println();
        System.out.println("Expected: 1 (at end), Actual: " + RecursionAssignment.countOccurrences(new int[]{3, 3, 3, 4}, 4));
        System.out.println();
        System.out.println("Expected: 0 (missing target, Actual: " + RecursionAssignment.countOccurrences(new int[]{2, 2, 2, 2}, 1));
        System.out.println();
        //System.out.println("Expected: Illegal Argument Exception (null array), Actual: " + RecursionAssignment.countOccurrences((int[]) null, 4));
        System.out.println();






        System.out.println("                            Part 4 Searching Algorithms ");
        System.out.println();



        System.out.println("                             Method 1 Recursive Linear Search");
        System.out.println();



        System.out.println("Expected: 3 (normal array), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{4, 7, 2, 9, 5}, 9));
        System.out.println();
        System.out.println("Expected: 1 (normal array), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{2, 4, 6, 8}, 4));
        System.out.println();
        System.out.println("Expected: -1 (empty array), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{}, 5));
        System.out.println();
        System.out.println("Expected:0 (one element), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{2}, 2));
        System.out.println();
        System.out.println("Expected: -1 (one element), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{3}, -3));
        System.out.println();
        System.out.println("Expected: 4 (negative numbers), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{-4, -7, 2, -9, 5}, -9));
        System.out.println();
        System.out.println("Expected: 2 (negative numbers, Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{2, -4, 6, -8}, 6));
        System.out.println();
        System.out.println();
        System.out.println("Expected: 1 (repeated target), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{4, 7, 2, 7, 5}, 7));
        System.out.println();
        System.out.println("Expected: 3 (repeated target), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{3, 3, 3, 3}, 3));
        System.out.println();
        System.out.println("Expected: 0 (at start), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{3, 3, 3, 3}, 3));
        System.out.println();
        System.out.println("Expected: 3 (at end), Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{3, 3, 3, 4}, 4));
        System.out.println();
        System.out.println("Expected: -1 (missing target, Actual: " + SearchAlgorithms.recursiveLinearSearch(new int[]{2, 2, 2, 2}, 0));
        System.out.println();
        //System.out.println("Expected: Illegal Argument Exception (null array), Actual: " + SearchAlgorithms.recursiveLinearSearch((int[]) null, 8));
        System.out.println();




        System.out.println("                             Method 2 Iterative Binary Search\n");
        System.out.println();




        System.out.println("Expected: 3 (even length array), Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 7, 10, 14, 18, 21}, 14));
        System.out.println();
        System.out.println("Expected: 3 (odd length array), Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 7, 10, 14, 18, 21, 23}, 14));
        System.out.println();
        //System.out.println("Expected: Illegal Argument Exception (empty array), Actual: " + SearchAlgorithms.binarySearch(new int[]{}, 3));
        System.out.println();
        System.out.println("Expected: 0 (one element), Actual: " + SearchAlgorithms.binarySearch(new int[]{2}, 2));
        System.out.println();
        System.out.println("Expected: -1 (one element), Actual: " + SearchAlgorithms.binarySearch(new int[]{3}, 56));
        System.out.println();
        System.out.println("Expected: 3 (negative numbers), Actual: " + SearchAlgorithms.binarySearch(new int[]{-23, -17, -10, -5, 14, 18, 21}, -5));
        System.out.println();
        System.out.println("Expected: 2 (negative numbers, Actual: " + SearchAlgorithms.binarySearch(new int[]{-10, -7, -3, 14, 18, 21}, -3));
        System.out.println();
        System.out.println();
        System.out.println("Expected: 1 (repeated target), Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 3, 7, 10, 14, 18, 21}, 3));
        System.out.println();
        System.out.println("Expected: 1 (repeated target), Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 7, 7, 10, 14, 18, 21, 23}, 7));
        System.out.println();
        System.out.println("Expected: 0 (at start), Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 7, 10, 14, 18, 21}, 3));
        System.out.println();
        System.out.println("Expected: 5 (at end), Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 7, 10, 14, 18, 21}, 21));
        System.out.println();
        System.out.println("Expected: 0 (missing target, Actual: " + SearchAlgorithms.binarySearch(new int[]{3, 7, 10, 14, 18, 21} , 8));
        System.out.println();
        System.out.println("Expected: Illegal Argument Exception (null array), Actual: " + SearchAlgorithms.binarySearch((int[]) null, 6));
        System.out.println();
    }
}