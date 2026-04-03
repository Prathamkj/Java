// import package for Scanner and ArrayList
import java.util.*;

// -------------------- CLASS --------------------
// Class is a blueprint to create objects
class Laptop {

    // -------------------- ENCAPSULATION --------------------
    // Variables are private (data hiding)
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    // -------------------- CONSTRUCTOR --------------------
    // Used to initialize object when created
    public Laptop(int laptopId, String brand, String osType, double price, int rating) {

        // 'this' refers to current object
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    // -------------------- GETTERS --------------------
    // Used to access private variables

    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public String getOsType() {
        return osType;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}

// -------------------- MAIN CLASS --------------------
public class Solution {

    // -------------------- METHOD 1 --------------------
    // Count laptops by brand AND rating > 3
    public static int countOfLaptopsByBrand(Laptop[] arr, String brand) {

        int count = 0; // store result

        // Loop through array of objects
        for (Laptop l : arr) {

            // Access data using getters (because variables are private)
            // equalsIgnoreCase → ignores upper/lower case
            if (l.getBrand().equalsIgnoreCase(brand) && l.getRating() > 3) {
                count++; // increase count
            }
        }
        return count; // return final count
    }

    // -------------------- METHOD 2 ----------------------
    // Search laptops by OS and sort by id (descending)
    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String osType) {
        // in thiis method return type is Array 

        // ArrayList → dynamic size (can grow)
        ArrayList<Laptop> list = new ArrayList<>();

        // Step 1: filter matching laptops
        for (Laptop l : arr) {

            // check OS match (case insensitive)
            if (l.getOsType().equalsIgnoreCase(osType)) {
                list.add(l); // add to list
            }
        }

        // If no data found
        if (list.isEmpty()) {
            return null;
        }

        // -------------------- SORTING --------------------
        // Sort in descending order of laptopId
        list.sort((a, b) -> b.getLaptopId() - a.getLaptopId());

        // -------------------- CONVERT LIST TO ARRAY --------------------
        // Required because return type is Laptop[]
        Laptop[] result = new Laptop[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // -------------------- MAIN METHOD --------------------
    public static void main(String[] args) {

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Array of objects (stores 4 Laptop objects)
        Laptop[] arr = new Laptop[4];

        // -------------------- INPUT --------------------
        // Loop to read 4 laptops data
        for (int i = 0; i < 4; i++) {
            /*
                Now here we will start taking the inputs
                123
                HP
                Windows
                35000
                5
                // like this
            */
            int id = sc.nextInt();

            // IMPORTANT: clear buffer after nextInt()
            sc.nextLine();

            String brand = sc.nextLine();
            // both inputs for brand and operating system
            String os = sc.nextLine();

            double price = sc.nextDouble();
            int rating = sc.nextInt();

            // clear buffer again
            sc.nextLine();

            // -------------------- OBJECT CREATION --------------------
            // Create object using constructor
            arr[i] = new Laptop(id, brand, os, price, rating);
        }

        // Read inputs for methods
        String brandInput = sc.nextLine();
        String osInput = sc.nextLine();

        // -------------------- METHOD CALL 1 --------------------
        int count = countOfLaptopsByBrand(arr, brandInput);

        // Output based on condition
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }

        // -------------------- METHOD CALL 2 --------------------
        Laptop[] result = searchLaptopByOsType(arr, osInput);

        // Output based on condition
        if (result == null) {
            System.out.println("The given os is not available");
        } else {

            // Print laptopId and rating
            for (Laptop l : result) {
                System.out.println(l.getLaptopId());
                System.out.println(l.getRating());
            }
        }
    }
}