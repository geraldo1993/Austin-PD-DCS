/*********************************************************************
 * Name:
 * NetID:
 * Precept:
 * 
 * Description: Prints the integers from 100 to 200, 5 per line.
 **********************************************************************/
 
// Debugging exercise! Fix this code.
// Compiler says: 5 errors found
 
public class BuggyFivePerLine1 { 
    public static void main(String[] args) { 
       int i;
 
       // print integers from 100 to 200, 5 per line
       for (i = 100; i < 200; i+=5) {
           for (int j = 0; j < 5; j+=1) {
               System.out.print(i +  j + " ");
           }
           System.out.println();
       }
       System.out.println(i);
    }
}