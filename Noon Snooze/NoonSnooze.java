/*Noon snooze. Write a program NoonSnooze.java that takes an integer 
 * command-line argument snooze and prints the time of day 
 * (using a 12-hour clock) that is snooze minutes after 12:00pm (noon).
% java NoonSnooze 50
12:50pm

% java NoonSnooze 100
1:40pm

% java NoonSnooze 720
12:00am

% java NoonSnooze 11111
5:11am
Note: you may assume that snooze is a non-negative integer.

Hint: use the integer division and remainder operators.*/

public class NoonSnooze
{
 public static void main(String[] args)
 {
  int snooze = Integer.parseInt(args[0]);
  int hour = 12 + (snooze / 60);
  int minutes = 00 + snooze % 60;
  
  
  String ampm;
  if(hour%24 < 12) ampm="pm";
  else    ampm="am";
  
  hour=hour%12;
  if (hour==00) hour=12;
  
  String time = hour + ":" + minutes + " " +  ampm;
  System.out.println(time);
  
 }
}
    
    