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
      
      List<Person> ans = mergeSort(people);
      System.out.println(ans);
      // -----------------------------------
    }
    
    public static List<Person> mergeSort(List<Person> items)
    {
        List sorted = new ArrayList();
  
        if (items.size() == 1) // base case...
        {
             
            List<Person> h = new ArrayList<Person>();
            h.add(items.get(0));
            return h;
            
        }
        else // recursive call...
        {
            int mid = items.size() / 2;
            int r = items.size();

            List<Person> left = new ArrayList<Person>();
            List<Person> right = new ArrayList<Person>();


            // split the people into two lists//
            for (int i = 0; i < mid; i++)
            {
                left.add(items.get(i));
            }
            for (int i = mid; i < r; i++)
            {
                right.add(items.get(i));
            }
            

             mergeSort(left);
             mergeSort(right);
           
             sorted = merge(left, right);

        }
        return sorted;
        
    }
    
    private static List<Person> merge(List<Person> partA, List<Person> partB)
    {
         List<Person> merged= new ArrayList<Person>();
         
 


        // atempt to fix out of bounce error
        //merged.add(new Person("Frank", "Denton", 73));
        //merged.add(new Person("Mark", "Cohen", 44)); 
        //merged.add(new Person("Tim", "Smith", 22));
        //merged.add(new Person("Steve", "Denton", 16)); 
        //merged.add(new Person("Andy", "Ashton", 44)); 
        //merged.add(new Person("Albert", "Denton", 58));
        merged.add(null);
        merged.add(null);
        merged.add(null);
        merged.add(null);
        merged.add(null);
        merged.add(null);


        
         int first = 0;
         int second = 0;
         int third = 0;

         while ((first < partA.size()) && (second < partB.size()))
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