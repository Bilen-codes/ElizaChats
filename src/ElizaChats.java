/*ElizaChats is a online chat room that supports individuals
that need emotional support*/
import java.util.Scanner;
public class ElizaChats {
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
      System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        String name = s.nextLine();
        System.out.printf("Nice to meet you, %s, How has your day been?", name);
        String day = s.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day! ?");
        String feeling = s.nextLine();
       System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
       System.out.printf("\n\nHere are your responses: %s %s %s :)", name, day, feeling);


    }
}
