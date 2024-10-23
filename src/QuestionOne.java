import java.util.Scanner;

/*-------------------------------------------------------------------------------------------
1. Write a program that reads an integer value and prints the sum of all even integers
   between 2 and the input value, inclusive. Print an error message if the input value is less
   than 2. Prompt accordingly.

Giuseppe Indovina
10/28/24
ITEC2610C
--------------------------------------------------------------------------------------------*/
public class QuestionOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int number, sum = 0;

        // prompt for input.
        do {
            System.out.println("Enter an integer more than or equal to 2: ");
            number = scan.nextInt();
        } while(number<=2);

        // calculate sum of all even integers between 2 and the input value.
        while(number>=2){
            if(number%2==1){
                number-=1;
            } else {
                sum+=number;
                number-=2;
            }
        }

        // output sum.
        System.out.println(sum);
    }
}
