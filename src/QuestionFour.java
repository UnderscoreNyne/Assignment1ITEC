import java.util.Scanner;

/*-------------------------------------------------------------------------------------------
4. Write a program that reads a string from the user, then determines and prints how many
of each lowercase vowels (a, e. i, o, and u) appear in the entire string. Have a separate
counter for each vowel. Also count and print the number of non-vowel characters.

Giuseppe Indovina
10/23/24
ITEC2610C
--------------------------------------------------------------------------------------------*/
public class QuestionFour {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String sentence;
        char[] sentenceArray;
        int a = 0,e = 0,i = 0,o=0,u=0, nonvowel = 0;

        // prompt user input
        System.out.println("Enter a string: ");
        sentence = scan.nextLine();

        // convert sentence to charArray
        sentenceArray = sentence.toCharArray();

        for (char c : sentenceArray) {
            switch (c) {
                case 'a' -> a += 1;
                case 'e' -> e += 1;
                case 'i' -> i += 1;
                case 'o' -> o += 1;
                case 'u' -> u += 1;
                default -> {
                    if (c != ' ') {
                        nonvowel += 1;
                    }
                }
            }
        }

        System.out.println("a | "+a+"\ne | "+e+"\ni | "+i+"\no | "+o+"\nu | "+u+"\n\nnon vowel | "+nonvowel);

    }
}
