 
/******************************************************************************
 * Name: Geraldo Braho
 * :Austin
 * Date: 06/19/2017
 *
 * Description: A typical egg carton holds 12 eggs. Write a program that
 * takes an integer command-line argument representing the number
 * of eggs your chickens have laid. Print two numbers: the number of
 * full cartons of eggs you can take to market, and the number of eggs
 * that will be left over. Hint: use %.
 *  
 * Examples:
 * > java Eggsactly 12
 * 1 0
 * > java Eggsactly 27
 * 2 3
 *****************************************************************************/
 
public class Eggsactly {
    public static void main(String[] args) {
 
        // reads total number of eggs
        int n = Integer.parseInt(args[0]);
 
        // print number of filled cartons
        System.out.print(n/12);   
        System.out.print(" ");
 
        // print number of eggs left over
        System.out.println(n%12); 
    }   
}