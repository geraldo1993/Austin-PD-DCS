/******************************************************************************
 * Name:Geraldo Braho
 * Austin:
 * Date:06/20/2017
 *
 * Description: This program takes a command-line argument n and prints
 * the sum (1 + 2 + ... + n).
 *
 * Examples:
 * > java FiniteSum 1
 * 1
 * > java FiniteSum 2
 * 3
 * > java FiniteSum 10
 * 55
 ******************************************************************************/
 
public class FiniteSum {
    public static void main(String[] args) {
        
        // read first command-line argument
        int n = Integer.parseInt(args[0]);
            
        // this variable is your running sum
        int sum = 0;
        
        // write a for-loop to calculate 'sum'
        for(int i=0; i<=n; i++){
         sum=sum + i;   
            
        }
        
        // print 'sum'
        
        System.out.println(sum);
        
    }
}
 