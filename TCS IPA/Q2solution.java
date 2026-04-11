import java.util.*;

// -------------------- CLASS --------------------
class Laptop {

    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    // Constructor
    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    // Getters
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
public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Laptop[] arr = new Laptop[4];

        // Input 4 Laptop objects
        for (int i = 0; i < 4; i++) {

            int id = sc.nextInt();
            sc.nextLine();

            String brand = sc.nextLine();
            String osType = sc.nextLine();

            double price = sc.nextDouble();
            sc.nextLine();

            int rating = sc.nextInt();
            sc.nextLine();

            arr[i] = new Laptop(id, brand, osType, price, rating);
        }

        // Input search values
        String searchBrand = sc.nextLine();
        String searchOs = sc.nextLine();

        // Call method 1
        int count = countOfLaptopsByBrand(arr, searchBrand);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }

        // Call method 2
        Laptop[] result = searchLaptopByOsType(arr, searchOs);

        if (result == null) {
            System.out.println("The given os is not available");
        } else {
            for (Laptop l : result) {
                System.out.println(l.getLaptopId());
                System.out.println(l.getRating());
            }
        }
    }

    // -------------------- METHOD 1 --------------------
    public static int countOfLaptopsByBrand(Laptop[] arr, String brand) {

        int count = 0;

        for (Laptop l : arr) {
            if (l.getBrand().equalsIgnoreCase(brand) && l.getRating() > 3) {
                count++;
            }
        }

        return count;
    }

    // -------------------- METHOD 2 --------------------
    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String osType) {

        ArrayList<Laptop> list = new ArrayList<>();

        for (Laptop l : arr) {
            if (l.getOsType().equalsIgnoreCase(osType)) {
                list.add(l);
            }
        }

        if (list.size() == 0) {
            return null;
        }

        // Sort in descending order of laptopId
        Collections.sort(list, (a, b) -> b.getLaptopId() - a.getLaptopId());

        return list.toArray(new Laptop[0]);
    }
}