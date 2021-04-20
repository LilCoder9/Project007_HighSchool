/**
 * Class NthWord 
 */
import java.util.*;

public class NthWord
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String sentence;
        int    n;
        
        System.out.print("Enter a sentence: ");
        sentence = console.nextLine();
        System.out.print("Extract what word number? ");
        n = console.nextInt();
        
        System.out.printf("The %d-th word in \"%s\" is \"%s\"\n", 
                         n, sentence, nthWord( sentence, n) );

    }
    
    public static String nthWord( String x, int y)
   {
       int start=0;
       int end=0;
       int word=0; 
       
       do
       {
           end = x.indexOf(" ",start);
           word++;
           if( word == y)
           {
             if(end == -1)
             {
                 end = x.length();
                }
            return x.substring(start, end);
        }
           start = end + 1;
           
        }while(end > 0 && word < y);
       
        return " ";
   }
}

