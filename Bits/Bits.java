/* Bits. Write a program Bits.java that takes an integer command-line 
 * argument n and uses a while loop to compute the number of times you need to 
 * divide n by 2 until it is strictly less than 1. Print the error message 
 * "Illegal input" if n is negative.
 * % java Bits 0                     % java Bits 8
0                                 4

% java Bits 1                     % java Bits 16
1                                 5

% java Bits 2                     % java Bits 1000
2                                 10

% java Bits 4                     % java Bits -23
3                                 Illegal input

*/


public class Bits{ 
    public static void main(String[] args) { 
        
        
        int n = Integer.parseInt(args[0]);
        
        if (n<0){
            
         System.out.println("Illegal Input");   
        }
        
        
        int counter=0;
        while(n>0){
            
         n=n/2;
        
         counter++;
        }
            
        
        
        System.out.println(counter);
        
        
        
    }
     }
