/***********************************************************************
 * Name: Geraldo Braho 
 *:Austin
 * Date:06/19/2017
 *
 * Description: Reads two command-line arguments and prints both out
 * in a sentence. By doing this exercise you will learn the difference
 * between print() and println().
 *
 * Examples:
 * > java NameAge Alice 19
 * Alice is 19 years old.
 * > java NameAge FatherTime 999
 * FatherTime is 999 years old.
 ***********************************************************************/
 
public class NameAge {
    public static void main(String[] args) {
 
 
        // Modify HelloWorld.java to read a name and an age from
        // the command line (both handled as String arguments) and
        // output: [NAME] is [AGE] years old.
        
        System.out.print(args[0]);
        System.out.print(" is ");
         System.out.print(args[1]);
         System.out.println(" years old");
 
    }
}