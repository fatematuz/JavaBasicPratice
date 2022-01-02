/*Write a program to sum of random numbers.*/

package Assignment_1;
public class problem7 {
    public static void main(String[] args) {
        int n = 50;
        runSimulation(n);

    }
    public static void runSimulation (int n){
        for (int i = 1; i <= n; i++){
            int sim = (int)(Math.random()*2.9999) + 1;
            System.out.print(sim);
        }
    }
}

