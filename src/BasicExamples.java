/**
 * Class BasicExamples
 * 
 */
import java.util.*;

public class BasicExamples
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);   //need this to interact with keyboard
        
        //Decalre a String
        String name;
        
        //Create a String
        name = new String("Duluth");
        
        //display a String
        System.out.println( name );
        
        // Adding Strings
        name = name + "Senior";
        System.out.printf("My school is %s High School.\n", name);
        
        name = "House" + "Boat";
        System.out.printf("the string is %s\n", name);
        name = "Boat" + "House";
        System.out.printf("the string is %s\n", name);
        name = "Boat" + 123;
        System.out.printf("the string is %s\n", name);
        name = "Boat" + 123 + 45;
        System.out.printf("the string is %s\n", name);
        name = "Boat" + (123 + 45);
        System.out.printf("the string is %s\n", name);
        
        
        //Getting input from the user
        System.out.printf("Hi! What is your name?");
        name = console.nextLine();
        System.out.printf("It is nice to meet you %s\n", name);
        System.out.printf("Did you know your name has %d letters?\n", name.length());
        System.out.println(name.substring(7));
        System.out.println(name.substring(7,9));
        System.out.println(name.substring(2,3));
        System.out.println(name.indexOf("t"));
        System.out.println(name.indexOf("hi"));
        
        name = "Solomon Xavier Smith";
        //word produce result SXS
        
        int space;
        String result;
        String first,mid, last;
        
        first = name.substring(0,1);
        space = name.indexOf(" ");
        mid = name.substring(space +1, space + 2);
        space= name.indexOf(" ", space +1);
        last = name.substring(space +1,space +2);
        System.out.printf("%s %s %s",first,mid,last);
        
    }
    
    
}
