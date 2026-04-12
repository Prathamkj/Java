import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String lowe = sc.nextLine();
        int count = 0;

        for(int i = 0; i < lowe.length(); i++){
            char ch = lowe.charAt(i);

            // accessing each Character
            if(Character.isLowerCase(ch)){
                count++;
            }
        }

        System.out.println("The Number of Lowercase letters are :" + count);
    }
}

Java has many such methods inside wrapper classes:

Character.isUpperCase(ch)
Character.isDigit(ch)
Character.isLetter(ch)
Character.toLowerCase(ch)

👉 Always remember: they must be called using Character.