/*Write a program to make a digital tasbih where the program counts
 each time user press enter until press 0.*/

package Assignment_2;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count = 0;

            while (true) {
                System.out.println("This program records how many times you pressed ENTER. Press '0' to finish.");
                String input = sc.nextLine();

                // for Clear console
                System.out.print("\033[H\033[2J");
                System.out.flush();

                if (input.indexOf("0") >= 0) {
                    break;
                } else {
                    count++;
                }

            }
            System.out.println("Result : " );
            System.out.println("===================" );
            System.out.println("This program records how many times you pressed ENTER. Press '0' to finish.");
            System.out.println(String.format("You pressed ENTER %d times.", count));
        }
}
