/**
 * Write a description of class RemoveString here.
 * 
 */
import java.util.*;

public class RemoveString
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int i,x;
        // Declaring a String
        String sentence, remove;
        
        System.out.print("Enter a sentence: ");
        sentence = console.nextLine();
        System.out.print("Enter a string to remove: ");
        remove = console.nextLine();
        
        System.out.printf("After removing the first occurence: %s", removeString(sentence, remove));
        // use removeString method to display result.
        
        System.out.print("After removing all occurences:      ");
        
        // use removeAll method to dispay result.
    }
    
    public static String removeString(String s, String remove)
    {
        int start;
        int end;
        
        start = s.indexOf( remove);
        
        if( start == -1)
        {
            return s;
        }
        else
        {
            return s.substring(0, start) + s.substring(start+remove.length());
        }
    }
    
   public static String removeAll(String sentence, String rem)
   {
       while( sentence.indexOf(rem) >= 0)
       {
           sentence = removeString(sentence,rem);
        }
          return sentence; 
        }
}
