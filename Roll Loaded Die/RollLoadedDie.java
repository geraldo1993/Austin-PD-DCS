/*************************************************************************
 * Name:Geraldo Braho
 * NetID:
 * Precept:
 *
 * Description: Simulate the roll of a loaded six-sided die, where
 * the values 1, 2, 3, 4, and 5 appear with probability 1/8 and the
 * value 6 appears with probablity 3/8. Print the resulting number.
 *
 * Examples:
 * > java RollLoadedDie
 * 4
 * > java RollLoadedDie
 * 6                                 (This is Booksite Web Exercise 1.3.2.)
 *************************************************************************/
 
public class RollLoadedDie {
   public static void main(String[] args) {
      // generate random double in the range [0.0, 1.0)
      double r = Math.random();
      int side=(int)(Math.random()*5+1);
 
      // compute the roll with desired probabilities
      
      int roll=6;
      
      if (r>0.625){
          System.out.println(roll); 
      }
      
      else {
          
       System.out.println(side); 
      }
 
 
 
 
   }
}