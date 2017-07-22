/********************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: It's a secret! Shh.
 *******************************************************************/
 
// TODO: Figure out what this program does. (Stumped? See Exer. 1.4.4.)
 
public class MysteryArray {
    public static void main(String[] args) {
        int n = args.length;
        int[] a = new int[n];
    
        // store the arguments in an integer array
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
    
        // What is happening here?
        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    
        // print the elements
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
 
        System.out.println();
    }
}