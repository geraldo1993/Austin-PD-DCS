/*Write a program RandomWalkers.java that takes two integer command-line
 * arguments n and trials. In each of trials independent experiments, 
 * simulate a random walk of n steps and compute the squared distance. 
 * Output the mean squared distance (the average of the trials 
 * squared distances).
% java RandomWalkers 100 10000         % java RandomWalkers 400 2000
mean squared distance = 101.446         mean squared distance = 383.12

% java RandomWalkers 100 10000         % java RandomWalkers 800 5000
mean squared distance = 99.1674         mean squared distance = 811.8264

% java RandomWalkers 200 1000         % java RandomWalkers 1600 100000
mean squared distance = 195.75          mean squared distance = 1600.13064
As n increases, we expect the random walk to end up farther and farther away 
from the origin. But how much farther? Use RandomWalkers to formulate a
hypothesis as to how the mean squared distance grows as a function of n. 
Use trials = 100,000 to get a sufficiently accurate estimate.

This process is a discrete version of a natural phenomenon known as 
Brownian motion. It serves as a scientific model for an astonishing 
range of physical processes from the dispersion of ink flowing in water, 
to the formation of polymer chains in chemistry, to cascades of neurons 
firing in the brain.*/


public class RandomWalkers
{
    public static int RandomWalker(int n)
    {
        int x = 0, y = 0;
        for(int i = 0; i < n; i++)
        {
            double rand = Math.random();
            if(rand < 0.25)
                ++x; // move to east
            else if(rand < 0.5)
                --y; // move to north
            else if(rand < 0.75)
                --x; // move to west
            else if(rand < 1.0)
                ++y;
        }
        return x*x + y*y;
    }
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);

        double sum = 0;
        for(int i = 0; i < T; i++)
        {
            sum += RandomWalker(N);
        }
        System.out.println("mean squared distance = " + sum/T);
    }
}