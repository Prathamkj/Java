import java.util.*;
public class Main{
    public static void main(String[] args){
        // print the no. if spaces 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // taking string inpur
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}