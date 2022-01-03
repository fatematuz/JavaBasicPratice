/*Write a program to sum of digits of a number by taking from user input.*/
package Assignment_2;
import java.util.Scanner;
public class problem1 {
        public static void main(String[] args)
        {
            int number, digit, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter the number to see the sum of the number from user input: ");
            number = sc.nextInt();
            while (number > 0) {
                //finds the last digit of the given number from user
                digit = number % 10;
                // it will add the last digit to the variable sum
                sum = sum + digit;
                //removes the last digit from the number
                number = number / 10;
            }
            System.out.println("Result : " );
            System.out.println("==================" );
            System.out.println("The Sum of digits from the number you entered is : " + sum);
        }
}
