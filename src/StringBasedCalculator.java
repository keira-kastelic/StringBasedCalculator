import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class StringBasedCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter a math problem with two numbers separated by spaces:"); // prompting the user
        Scanner user = new Scanner (System.in); // creating a scanner
        String problem = user.nextLine(); // reading in the users input
        char first = problem.charAt(0); // finding the fist number typed
        int num1 = first - 48; // turning the string into an integer
        char second = problem.charAt(4); // finding the second number
        int num2 = second - 48; // turning the number into an integer
        int sign = problem.charAt(2); // finding the sign used
        if(sign == 43){ // creating an if statement for an addition problem
            System.out.print(first + " + "+ second + " = "); // printing out the answer structure
            int sum = num1+num2; // adding the numbers together
            System.out.print(sum); // printing out the answer
        } else if (sign == 45){ // creating an if statement for a subtraction problem
            System.out.print(first + " - "+ second + " = "); // printing the answer structure
            int diff = num1-num2; // subtracting the numbers
            System.out.print(diff); // printing out the answer
        } else if (sign == 42){ // creating an if statement for a multiplication problem
            System.out.print(first + " * "+ second + " = "); // creating an if statement for a division problem
            int mult = num1*num2; // multiplying the numbers
            System.out.print(mult); // printing the answer
        } else if (sign == 47){ // creating an if statement to catch if something is multiplied by 0
            if (num2 == 0){ // creating an if statement in case the second number is 0
                System.out.print("undefined"); // printing out undefined if true
            }else{ // creating an else statement if there is no divide by 0 error
                System.out.println(first + " / "+ second + " = "); // printing out the answer structure
                int div = first/second; // dividing the numbers
                System.out.println(div); // printing out the answer
            }
        }


    }
}
