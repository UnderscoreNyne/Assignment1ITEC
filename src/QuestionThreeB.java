/*-------------------------------------------------------------------------------------------
3. Print the following patterns. Create a separate program to produce each pattern. Hint:
Part b requires multiple loops, some of which print a specific number of spaces.
(b)
*
**
***
****
*****
******
*******
********
*********
**********

Giuseppe Indovina
10/23/24
ITEC2610C
--------------------------------------------------------------------------------------------*/
public class QuestionThreeB {
    public static void main(String[] args){
        for(int i = 10; i>0; i--){
            // print each row
            for(int j=10;j>i;j--){
                System.out.print("*");
            }
            // start new row.
            System.out.println();
        }
    }
}
