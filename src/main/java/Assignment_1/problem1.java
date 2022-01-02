/*Write a program to get a number from the user and print whether it is positive or
  negative.*/

package Assignment_1;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Please Enter a number : ");
            int input = in.nextInt();
            System.out.println("Result: " );
            System.out.println("==================" );
            if (input > 0)
            {
                System.out.println("The number you entered it is a positive number");
            }
            else if (input < 0)
            {
                System.out.println("The number you entered it is a  negative");
            }

        }
    }

