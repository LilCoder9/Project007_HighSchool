/**
 * Class SentenceStats
 * 
 */
import java.util.*;

public class SentenceStats
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int i,x;
        // Declaring a String
        String sentence;
        int    len;         // The length of the sentence
        int    words;       // numer of words in sentence
        int    vowels;      // number of vowels in sentence
        
               
        System.out.print("Enter a sentence: ");
        sentence = console.nextLine();
        System.out.printf(" Sentence Statistics:\n");
        System.out.printf("   Characters = %d\n", sentence.length() );
        System.out.printf("   Words      = %d\n", countWords(sentence) );
        System.out.printf("   Vowels     = %d\n", countVowels(sentence) );
    }
    
    public static int countWords( String sentence)
    {
        int i;
        int words=0;
        
        i = sentence.length() -1;
        while( i >= 0)
        {
            if( sentence.substring(i, i+1).equals( " " ) )
            {
                words = words + 1;
            }
            i = i -1;
        }
        
        words++;
        
        return words;
    }
    
    public static boolean isVowel(String c)
   {
       if(c.equals("a") || c.equals("e") ||c.equals("i")|| c.equals("o") || c.equals("O"))
       {
           return true;
        }
       if(c.equals("u") || c.equals("A") || c.equals("E") || c.equals("I") || c.equals("U"))
       {
           return true;
        }
        return false;
    }

    
    public static int countVowels( String sentence)
    {
        int vowel=0;
        int i;
        String h;
        i = sentence.length()-1;
        
        while(i >= 0)//could have did for while (y=0; i >= y; i--)
        {
            h = sentence.substring(i, i+1);
            if(isVowel(h) == true)
            {
                vowel = vowel +1;
            }
            i = i - 1;
        }
               
         return vowel;
    }
    
   
    

}
