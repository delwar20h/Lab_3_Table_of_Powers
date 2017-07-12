import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;
        int numSquared;
        int numCubed;
        String letterToContinue;

        // Welcome's user.
        System.out.println("Learn your squares and cubes!");

        // do while loop runs once and than only runs if the input meets the condition set in the while statement
        // at the end of the do while loop.

        do {
        System.out.print("Enter an integer between 0 and 100: ");
        userInput = scan.nextInt();

        // Print statements that create a table like appearance for the data.
            System.out.println("Number" + " \t " + "Squared" + " \t" + "Cubed");
            System.out.println("======" + " \t " + "=======" + " \t" + "======");

            // Lab asks to display all of the squared and cubed values from 1 to the value entered.
            // for loop below runs until the userInput is less than or equal to i.
            for (int i = 1; i <= userInput; i++) {
                numSquared = i * i;
                numCubed = i * i * i;

                // The results of numSquared and numCubed of the integers leading to the userInput are printed.
                System.out.println(i + " \t\t " + numSquared + "\t\t\t" + numCubed);
            }
            System.out.println("Would you like to continue? (Y/N)");
            letterToContinue = scan.next().toUpperCase();
        } while (letterToContinue.equals("Y"));
    }
}
