/* Take three numbers from the user and print the greatest number */

package Assignment_1;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter  the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Please enter the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print(" please enter the 3rd number: ");
        int num3 = in.nextInt();

        System.out.println("Result: " );
        System.out.println("==================" );
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The number you entered the greatest number is : " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The number you entered the greatest number is : " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The number you entered the greatest number is 90" +
                        ": " + num3);
    }
}
