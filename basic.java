// Java ka sara ka sara code class ke andar likhna hota hai

import java.util.Arrays;
// for sorting the array

class basic{
    // Java main program ka execution main method se start hota hai
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("This is my first java program");

        // variables
        String name = "Pratham";
        int age = 25;
        float marks = 88.5f;
        char grade = 'A';

        // Java Types
        // Primitive Data Types
        // int, float, double, char, boolean, byte, short, long
        long phone = 1234567890L;
        // last me L means long type ka variable hai
        boolean isJavaFun = true;
        // Non-Primitive Data Types
        // String, Arrays, Classes, Interfaces
        System.out.println(name.length());


        // CharAt
        // to find the character at a specific index
        System.out.println(name.charAt(0)); 
        // java is the 0th index based language
        // so first character is at index 0

        // replace 
        name.replace('a', 'o');
        // in java we cannot change the original string
        // strings is immutable in java

        name.substring(0, 3);
        // from 0th to 3rd index it will print

        // Arrays
        // This is how we declare an array in java
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[0]);
        // or we can also declare and initialize an array in one line
        int[] numbers = {1, 2, 3, 4, 5};
        
        // IMP functions of array
        System.out.println(numbers.length);
        // sort
        // all the elements in uppercase
        Arrays.sort(numbers);

        // 2d array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(matrix[1][1]);

    }
}