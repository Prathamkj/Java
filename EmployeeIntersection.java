
// 
// The question is asking you to write a Java program that finds the intersection of two integer arrays
// (employee IDs of Program A and Program B).
// If no common employees are found, it should print "No common employees"
//
//

import java.util.*;

public class EmployeeIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        // Input first array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // int[] ans = new int[age];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {

            arr2[i] = sc.nextInt();
        }

        // Store first array elements in a HashSet
        HashSet<Integer> set1 = new HashSet<>();
        // No duplicates allowed in HashSet
        for (int num : arr1) {
            set1.add(num);
        }

        // Find intersection
        HashSet<Integer> intersection = new HashSet<>();
        // check in the second Array stored in set1
        for (int num : arr2) {
            // if present in set1 then add to intersection
            if (set1.contains(num)) {
                // if the array 2 elements cointains in the set1 then add to intersection -> set2
                intersection.add(num);
            }
        }

        // Output result
        if (intersection.isEmpty()) {
            System.out.println("No common employees");
        } else {
            for (int id : intersection) {
                // then print the intersection elements
                System.out.print(id + " ");
            }
        }
    }
}
