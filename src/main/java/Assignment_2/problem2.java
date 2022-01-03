/* Write a program to show range of prime numbers from 2 to n using while loop
[n is the number by user input].*/

package Assignment_2;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkPrime = true;
        System.out.println(" Please enter any number to see it is a prime number  : ");
        int number = sc.nextInt();

        int a = 2;
        while (a <= number / 2) {
            if (number % a == 0) {
                checkPrime = false;
                break;
            }
            a++;
        }
        System.out.println("Result : ");
        System.out.println("===================");
        if (checkPrime)
            System.out.println("The number you entered it is a prime number." + number);
        else
            System.out.println("The number you entered it is not a prime number." + number);
        sc.close();
    }
}
