import java.util.*;

class MyClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // =====================================================
        // 🔹 1. Single Integer
        // INPUT:
        // 5
        int n1 = sc.nextInt();

        // =====================================================
        // 🔹 2. Two Integers
        // INPUT:
        // 10 20
        int a = sc.nextInt();
        int b = sc.nextInt();


        // =====================================================
        // 🔹 3. Integer + String (NO SPACE)
        // INPUT:
        // 5 hello
        int num = sc.nextInt();
        String word = sc.next();


        // =====================================================
        // 🔹 4. Integer + String (WITH SPACE)
        // INPUT:
        // 5
        // Hello World
        int num2 = sc.nextInt();
        sc.nextLine(); // consume newline  -->  for new line
        String line = sc.nextLine();



        // =====================================================
        // 🔹 5. Full Line Input
        // INPUT:
        // This is TCS IPA exam
        String fullLine = sc.nextLine();


        // =====================================================
        // 🔹 6. Integer Array (Single Line)
        // INPUT:
        // 5
        // 10 20 30 40 50
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // =====================================================
        // 🔹 7. Integer Array (Multiple Lines)
        // INPUT:
        // 5
        // 10
        // 20
        // 30
        // 40
        // 50
        int nMulti = sc.nextInt();
        int[] arrMulti = new int[nMulti];
        for(int i = 0; i < nMulti; i++) {
            arrMulti[i] = sc.nextInt(); // same logic works
        }


        // =====================================================
        // 🔹 8. String Array (Single Words)
        // INPUT:
        // 3
        // apple mango banana
        int m = sc.nextInt();
        String[] words = new String[m];
        for(int i = 0; i < m; i++) {
            words[i] = sc.next();
        }


        // =====================================================
        // 🔹 9. String Array (With Spaces)
        // INPUT:
        // 2
        // John Doe
        // Alice Smith
        int p = sc.nextInt();
        sc.nextLine();
        String[] names = new String[p];
        for(int i = 0; i < p; i++) {
            names[i] = sc.nextLine();
        }


        // =====================================================
        // 🔹 10. Character Array
        // INPUT:
        // 3
        // a b c
        int c = sc.nextInt();
        char[] chars = new char[c];
        for(int i = 0; i < c; i++) {
            chars[i] = sc.next().charAt(0);
        }


        // =====================================================
        // 🔹 11. ID + Name
        // INPUT:
        // 2
        // 101
        // John Doe
        // 102
        // Alice Smith
        int x = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < x; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
        }


        // =====================================================
        // 🔹 12. Name + Age
        // INPUT:
        // 2
        // John Doe
        // 25
        // Alice Smith
        // 30
        int y = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < y; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
        }


        // =====================================================
        // 🔹 13. ID + Salary + Name
        // INPUT:
        // 2
        // 101 50000.5
        // John Doe
        // 102 60000.0
        // Alice Smith
        int z = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < z; i++) {
            int id = sc.nextInt();
            double salary = sc.nextDouble();
            sc.nextLine();
            String name = sc.nextLine();
        }


        // =====================================================
        // 🔹 14. String + Integer
        // INPUT:
        // John 25
        String name1 = sc.next();
        int age1 = sc.nextInt();


        // =====================================================
        // 🔹 15. Mixed Fields
        // INPUT:
        // 101 85.5 A
        // John Doe
        int id2 = sc.nextInt();
        double marks = sc.nextDouble();
        String grade = sc.next();
        sc.nextLine();
        String fullname = sc.nextLine();


        // =====================================================
        // 🔹 16. 2D Array (Matrix)
        // INPUT:
        // 2 3
        // 1 2 3
        // 4 5 6
        int r = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[r][col];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        // =====================================================
        // 🔹 17. Array + Target
        // INPUT:
        // 5
        // 1 2 3 4 5
        // 3
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        for(int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        int target = sc.nextInt();


        // =====================================================
        // 🔹 18. Two Arrays
        // INPUT:
        // 3
        // 1 2 3
        // 4 5 6
        int size2 = sc.nextInt();
        int[] arrA = new int[size2];
        int[] arrB = new int[size2];
        for(int i = 0; i < size2; i++) arrA[i] = sc.nextInt();
        for(int i = 0; i < size2; i++) arrB[i] = sc.nextInt();


        // =====================================================
        // 🔹 19. Array of Objects (ID + Name)
        // INPUT:
        // 2
        // 101
        // John Doe
        // 102
        // Alice Smith
        int size3 = sc.nextInt();
        sc.nextLine();
        int[] ids = new int[size3];
        String[] empNames = new String[size3];
        for(int i = 0; i < size3; i++) {
            ids[i] = sc.nextInt();
            sc.nextLine();
            empNames[i] = sc.nextLine();
        }


        // =====================================================
        // 🔹 20. String Split Trick
        // INPUT:
        // 10 20 30 40
        sc.nextLine(); // safety
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int[] arr3 = new int[parts.length];
        for(int i = 0; i < parts.length; i++) {
            arr3[i] = Integer.parseInt(parts[i]);
        }


        // =====================================================
        // 🔥 FINAL NOTE
        // =====================================================
        // ❌ Do NOT run all together in exam
        // ✅ Pick only required pattern

        sc.close();
    }
}