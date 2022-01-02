/*Write a program that takes a year from user and print whether that year is a leap
year or not.*/

package Assignment_1;
import java.util.Scanner;
public class problem3 {

    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter the year so that you can check either it is a leap year or not : ");
            int year = in.nextInt();

            boolean a= (year % 4) == 0;
            boolean b = (year % 100) != 0;
            boolean c = ((year % 100 == 0) && (year % 400 == 0));

            System.out.println("Result : " );
            System.out.println("===================" );

            if (a && (b || c))
            {
                System.out.println("Hurry the year you have entered it is a leap year : " + year);
            }
            else
            {
                System.out.println("Sorry the year you have entered it is not a leap year : " + year);
            }
            System.out.println("Thank you " );
        }
}
