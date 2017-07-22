/*********************************************************************
 * Name:
 * NetID:
 * Precept:
 *  
 * Description: HowMany takes a variable number of command-line
 * arguments and prints a message reporting how many there are.
 *
 * > java HowMany
 * You entered 0 command-line arguments.
 * > java HowMany Alice Bob Carol
 * You entered 3 command-line arguments.
 * > java HowMany Alice                            This is Booksite
 * You entered 1 command-line argument.            Web Exercise 1.4.1
 ********************************************************************/
 
public class HowMany {
    public static void main(String[] args) {
 
        // number of command-line arguments
        int n = args.length;
        
        for(int i=0; i<args.length; i++){
            
            System.out.println(args[i]);
            
            
        }
 
        // output message
        System.out.print("You entered " + n + " command-line argument");
        if (n==1) System.out.println(".");
        else            System.out.println("s.");
    }
}