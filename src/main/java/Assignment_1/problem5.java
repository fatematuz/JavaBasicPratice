/* Write a program to calculate CGPA and find grade .*/

package Assignment_1;
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {

        double sub1, sub2, sub3, sub4, average;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number for subject# 1 between 0-100: ");

        sub1 = input.nextDouble();

        System.out.println("the number you entered is: " + sub1);

        if (sub1 >= 0 && sub1 <= 100) {

            if (sub1 >= 97 && sub1 <= 100)
                System.out.println("your grade is: " +'A');

            else if (sub1 >= 92 && sub1 <= 97)
                System.out.println("your grade is: " + 'B');

            else if (sub1 >= 84 && sub1 <= 91)
                System.out.println("your grade is: " + 'C');

            else if (sub1 >= 70 && sub1 <= 83)
                System.out.println("your grade is: " + 'D');
            else if (sub1 >= 81&& sub1 <= 65)
                System.out.println("your grade is: " + 'E');

            else
                System.out.println("your grade is: " + 'F');

        } else
            System.out.println("You've entered an Invalid Number!");


        System.out.println("please enter the number for subject# 2 between 0-100: ");

        sub2 = input.nextDouble();

        System.out.println("the number you entered is: " + sub2);

        if (sub2 >= 0 && sub2 <= 100) {

            if (sub2 >= 97 && sub2 <= 100)
                System.out.println("your grade is: " +'A');

            else if (sub2 >= 92 && sub2 <= 97)
                System.out.println("your grade is: " + 'B');

            else if (sub2 >= 84 && sub2 <= 91)
                System.out.println("your grade is: " + 'C');

            else if (sub2 >= 70 && sub2 <= 83)
                System.out.println("your grade is: " + 'D');
            else if (sub2 >= 81&& sub2 <= 65)
                System.out.println("your grade is: " + 'E');

            else
                System.out.println("your grade is: " + 'F');


        } else
            System.out.println("You've entered an Invalid Number!");

        System.out.println("please enter the number  for subject# 3 between 0-100: ");

        sub3 = input.nextDouble();

        System.out.println("the number you entered is: " + sub3);

        if (sub3 >= 0 && sub3 <= 100) {

            if (sub3 >= 97 && sub3 <= 100)
                System.out.println("your grade is: " +'A');

            else if (sub3 >= 92 && sub3 <= 97)
                System.out.println("your grade is: " + 'B');

            else if (sub3 >= 84 && sub3 <= 91)
                System.out.println("your grade is: " + 'C');

            else if (sub3 >= 70 && sub3 <= 83)
                System.out.println("your grade is: " + 'D');
            else if (sub3 >= 81&& sub3 <= 65)
                System.out.println("your grade is: " + 'E');

            else
                System.out.println("your grade is: " + 'F');


        } else
            System.out.println("You've entered an Invalid Number!");



        average = (sub1 + sub2 + sub3 ) / 3;
        System.out.println("");

        System.out.println("The average of the four numbers is: " +average);

        if (average < 33)
            System.out.println("your GPA is: " + 'F');

        else if (average <= 50)
            System.out.println("your GPA is: " + 'D');

        else if (average <= 60)
            System.out.println("your GPA is: " + 'C');

        else if (average <= 70)
            System.out.println("your GPA is: " + 'B');

        else
            System.out.println("your GPA is: " + 'A');

    }
}
