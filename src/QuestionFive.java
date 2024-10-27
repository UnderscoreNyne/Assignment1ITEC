import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        ArrayList<Integer> numList = new ArrayList<>();


        // prompt for user input
        do{
            System.out.println("Enter any number from 1-50 (entering a number outside of the range will end the prompt): ");
            number = scan.nextInt();

            // add number to Array List
            if(!(number < 1 || number > 50)){
                numList.add(number);
            }
        }while(number>=1 && number<=50);

        // sort Array List to prepare for output.
        Collections.sort(numList);

        // create a numList without duplicate numbers so that there aren't duplicate outputs for the same number.
        ArrayList<Integer> numListTrimmed = new ArrayList<>();

        for(int i = 0; i<=numList.size()-1; i++){
            if(!numListTrimmed.contains(numList.get(i))){
                numListTrimmed.add(numList.get(i));
            }
        }

        // spacing to separate the output from the input prompt
        System.out.println();

        // output list of numbers that occurred more than once.
        for(int i = 0; i<=numListTrimmed.size()-1; i++){
            System.out.println(numListTrimmed.get(i) + "|" + Collections.frequency(numList, numListTrimmed.get(i)));
        }
    }
}