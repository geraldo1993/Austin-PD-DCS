/*************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: Compute your grade on a two-part exam. You will
 * be given 4 command-line arguments:
 *   1. The number of questions you got right on the first part.
 *   2. The total number of questions on the first part.
 *   3. The number of questions you got right on the second part.
 *   4. The total number of questions on the second part.
 * Output your percentage score on the exam.
 *
 * For example, for PercentScore 8 10 15 17 since you got a total of
 * 23 questions correct out of 27 and 23/27 = 0.8518 you should print
 * 85.18518518518519.
 *
 * Examples:
 * > java PercentScore 8 10 15 17
 * 85.18518518518519
 *************************************************************************/
 
public class PercentScore {
    public static void main(String[] args) {
        
        // read 4 command-line arguments
        int grade1 = Integer.parseInt(args[0]);
        int grade2 = Integer.parseInt(args[1]);
        int grade3 = Integer.parseInt(args[2]);
        int grade4 = Integer.parseInt(args[3]);

        
        
        // calculate the result
        double correct= grade1+grade3;
        double  wrong=grade2+grade4;
        double average = correct/wrong *100;
 
        
        // print the result
        System.out.println("Correct answers =  " + correct);
         System.out.println("Wrong answers = " + wrong);
         System.out.println("Percentscore is = " + average);
 
    }   
}