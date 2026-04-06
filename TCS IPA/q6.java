import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] word = str.split(" ");
		String vowel = "aeiouAEIOU";
		String ans = "";
		// answer string and vowel string
		for(int i=0; i< word.length; i++){
		    
		    String wr = word[i];
		    // getting current words
		    if(wr.length() > 0){
                // if it is not empty then 
                // now we take first Character
                char ch = wr.charAt(0);
                // now we check if vowel exist karta hai ki nhi word ke first index par agar karta hai toh push it
                if(vowel.indexOf(ch) != -1){
                    ans = ans + ch;
                }
		    }
		}
		System.out.println(ans);
	}
}