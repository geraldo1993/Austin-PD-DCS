/******************************************************************************
 *
 * Description: Upgraded version of BouncingBall.java, as seen in Lecture 4D.
 ******************************************************************************/
 
public class BouncingBallDeluxe { 
    public static void main(String[] args) {
        
        int n= Integer.parseInt(args[0]);
 
        // initial values
        double [] rx = new double[n]; 
        double [] ry = new double[n];  // position
      //double vx = 0.015, vy = 0.023;     // velocity
        double [] vx= new double[n];
        double [] vy= new double[n];
        
        
        for(int i =0; i<n; i++){
            
         vx[i]=0.6*Math.random()-0.3;   
         vy[i]=0.6*Math.random()-0.3;
            
            
            
        }
        double radius = 0.05;              // radius
        
        // initialize standard drawing
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
 
        // main animation loop
        while (true)  {
            
            
            // set the background to light gray
            StdDraw.clear(StdDraw.LIGHT_GRAY);
            
               for(int i =0; i<n; i++){
                   
            
            // bounce off wall according to law of elastic collision
            if (Math.abs(rx[i] + vx[i]) + radius > 1.0) {
                vx[i] = -vx[i];
                StdAudio.play("pipebang.wav");
            }
            if (Math.abs(ry[i] + vy[i]) + radius > 1.0)  {
                vy[i]= -vy[i];
                StdAudio.play("pipebang.wav");
            }
 
            // update position
            rx[i] = rx[i] + vx[i]; 
            ry[i] = ry[i]+ vy[i]; 
               
            
 
            // draw ball on the screen
            StdDraw.picture(rx[i], ry[i], "TennisBall.png");

                  
            // display and pause for 20 ms
            
              
               }
              
              StdDraw.show();
             StdDraw.pause(50);  
        }
         
    } 
} 