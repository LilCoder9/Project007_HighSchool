
/**
 * Class Demo1
 * 
 */
import java.util.*;

public class Demo1
{
    public static void main(String[] args)
    {
        int x = 5;
        String a = "Hello";    // Hello is a string "literal"
        
        System.out.println( x + a );
        System.out.println( a + x );
        System.out.println( a + x + 2*x );
        System.out.println( a + (x +2*x  ) );
        System.out.println( a + a );            // String concantenation
        
        // Convert number to String
        // a = x;   FAILS
        a = String.format("%d", x);
        a = "" + x;
        a = x + "";
        a = x + x + "";
        a = String.valueOf( x );
        
        
        // Convert String to number
        a = "1024";
        double y;
        y = Double.parseDouble( a );
        x = Integer.parseInt( a );
        
    }
}
