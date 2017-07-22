/*********************************************************************
 * Name:Geraldo Braho
 * Austin:
 * Date:06/20/2017
 * 
 * Description: Prints the integers from 100 to 200, 5 per line.
 **********************************************************************/
 
// Note: This is what the program is *supposed* to do! No bugs.
 
public class FivePerLine { 
    public static void main(String[] args) { 
 
        // variable declared here because it's used after the loop
        int i;
       
        // iterate from 100 to 200 in increments of 5
        for (i = 100; i < 200; i += 5) {
           
            // iterate from 0 to 5 in increments of 1
            for (int j = 0; j < 5; j += 1) {
                System.out.print(i + j + " ");
            }
           
            // new line between each group of 5
            System.out.println();
        }
       
        // print the last number
        System.out.println(i);
    }
}