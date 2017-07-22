/*********************************************************************
 * Name:Geraldo Braho
 * Austin:
 * Date:06/20/2017
 * 
 * Description: Prints the integers from 100 to 200, 5 per line.
 **********************************************************************/
 
// Debugging exercise! This version also had a runtime problem -- it's
// missing output!
 
public class BuggyFivePerLine4 { 
    public static void main(String[] args) { 
        int i;
 
        // print integers from 100 to 200, 5 per line
        for (i = 100; i <= 200; i+=5) {
            for (int j = 0; j < 5; j+=1) 
                System.out.print(i +  j + " ");
           
            System.out.println();
        }
        System.out.println(i);
    }
}