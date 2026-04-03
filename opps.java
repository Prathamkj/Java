//  1st is Classes and objects
import java.util.*;
class Pratham{
    int id;
    String name;

    // constructor
    Pratham(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){
       Pratham p1 = new Pratham(1, "Pratham");
       System.out.println(p1.id);
       System.out.println(p1.name);  
    }
}