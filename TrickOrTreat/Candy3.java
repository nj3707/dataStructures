
public class Candy3
{
    public static void main(String args[])
    {
        Candy3 m = new Candy3();
        m.go();
    }

    public void go()
    {
        IDataStruct candy = new DataStruct("Kitkat", "Snicker", "MilkyWay",
         "Gummy Bear", "Apple", "Lolly Pop");

         int iterations = 0;
         for (int i = 1; i < 6; i++)
         {
             System.out.printf("Kid%d picked %s out of the bag\n", i, candy.grabNext());
             iterations++;
         }
         System.out.println("\nThis code took " + iterations + " iterations to complete");
         
    }
}