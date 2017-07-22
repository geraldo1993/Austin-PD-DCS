/*Dice and the Gaussian distribution. Write a program RollDice.java that 
 * takes an integer command-line argument n, and rolls 10 fair six-sided dice
 * , n times. Use an integer array to tabulate the number of times
 * each possible total (between 10 and 60) occurs. Then print a text
 * histogram of the results, as illustrated below.
 * Note: you should assume that n is a non-negative integer.

The central limit theorem, a key result in probability and statistics,
asserts that the shape of the resulting histogram tends to the ubiquitous
bell curve (Gaussian distribution) if the number of dice and rolls is large. */






public class RollDice2{
    public static void main(String[]args){
        
        
       int n=Integer.parseInt(args[0]);
       
       for(int i=1; i<=n; i++){
           
       int dice1=(int)(Math.random()*6+1);
       int dice2=(int)(Math.random()*6+1);
       int dice3=(int)(Math.random()*6+1);
       int dice4=(int)(Math.random()*6+1);
       int dice5=(int)(Math.random()*6+1);
       int dice6=(int)(Math.random()*6+1);
       int dice7=(int)(Math.random()*6+1);
       int dice8=(int)(Math.random()*6+1);
       int dice9=(int)(Math.random()*6+1);
       int dice10=(int)(Math.random()*6+1);
       
       System.out.println( "Dice1= "+ dice1 + "\n" + "Dice2= " +dice2 + " \n"  +"Dice3= "+ dice3 + " \n" + "Dice4= " +dice4 + " \n" + "Dice5= "
                              + dice5 + "\n" +"Dice6= " + dice6 + " \n" +"Dice7= " + dice7 + "\n"+"Dice8= "+ 
                          dice8 + "\n" + "Dice9= "+ dice9 + "\n" + "Dice10= "+dice10 );
       }
       
    }
}
