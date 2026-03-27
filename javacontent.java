import java.util.*;
import java.io.*;

/**
 * Java Learning Path - Tailored for Coding Assessments like TCS IPA.
 * 
 * Best way to learn: Un-comment the methods one by one inside the main() 
 * method, run the program, provide input in the terminal, and observe the output!
 */
public class Javacontent {

    public static void main(String[] args) {
        System.out.println("=== Java Learning Guide (Beginner to Advanced) ===\n");
        
        // UNCOMMENT the method you want to learn and test:
        
        // 1. inputOutput();
        // 2. dataTypesAndOperators();
        // 3. controlFlowAndLoops();
        // 4. arraysBasics();
        // 5. stringManipulations();   // Crucial for 15-mark questions!
        // 6. oopBasicsAndArrays();    // Crucial for 35-mark questions!
        // 7. collectionsAndSorting();
    }

    // =======================================================
    // 1. INPUT TAKING & OUTPUT (CRITICAL FIRST STEP)
    // =======================================================
    public static void inputOutput() {
        System.out.println("--- 1. Input & Output ---");
        
        // Scanner is the standard way to take input from the keyboard
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        System.out.print("Enter a decimal (double): ");
        double db = sc.nextDouble();
        
        // COMMON PITFALL ALERT: 
        // ALWAYS use sc.nextLine() after taking a primitive (nextInt, nextDouble) 
        // to consume the leftover "Enter" (newline character) before reading a String.
        sc.nextLine(); 
        
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        
        // Printing output
        System.out.println("\nResults:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + db);
        System.out.println("String: " + str);
    }

    // =======================================================
    // 2. DATA TYPES & OPERATORS
    // =======================================================
    public static void dataTypesAndOperators() {
        System.out.println("--- 2. Data Types & Operators ---");
        
        // Primitives
        int a = 10, b = 3;
        double x = 10.5;
        char c = 'A';
        boolean isJavaFun = true;
        
        // Arithmetic Operators
        System.out.println("10 / 3 = " + (a / b)); // Integer division = 3 (drops decimals)
        System.out.println("10 % 3 = " + (a % b)); // Modulo (Remainder) = 1
        
        // Typecasting (Converting integer division to decimal division)
        double divisionAsDouble = (double) a / b;  // = 3.3333...
        System.out.println("Casted division: " + divisionAsDouble);
        
        // Increment Operators
        int count = 5;
        System.out.println("Post-increment (count++): " + (count++)); // Prints 5, then becomes 6
        System.out.println("Pre-increment (++count): " + (++count));  // Becomes 7, then prints 7
    }

    // =======================================================
    // 3. CONTROL FLOW & LOOPS
    // =======================================================
    public static void controlFlowAndLoops() {
        System.out.println("--- 3. Control Flow & Loops ---");
        
        int n = 7;
        
        // If-Else
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
        
        // For Loop (Used when exactly how many times to iterate is known)
        System.out.print("For loop (1 to 5): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // While loop (Used when iterating until a condition breaks)
        // Classic Problem: Sum of digits
        int num = 125;
        int sumOfDigits = 0;
        while (num > 0) {
            sumOfDigits += num % 10; // Extract last digit (125 % 10 = 5)
            num /= 10;               // Remove last digit (125 / 10 = 12)
        }
        System.out.println("Sum of digits of 125 is: " + sumOfDigits);
    }

    // =======================================================
    // 4. ARRAYS
    // =======================================================
    public static void arraysBasics() {
        System.out.println("--- 4. Arrays ---");
        
        // Declaration & Initialization
        int[] arr = {5, 2, 8, 1, 9};
        int[] arr2 = {3,4,5};
        System.out.println("Array length: " + arr.length);
        
        // Basic Logic: Finding the maximum element
        int max = Integer.MIN_VALUE; // Start with the smallest possible integer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        
        // Sorting an array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // =======================================================
    // 5. STRINGS (Crucial for 15-mark questions)
    // =======================================================
    public static void stringManipulations() {
        System.out.println("--- 5. Strings ---");
        
        String s = "Hello World";
        
        System.out.println("Length: " + s.length());
        System.out.println("Character at index 1: " + s.charAt(1)); // 'e'
        System.out.println("Substring (0 to 4): " + s.substring(0, 5)); // "Hello" (end index exclusive)
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Contains 'World'? " + s.contains("World"));
        
        // Splitting string into words
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Word count in '" + sentence + "': " + words.length);
        
        // String Reversal (Common Question)
        String original = "Java";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed '" + original + "': " + reversed);
    }

    // =======================================================
    // 6. OOP BASICS & ARRAY OF OBJECTS (Crucial for 35-mark questions)
    // TCS IPA strictly tests your ability to create a "POJO" 
    // (Plain Old Java Object) and iterate over an array of them.
    // =======================================================
    public static void oopBasicsAndArrays() {
        System.out.println("--- 6. Object-Oriented Programming ---");
        
        // 1. Creating objects using our Student class (defined at the bottom)
        Student s1 = new Student(1, "Alice", 85.5);
        Student s2 = new Student(2, "Bob", 92.0);
        Student s3 = new Student(3, "Charlie", 78.5);
        
        // 2. Creating an Array of Objects (TCS Favorite!)
        Student[] students = {s1, s2, s3};
        
        // 3. Solving a query: Find the student with the highest marks
        Student topStudent = students[0];
        
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMarks() > topStudent.getMarks()) {
                topStudent = students[i]; // Update the top student
            }
        }
        
        System.out.println("Top Student Name: " + topStudent.getName());
        System.out.println("Top Student Marks: " + topStudent.getMarks());
    }
    
    // =======================================================
    // 7. COLLECTIONS (List, ArrayList)
    // =======================================================
    public static void collectionsAndSorting() {
        System.out.println("--- 7. Collections & Sorting ---");
        
        // Lists (Dynamic Arrays - no fixed size)
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        
        System.out.println("Original List: " + names);
        
        // Sorting a List alphabetically
        Collections.sort(names);
        System.out.println("Sorted List: " + names);
        
        // Iterating a List (Enhanced For-Loop)
        System.out.print("Elements: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

// =======================================================
// Required for Section 6 (OOP)
// This is exactly how you must create classes in TCS IPA exams.
// =======================================================
class Student {
    // 1. Private attributes
    private int id;
    private String name;
    private double marks;

    // 2. Parameterized Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // 3. Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }
}
