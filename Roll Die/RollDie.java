/*************************************************************************
 * Name:Geraldo BRaho
 * NetID:
 * Precept:
 *
 * Description: Simulate the roll of a fair six-sided die and print
 * the resulting number.
 *
 * Examples:
 * > java RollDie
 * 4
 * > java RollDie
 * 1                                 (This is Booksite Web Exercise 1.3.1.)
 *************************************************************************/
 
// TO DO: Use casting (like in RandomInt.java on page 33 of the textbook)
// to get a random integer between 1 and 6.
 
public class RollDie {
   public static void main(String[] args) {
 
       // how many sides does this die have?
      int Sides = 6;
 
      // roll should be 1 through SIDES
      int roll = (int)(Math.random()*Sides+1);
      
 
      // print result
      
      System.out.println(roll);
      
   }
}