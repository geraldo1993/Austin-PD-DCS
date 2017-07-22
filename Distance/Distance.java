/*************************************************************************
 * Name:Geraldo Braho
 * :Austin
 * Date:06/19/2017
 *
 * Description: Prints the distance between (0, 0) and (x, y), where x and
 * y are integers.
 * 
 * Notes: In case you're rusty on the algebra, we determine this by the
 * Euclidean distance: distance = square root of (x squared + y squared).
 *
 * Example:
 * % java Distance 3 4                                  This is Booksite
 * Distance from (0, 0) to (3, 4) is 5.0.               Web Exercise 1.2.1.
 *************************************************************************/
 
public class Distance{
    
    public static void main(String[] args) {
 
        // input point coordinates
        int x =Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        
        // compute distance
         double x1 = Math.pow(x,2);
         double  y1 = Math.pow(y,2);
                                 
                                     
 
 
        // output distance
        double result = Math.sqrt(x1+y1);
         
       
                                 
                                 
                                 
         
         System.out.println( result);
  
    }   
}