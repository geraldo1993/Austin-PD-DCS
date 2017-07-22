/*********************************************************************
 * Name:Geraldo Braho
 * Austin:
 * Date:06/20/2017
 * 
 * Description: Prints the integers from 100 to 200, 5 per line.
 **********************************************************************/
 
// Debugging exercise!
// This version also doesn't compile. Compiler says:
// 1 error found:
// File: C:\cos126\loops\BuggyFivePerLine2.java [line: 27]
// Error: cannot find symbol
// symbol : variable i
// location: class BuggyFivePerLine2
 
public class BuggyFivePerLine2 { 
    public static void main(String[] args) { 
        
        int i;
       
        // print integers from 100 to 200, 5 per line
        for (i = 100; i < 200; i+=5) {
            for (int j = 0; j < 5; j+=1) 
                System.out.print(i +  j + " ");
           
            System.out.println();
        }
        System.out.println(i);
    }
}