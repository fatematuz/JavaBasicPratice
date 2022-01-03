/*Create a math quiz program.
Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
If user inputs the correct summation, print "Answer is correct" and user will get 1 point.
If user inputs wrong summation,  then user will get 0 point.
At the end after 5 iteration, total score will be shown.*/

package Assignment_2;
import java.util.Scanner;
import java.util.Random;
public class problem5 {
    public static void main(String[] args)
    {
        int number1, number2, score=0;
        long sum;
        Random dice= new Random();
        Scanner input = new Scanner(System.in);

        for (int i=0; i<5; i++)
        {
            number1= dice.nextInt(10);
            number2= dice.nextInt(10);
            System.out.println("First Randomly Generated number is: " + number1);
            System.out.println("Second Randomly Generated number is: " + number2);

            System.out.println("please enter the sum of these two numbers : ");
            sum= input.nextInt();
            if (number1+number2== sum)
            {
                System.out.println("Answer is correct");
                score= score+1;
            }
            else
                System.out.println("Answer is incorrect");
        }

        System.out.println("Your final score is : " +score);
    }
}
