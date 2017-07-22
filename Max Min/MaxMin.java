
/*************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: Reads integers from standard input and prints the maximum
 *              and minimum of those values.
 *
 * Dependencies: StdIn.java, StdOut.java
 *
 * Compilation:  javac-introcs MaxMin.java
 * Execution:    java-introcs MaxMin 
 *   -- input required from standard input
 *   -- use Ctrl-d (Mac) or Ctrl-z (Windows) for EOF
 *
 *  % java-introcs MaxMin
 *  23 45 17 56 32
 *  89 10 53 32 34
 *  16
 *  Ctrl-d
 *  maximum = 89, minimum = 10               (This is book exercise 1.5.1.)
 *************************************************************************/
 
public class MaxMin {
   public static void main(String[] args) {
    
      // first value read initializes min and max
      int max = StdIn.readInt();
      int min = max;
    
      // read in the data, keep track of min and max
      while (!StdIn.isEmpty()) {
         int value = StdIn.readInt();
         
         if (value > max){
             max=value;
         }
             
                 else{
                     
                     min=value;
                 }
        
        
      }
    
      // output
      StdOut.println("max = " + max + "   min = " + min);
   }
} 