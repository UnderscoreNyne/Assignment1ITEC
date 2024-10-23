import java.util.Scanner;

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
