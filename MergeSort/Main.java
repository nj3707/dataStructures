import java.util.*;

public class Main
{    
    public static void main(String args[])
    {
      // -----------------------------------
      // do not edit main...       
      // -----------------------------------
      List people = new ArrayList();
      
      people.add(new Person("Frank", "Denton", 73));
      people.add(new Person("Mark", "Cohen", 44)); 
      people.add(new Person("Tim", "Smith", 22));
      people.add(new Person("Steve", "Denton", 16)); 
      people.add(new Person("Andy", "Ashton", 44)); 
      people.add(new Person("Albert", "Denton", 58)); 
      
      List ans = mergeSort(people);
      System.out.println(ans);
      // -----------------------------------
    }
    
    public static List mergeSort(List items)
    {
        List sorted = new ArrayList();
  
      //  if (items.size() == 1) // base case...
      //  {
            // -----------------------------------
      //      return sorted;
            
            // -----------------------------------
       // }
        if (items.size() > 1) // recursive call...
        {
            int mid = items.size() / 2;
            int r = items.size();

            List left = new ArrayList();
            List right = new ArrayList();


            // split the people into two lists//
            for (int i = 0; i < mid; i++)
            {
                left.add(items.get(i));
            }
            for (int i = mid + 1; i < r; i++)
            {
                right.add(items.get(i));
            }

           
            sorted = merge(mergeSort(left), mergeSort(right));

        }
        return sorted;
    }
    
    private static List merge(List<Person> partA, List<Person> partB)
    {
         List merged = new ArrayList();

         // atempt to fix out of bounce error
         merged.add(0);
         merged.add(1);
         merged.add(2);
         merged.add(3);
         merged.add(4);
         merged.add(5);

        
         int first = 0;
         int second = 0;
         int third = 0;

         while (first < partA.size() && second < partB.size())
         {
             //sort the names
             if (partA.get(first).compareTo(partB.get(second)) < 0)
             {
                 merged.set(third, partA.get(first)); 
                 first++;
             }
             else
             {
                 merged.set(third, partB.get(second)); 
                 second++;
             }
             third++;
         }

         return merged;
    }
}