/*Write a program to check balance and withdraw money from ATM booth using if else and
switch case.*/

package Assignment_1;
import java.util.Scanner;
public class problem8 {
        public static void main(String[] args) {
            int PIN = 1234;
            double balance = 5000;
            System.out.println("Click Option 1. To Check The Balance");
            System.out.println("Click Option 2 To Check The Withdraw Balance");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int count = 0;
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(" Please Enter your PIN");
                        int pin = scanner.nextInt();
                        if (PIN == pin) {
                            System.out.println("The Balance is " + balance + " Tk");
                            break;
                        } else {
                            System.out.println(" You inserted a wrong PIN ");
                        }
                        count++;

                    }
                    if (count >= 3) {
                        System.out.println("You have entered wrong PIN more than 3 times. Now your Card has blocked.");
                    }
                    break;

                case 2:
                    count = 0;
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Please enter your PIN");
                        int pin = scanner.nextInt();
                        if (PIN == pin) {
                            System.out.println("Please input the amount that is multiply by 500");
                            int amount = scanner.nextInt();
                            if (amount <= balance && amount % 500 == 0) {
                                balance -= amount;
                                System.out.println("The Withdraw is successful. Your current balance is " + balance + " Tk");
                                break;
                            } else if (amount > balance) {
                                System.out.println("The balance is not enough. Please input the valid amount");
                            } else {
                                System.out.println(" The balance is not multiply by 500. Please try with another amount that is multiply by 500");
                            }
                        } else if (PIN != pin) {
                            System.out.println("You inserted a wrong PIN");
                        } else if (count >= 3) {
                            System.out.println("You have entered wrong PIN more than 3 times. Now your Card has blocked.");
                        }
                        count++;

                    }
                    if (count >= 3) {
                        System.out.println("You have entered wrong PIN more than 3 times. Now your Card has blocked.");
                    }
                    break;
                default:
                    System.out.println("Result : " );
                    System.out.println("==================" );
                    System.out.println("Please select option either 1 or 2");
            }
        }
}
