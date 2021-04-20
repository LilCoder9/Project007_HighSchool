
/**
 * Hangman - Class Project
 * 
 * String topics:
 *    concatenation, indexOf, substring, nextLine, equals, compareTo
 */
import java.util.*;

public class Hangman
{
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String word, template, guess;
        String prevTemplate;
        int missed = 0;
        int guesses = 0;
        
        word = selectWord();
        template = buildTemplate( word );
        
        System.out.printf("word: %s and template: %s\n", word, template);
       
          do{
          System.out.printf("Guess a letter:");
          guess = console.nextLine();
          prevTemplate = template;
          template = uncoverLetters( template, word, guess);
        if( prevTemplate.equals( template ) )
        {
            missed++;
        }
        System.out.printf("%s\n", template);
        display (missed);
        }while( template.equals( word)== false && missed < 7);
        
        if( missed < 7)
        {
            System.out.printf("Congratulations! You guessed the word %s in %d guesses.\n", word, guesses);
        }
        else
        {
            System.out.printf("Sorry! You lose.\n");
        }
    }
    
  
    public static String selectWord()
     {
       return "DULUTH";
     }
     
    public static String buildTemplate( String word )
    {
        String result = "";
        for( int i=0; i < word.length(); i++)
             result = result + "*";
             
        return result;     
    }
    
    public static String uncoverLetters( String template, String word, String letter)
    {
        String newTemplate = "";
        for( int i=0; 1 < word.length(); i++)
        {
            String letterW = word.substring( i, i+1);
            String letterT = template.substring( i, i+1);
            if( letter.compareTo( letterW) == 0 )
            {
                newTemplate = newTemplate + letterW;
            }
            else
            {
                newTemplate = newTemplate + letterT;
            }
        } 
        return newTemplate;     
    }
        
    /** display( n )
     *  n - figure number to display. The game ends when 7 attempts have been made to 
     *      guess the word. After the person misses the first time, the first (n=1)
     *      figure should be displayed.
     */
    public static void display( int n )
    {
        switch( n )
        {
            case 0:  System.out.printf(            
                        "  +---+\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;    
            
            case 1 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
                 
            case 2 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
            case 3 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
            case 4 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
            case 5 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
            case 6 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
            case 7 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "=========\n" );
                        break;
        }
    }
}


