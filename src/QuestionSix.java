/*-------------------------------------------------------------------------------------------
6. Write a program that computes and prints the mean and standard deviation of a list
of integers x1 through x2. Assume that there will be no more than 50 input values and
the maximal possible value is 100. Compute both the mean and standard deviation as
floating point values, using the formulas for mean and standard deviation:

Giuseppe Indovina
10/27/24
ITEC2610C
--------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x1, x2, n, sum = 0;
        float mean, sdNumerator = 0, sd;

        // prompt for the input of x1 and x2
        System.out.println("Input a value for x1: ");
        x1 = scan.nextInt();

        System.out.println("Input a value for x2: ");
        x2 = scan.nextInt();

        n = x2-x1+1;

        // calculate sum
        for(int i = x1; i<=x2; i++){
            sum += i;
        }

        // calculate mean
        mean = (float) sum / n;

        // calculate sd
        for(int i = x1; i<=x2; i++){
            sdNumerator += Math.pow((i-mean), 2);
        }

        sd = (float) (Math.sqrt(sdNumerator))/n;

        // output results
        System.out.println("\nMean: "+mean+"\nStandard Deviation: "+sd);
    }
}
