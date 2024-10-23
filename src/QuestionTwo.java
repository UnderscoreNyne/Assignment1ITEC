import java.util.Scanner;

/*-------------------------------------------------------------------------------------------
2. Write a program that reads a string from the user and prints it one character per line.

Giuseppe Indovina
10/23/24
ITEC2610C
--------------------------------------------------------------------------------------------*/
public class QuestionTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String sentence;
        char[] sentenceArray;

        // prompt for input
        System.out.println("Enter a string: ");
        sentence = scan.nextLine();

        // convert sentence to a char array to prepare for output
        sentenceArray = sentence.toCharArray();

        // output charArray
        for (char c : sentenceArray) {
            System.out.println(c);
        }
    }
}
