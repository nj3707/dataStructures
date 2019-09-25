import java.util.*;

public class Candy2
{
    public static void main(String args[])
    {
        ArrayList<String> candy = new ArrayList<String>(Arrays.asList("Kitkat", "Snicker", "MilkyWay",
         "Gummy Bear", "Apple", "Lolly Pop"));

         int iterations = 0;

         //  Randomly shuffles the array to simulate child randomly
         //  getting a piece of candy
         Collections.shuffle(candy);
         
        for (int i = 1; i < candy.size(); i++)
        {
            System.out.printf("Child%d got a %s out of the bag\n", i, candy.get(i));
            iterations++;
        }
        System.out.println("\nThis code took " + iterations + " iterations to complete");
    }
}