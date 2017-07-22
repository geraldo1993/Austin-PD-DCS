/* A drone's flight. A drone begins flying aimlessly, starting at Nassau Hall. 
 * At each time step, the drone flies one meter in a random direction, either 
 * north, east, south, or west, with probability 25%. How far will the drone 
 * be from Nassau Hall after n steps? This process is known as a two-dimensional
 * random walk.
Write a program RandomWalker.java that takes an integer command-line argument
n and simulates the motion of a random walk for n steps. Print the location at 
each step (including the starting point), treating the starting point as the 
origin (0, 0). Also, print the square of the final Euclidean distance from the 
origin.*/

public class RandomWalker
{
    public static void main(String[] args)
    {
        int steps = Integer.parseInt(args[0]);

        int x = 0, y = 0;
        for(int i = 0; i < steps; i++)
        {
            double rand = Math.random();
            if(rand < 0.25)
                x++; // move to east
            else if(rand < 0.5)
                y--; // move to north
            else if(rand < 0.75)
                x--; // move to west
            else if(rand < 1.0)
                y++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("squared distance = " + (x*x + y*y));
    }
}