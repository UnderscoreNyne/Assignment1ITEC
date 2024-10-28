import java.util.Scanner;

/*-------------------------------------------------------------------------------------------
6. Write a program that computes and prints the mean and standard deviation of a list
of integers x1 through x2. Assume that there will be no more than 50 input values and
the maximal possible value is 100. Compute both the mean and standard deviation as
floating point values, using the formulas for mean and standard deviation:

Giuseppe Indovina
10/27/24
ITEC2610C
--------------------------------------------------------------------------------------------*/

public class QuestionSix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x1, x2, n, sum;
        float mean, sd;

        // prompt for the input of x1 and x2
        System.out.println("Input a value for x1: ");
        x1 = scan.nextInt();

        System.out.println("Input a value for x2: ");
        x2 = scan.nextInt();

        n = x2-x1+1;

        // calculate sum
        sum = calculateSum(x1,x2);

        // calculate mean
        mean = (float) sum / n;

        // calculate sd
        sd = calculateStandardDeviation(x1,x2,n,mean);

        // output results
        System.out.println("\nMean: "+mean+"\nStandard Deviation: "+sd);
    }

    // method to calculate the sum of a set of numbers from start to end.
    public static int calculateSum(int start, int end){
        int sum = 0;
        for(int i = start; i<=end; i++){
            sum += i;
        }
        return sum;
    }

    public static float calculateStandardDeviation(int start, int end, int length, float mean){
        int sdNumerator=0;
        // calculate the numerator for the standard deviation
        for(int i = start; i<=end; i++){
            sdNumerator += Math.pow((i-mean), 2);
        }

        // calculate denominator and return it
        return (float) (Math.sqrt(sdNumerator))/length;
    }
}
