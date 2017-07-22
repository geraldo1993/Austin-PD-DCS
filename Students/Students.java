 /* fields, separated by whitespace:
 *     - first name
 *     - last name
 *     - email address
 *     - which section they're in
 * Then, prints a list of email address of students in sections 4 and 5.
 *
 * Compilation:  javac-introcs Students.java
 * Execution:    java-introcs Students < students.txt
 * 
 * The data file, students.txt, looks like this:
 * 130
 * Sarah Wang twang 7
 * Austin Taylor actaylor 1
 * David Rosner drosner 4
 * Rebecca Allen rebeccaa 7
 * Rajiv Ayyangar ayyangar 7
 * Daniel Barrett drbarret 8
 * Nic Byrd nbyrd 7
 * Emily Capra ecapra 8
 * Johnny Clore jclore 7
 * ...
 *
 * 
 * Your output should look like this:
 * % Section 4
 * ---------
 * drosner
 * jcharles
 * jph
 * mlampert
 * ...
 *
 * Section 5
 * ---------
 * giwank
 * agrozdan
 * ajh
 * akornell
 * ...                            (This is booksite Web Exercise 1.5.3.)
 ***********************************************************************/
 
public class Students {
    public static void main(String[] args) { 
 
        // read the number of students
        int n = StdIn.readInt();
 
        // declare and initialize four parallel arrays
        String [] first  = new String[n];
        String [] last   = new String[n];
        String [] email  = new String[n];
        int[] section    = new int[n];
 
        // read the data from standard input
        for (int i=0; i<n;i++) {
            first[i]   = StdIn.readString();
            last[i]    = StdIn.readString();
            email[i]   = StdIn.readString();
            section[i] = StdIn.readInt();
        }
 
        // print email addresses of all students in section 4
        StdOut.println("Section 4");
        StdOut.println("---------");
        for (int i = 0; i < n; i++) {
            if (section[i]==4) {
                StdOut.println(email[i]);
            }
        }
        StdOut.println();
 
        // print email addresses of all students in section 5
       // print email addresses of all students in section 4
        StdOut.println("Section 5");
        StdOut.println("---------");
        for (int i = 0; i < n; i++) {
            if (section[i]==5) {
                StdOut.println(email[i]);
            }
        }
        StdOut.println();
            
            
            
        }
 
 
 
 
 
   }        
