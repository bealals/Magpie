/**
 * MagpieRunner.java
 * A program to carry on conversations with a human user.
 * Create a Magpie, give it user input, and print its replies.
 */

import java.util.Scanner;      // class necessary to read input from the keyboard

/**
 * MagpieRunner2.java
 * A program to carry on conversations with a human user.
 * Create a Magpie2, give it user input, and print its replies.
 */

import java.util.Scanner;      // class necessary to read input from the keyboard
public class MagPipeRunner2
{   
   public static void main(String[] args)
   {                                   // This is the only change to the code
      MagPipe2 maggie = new MagPipe2();  // creates a Magpie2 object named maggie		
      String greeting = maggie.getGreeting();  // calls the getGreeting method 
                                               //     on the maggie object
      System.out.println(greeting);

      Scanner in = new Scanner (System.in);   // creates a Scanner object
                                              //   to read from the keyboard
      
      String statement = in.nextLine();       // reads a line of text 
                                              //   from the keyboard
		
      while (!statement.equals("Bye"))       // loop stopping condition
      {                  // calls the getResponse method on the maggie object
         String response = maggie.getResponse(statement);                    
         System.out.println(response);         
         statement = in.nextLine();        
      }
      System.out.println("Thank you for the conversation. Have a nice day.");
      in.close();

   }
}

public class MagPipe2
{
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()        
    {
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int)(Math.random() * 6 + 0);       // revise this assignment statement      
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";
        }
        else if (whichResponse == 4)
        {
            
            response = "Nuh uh...";
        }
        else if (whichResponse == 5)
        {
            response = "Mr. Trebbe!!";
        }
        else
        {
            response = "What a funny goofy.";
        }
        return response;
    }

     /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";        
        response = getRandomResponse();       
        return response;
    }
}

