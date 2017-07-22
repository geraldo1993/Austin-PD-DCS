/************************************************************** 
 * Compilation:  javac-introcs Checkerboard.java
 * Execution:    java-introcs Checkerboard n
 * Dependencies: StdDraw.java
 *
 * Plots an n-by-n red and black checkerboard. 
 * Lower-left square is red.                    (Ex. 1.5.18)
 **************************************************************/
 
public class Checkerboard { 
 
    public static void main(String[] args) {
        // declaration and initialization - How big?
        int n =Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
 
        // Draw from lower left, up and across.
        // i is the index for the x value; j is the index for y.
        for (int col = 0; col < n; col++) {
            for (int row = 0; row<n ;row++ ) {
                if ( ((row+col) % 2) == 1) 
                     StdDraw.setPenColor(StdDraw.BLACK);
                else StdDraw.setPenColor(StdDraw.RED);
           
                StdDraw.filledSquare(col+0.5, row+0.5, 0.5);
                
                
                //StdDraw.pause(1000);    // TO Animate
            }
        }
        
        StdDraw.show();
    }
}