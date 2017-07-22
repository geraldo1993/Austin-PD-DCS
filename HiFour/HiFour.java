/* trings and command-line arguments. Write a program HiFour.java that takes four
 * first names as command-line arguments and prints a proper sentence with the 
 * names in the reverse of the order given. Here are two sample executions:
% java HiFour Alice Bob Carol Dave
Hi Dave, Carol, Bob, and Alice. 
% java HiFour Alejandro Bahati Chandra Deshi
Hi Deshi, Chandra, Bahati, and Alejandro.*/

public class HiFour{
    public static void main(String[] args) {
        
        System.out.println(" Hi " + args[0] + " , "+ args[1] + " , " + args[2]
                               + " , " +  " and " + args[3]);
        
        
        
        
        
    }
    
}