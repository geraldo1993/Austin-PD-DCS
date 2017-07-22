/*Type conversion.   Several different formats are used to represent color.
 * For example, the primary format for LCD displays, digital cameras, and web 
 * pages—known as the RGB format—specifies the level of red (R), green (G), 
 * and blue (B) on an integer scale from 0 to 255. The primary format for 
 * publishing books and magazines—known as the CMYK format—specifies the 
 * level of cyan (C), magenta (M), yellow (Y), and black (K) on a real 
 * scale from 0.0 to 1.0. Write a program RGBtoCMYK.java that converts 
 * from RGB format to CMYK format. Your program must take three integer
 * command-line arguments red, green, and blue; print the RGB values; 
 * then print the equivalent CMYK values using these mathematical formulas:
 * 
 white=max(red/255,green/255,blue/255)
 cyan=(white - red/255)/white
 magenta=(white- green/255)/white
 yellow=(white-blue/255)/white
 black= 1 - white 
 
 
 % java RGBtoCMYK 75 0 130    // indigo
red     = 75
green   = 0
blue    = 130
cyan    = 0.423076923076923
magenta = 1.0
yellow  = 0.0
black   = 0.4901960784313726


% java RGBtoCMYK 255 143 0   // Princeton orange
red     = 255
green   = 143
blue    = 0
cyan    = 0.0
magenta = 0.4392156862745098
yellow  = 1.0
black   = 0.0

Hint. Recall that Math.max(x, y) returns the maximum of x and y.

Restriction: You may not use if statements on this assignment, but you may 
assume that the command-line arguments are not all simultaneously zero */


public class RGBtoCMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        
        double w = (double) Math.max(r, Math.max(g, b)) / 255;
        double c, m, y, k;
        
            c = m = y = 0;
            k = 1;
        
            c = 1 - r / w / 255;
            m = 1 - g / w / 255;
            y = 1 - b / w / 255;
            k = 1 - w;
        System.out.println("cyan = " + c);
        System.out.println("magenta = " + m);
        System.out.println("yellow = " + y);
        System.out.println("black = " + k);
    }
}






