import java.util.*;
public class Main{
    /// printing the characters and spaces
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // countingg the spaces and the characters
        String str = sc.nextLine();
        int ctr = 0;
        int spc = 0; 
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // taking out the character
            if(ch != ' '){
                ctr++;
            }
            else{
                spc++;
            }
        }
        System.out.println(ctr +" "+spc);
    }
}
