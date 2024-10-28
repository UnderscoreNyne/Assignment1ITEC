import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*-------------------------------------------------------------------------------------------
5. Write a program that reads an arbitrary number of integers that are in the range 0 to 50
inclusive and counts how many occurrences of each are entered. Indicate the end of the
input by a value outside of the range. After all input has been processed., print all of the
values (with the number of occurrences) that were entered one or more time.

Giuseppe Indovina
10/27/24
ITEC2610C
--------------------------------------------------------------------------------------------*/
public class QuestionFive {
    public static void main(String[] args) {

        // prompt for numbers to add to the numList.
        ArrayList<Integer> numList = numberPrompt();

        // sort Array List to prepare for output.
        Collections.sort(numList);

        // create a numList without duplicate numbers so that there aren't duplicate outputs for the same number.
        ArrayList<Integer> numListTrimmed = trimList(numList);

        System.out.println();

        // output list of numbers that occurred more than once.
        outputList(numList,numListTrimmed);
    }

    // shows a prompt to collect numbers from 1-50 and put them in a list.
    public static ArrayList<Integer> numberPrompt(){
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

        return numList;
    }

    // trims the duplicate items from a list
    public static ArrayList<Integer> trimList(ArrayList<Integer> list){
        ArrayList<Integer> trimmedList = new ArrayList<>();
        for(int i = 0; i<=list.size()-1; i++){
            if(!trimmedList.contains(list.get(i))){
                trimmedList.add(list.get(i));
            }
        }

        return trimmedList;
    }

    // outputs a list of numbers with their frequency.
    public static void outputList(ArrayList<Integer> list, ArrayList<Integer> trimmedList){
        for(int i = 0; i<=trimmedList.size()-1; i++){
            System.out.println(trimmedList.get(i) + "|" + Collections.frequency(list, trimmedList.get(i)));
        }
    }
}