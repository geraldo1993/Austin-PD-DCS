/*Write a program AgeChecker that reads an integer from input, representing
 * someone's age. If the age is 18 or larger, print out
You can vote
If the age is between 0 and 17 inclusive, print out
Too young to vote
If the age is less than 0, print out
You are a time traveller */

public class AgeChecker{ 
    public static void main(String[] args) { 
        
        int age = Integer.parseInt(args[0]);
        
        if(age >= 18){
        
        System.out.println("You Can Vote");
        }
        
        else if  (age < 0){
         
            System.out.println("You are a time Traveler");
           
        }
        
        else{
            
            
         System.out.println("You are too young to vote");   
        }
        
        
    }
    }