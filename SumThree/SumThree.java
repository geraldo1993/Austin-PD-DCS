/* Integers. Read Section 1.2 (through page 23) of the textbook. 
 * Write a program SumThree.java that takes three int command-line
 * arguments and prints the three integers and their sum in the form of
 * an equation.
% java SumThree 2 5 8
2 + 5 + 8 = 15

% java SumThree -2 5 -8
-2 + 5 + -8 = -5 */

public class SumThree{
    public static void main(String [] args){
        
        int result= Integer.parseInt(args[0]) +Integer.parseInt(args[1]) +
            Integer.parseInt(args[2]);
        
        System.out.println(args[0] + " + " + args[1] +  "  + " + args[2] + " = "
                               + result );
        
        
    }
}
