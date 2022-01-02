/*Write a program to check if inputted letter is small or capital.*/

package Assignment_1;
import java.util.Scanner;
public class problem4 {
    public static void main(String args[]){
        char ch;//variable declaration
        Scanner scan=new Scanner(System.in);
        //create a scanner object for input

        System.out.println(" Please Enter the character :  ");
        ch=scan.next().charAt(0);

        System.out.println("Result : " );
        System.out.println("===================" );

        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" is an upper case letter ");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(ch+" is a lower case letter ");
        }
        else{
            System.out.println(ch+" is not a Alphabets ");
        }
    }
}


