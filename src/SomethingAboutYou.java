import java.util.Scanner;

public class SomethingAboutYou {
// This is the main method
    public static void main(String [] args)
    {
    //This creates a scanner object
        Scanner keyboard = new Scanner (System.in);

        String firstName;
        int age;
        String height;
        double gpa;
        String ans;



//This lets us inserts and displays the information about a person

        do{
            System.out.print( "What is your first name? " );
            firstName = keyboard.next();

            System.out.print( "How old are you? " );
            age = keyboard.nextInt();

            System.out.print( "How tall are you? " );
            height = keyboard.next();

            System.out.print( "What is your GPA? " );
            gpa = keyboard.nextDouble();


            System.out.println( "your first name is: " +firstName);
            System.out.println( "your age is: " +age);
            System.out.println( "your height is: " +height);
            System.out.println( "your GPA is: " +gpa);
            System.out.println( "Do you want to continue?(YES/No) " );
            ans = keyboard.next();




        }while(ans.equalsIgnoreCase ( "yes" ));



    }



}
