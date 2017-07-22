
/*********************************************************************
  * Name: Geraldo Braho
  * Austin:
  * Date:0/20/2017
  *  
  * Description: You're throwing a party. You have people lined up at the
  * door. You ask each person, as they come in, what their birthday is.
  * If their birthday is the same as anyone else's at the party, slam
  * the door! The party is closed! How many people are at your party?
  * 
  * Examples:
  * > java Birthday
  * 22
  * 
  * Note: Birthday are represented as the integers 0-364, where 0 = Jan 1.
  *********************************************************************/
 
public class Birthday { 
    public static void main(String[] args) {
        
        // number of people at the party 
        int numPeople = 0;
        
        // each element of this boolean array represents whether
        // someone at the party has that birthday or not
        boolean [] someonesBirthday = new boolean[365];
        
        while (true) {
            
            // ding dong! excuse me, what is your birthday?
            int birthday =(int)(Math.random()*365);
            
            // if someone at the party has this birthday, leave the loop
            if (someonesBirthday[birthday]== true) break;
            
            // update someonesBirthday[] for future iterations of this loop
            someonesBirthday[birthday] = true;
            
            // increment number of people at the party
                 numPeople++;
            
        }
        
        // so, how many people are at your party?
             System.out.println(numPeople);
    }
}