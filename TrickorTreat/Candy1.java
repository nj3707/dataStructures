import java.util.Random;
public class Candy1
{

    public static void main(String args[])
    {
        String candy[] = new String[] 
        {"Kitkat", "Snicker", "MilkyWay", "Gummy Bear", "Apple", "Lolly Pop"};
        Random rand = new Random();

        int iterations = 0;

        for (int i = 0; i < candy.length; i++) 
        {
            int randPos = rand.nextInt(candy.length);
            String tmp = candy[i];
            candy[i] = candy[randPos];
            candy[randPos] = tmp;
            iterations++;
        }
        for (int i = 1; i < candy.length; i++)
        {
            System.out.printf("Child%d got a %s out of the bag\n", i, candy[i]);
            iterations++;
        }
        System.out.println("\nThis code took " + iterations + " iterations to complete");
    }
}