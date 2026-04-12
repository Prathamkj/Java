import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the Character :");
        char cha = sc.nextLine().charAt(0);
        // taking character as ann input
        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != cha){
                ans = ans + ch;
            }
        }
        System.out.println(ans);
    }
}

// Reverse of the String

// import java.util.*;

// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
        
//         String rev = "";
        
//         for(int i = str.length() - 1; i >= 0; i--){
//             rev = rev + str.charAt(i);
//         }
        
//         System.out.println(rev);
//     }
// }