/* Author: Geraldo Braho
 * Date:06/19/2016
 * Austin
 */





/* Integers and booleans. Write a program Ordered.java that takes three 
 * int command-line arguments, x, y, and z. Define a boolean variable whose 
 * value is true if the three values are either in strictly ascending order 
 * (x < y < z) or in strictly descending order (x > y > z), and false otherwise.
% java Ordered 10 17 49
true

% java Ordered 49 17 10
true

% java Ordered 10 49 17
false
Restriction: You may not use if statements on this assignment.*/

public class Ordered {

    public static void main(String[] args) {
        
        boolean isOrdered1=Integer.parseInt(args[0])<Integer.parseInt(args[1]);
        boolean isOrdered2=Integer.parseInt(args[1])<Integer.parseInt(args[2]);
        boolean isOrdered=(isOrdered1==isOrdered2);    
        System.out.println(isOrdered);

    }

}


