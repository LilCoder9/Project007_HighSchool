/**
 * Class ReverseString
 * 
 */
import java.util.*;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String  sentence;
        String  reversed = "";
        int     i;
        String rev;
        
        System.out.print("Enter a sentence: ");
        sentence = console.nextLine();
        
        i = sentence.length()-1;
        
        for(  int y = 0; i >= y; i--)
        {
            rev = sentence.substring( i,i+1);
            reversed = reversed + rev;
        }
        
        
        System.out.printf("Original: %s\n", sentence);
        System.out.printf("Reversed: %s\n", reversed);
        
        if( sentence.equals(reversed) == true)
        {
            System.out.println("The sentence (word) IS a palindrome!");
        }
        else 
        {
            System.out.println("The sentence (word) IS NOT a palindrome.");
        // determine if the string is a palindrome or not and display.
        
    }
  }
}
