/* Floating-point numbers and the Math library. The great circle distance is 
 * the shortest distance between two points on the surface of a sphere if you 
 * are constrained to travel along the surface. Write a program GreatCircle.java
 that takes four double command-line arguments x1, y1, x2, and y2
 (the latitude and longitude, in degrees, of two points on the surface of
 the earth) and prints the great-circle distance (in nautical miles) between 
 them. Use the following formula, which is derived from the spherical law of 
 cosines:
 distance=60arccos(sinx1sinx2+cosx1cosx2cos(y1−y2))
 
 This formula uses degrees, whereas Java's trigonometric functions use radians.
 Use Math.toRadians() and Math.toDegrees() to convert between the two. 
 For reference, a nautical mile is 1/60 of a degree of an arc along a 
 meridian of the Earth (which is approximately 1.151 miles).
 % java GreatCircle 40.35 74.65 48.87 -2.33      // Princeton to Paris
3185.1779271158425 nautical miles  

% java GreatCircle 48.87 -2.33 40.35 74.65      // Paris to Princeton
3185.1779271158425 nautical miles  */


public class GreatCircle{
    public static void main(String[] args) {
        
        double x1=Math.toRadians(Double.parseDouble(args[0]));
        double y1=Math.toRadians(Double.parseDouble(args[1]));
        double x2=Math.toRadians(Double.parseDouble(args[2]));
        double y2=Math.toRadians(Double.parseDouble(args[3]));
        
        
        
        double angle = Math.acos(Math.sin(x1) * Math.sin(x2)
                      + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        
      
        // distance=60arccos(sinx1sinx2+cosx1cosx2cos(y1−y2)
      
        angle = Math.toDegrees(angle);


        double distance = 60 * angle;

        System.out.println(distance + " nautical miles");

        
        
        
    }
}

    
    
    