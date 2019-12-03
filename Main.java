import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Main 
{
   public static void main(String[] args) 
   {
      Main main = new Main();
      main.go();
   }

   public void go()
   {
      int ary[] = {82, 79, 46, 16, 12, 39, 41, 6, 4, 11};
      
      int root = getRoot(ary);
      System.out.printf("Root: %s%n", root);

      List leaves = getAllLeaves(ary);
      System.out.printf("Leaves: %s%n", leaves);

      List parents = getAllParents(ary);
      System.out.printf("Parents: %s%n", parents);
      
      boolean isMaxHeap1 = isMaxHeap(0, ary);
      System.out.printf("Is MaxHeap: %s%n", isMaxHeap1);
   }
   
   // ---------------------------------------------------------------
   // return the value of the root of the tree represented by ary
   // ---------------------------------------------------------------
   public int getRoot(int ary[])
   {
      return ary[0];
   }
   
   // ---------------------------------------------------------------
   // return a list containing the values for all of the nodes in the 
   // tree that are leaves
   // ---------------------------------------------------------------
   public List getAllLeaves(int ary[])
   {
      List l = new ArrayList();
      
      for (int i = (int)Math.floor(ary.length/2); i < ary.length; i++)
      {
          l.add(ary[i]);
      }
      
      return l;
   }

   // ---------------------------------------------------------------
   // return a list containing the values for all of the nodes in the 
   // tree that are parents
   // ---------------------------------------------------------------
   public List getAllParents(int ary[])
   {
      List l = new ArrayList();
      
      // your code goes here ...

      for (int i = 1; i < ary.length; i++)
      {
          if(!l.contains(ary[(i-1)/2]))
          {
              l.add(ary[(i-1)/2]);
          }
      }
      
      return l;
   }
   
   // ---------------------------------------------------------------   
   // return true if the tree represented by ary is a valid max heap
   // ---------------------------------------------------------------
   public boolean isMaxHeap(int rootIndex, int ary[])
   {
        int n = ary.length;

        for (int i = 0; i <= (n - 2) / 2; i++)
        { 
            
            if (ary[2 * i + 1] > ary[i]) 
            { 
                return false; 
            } 
  
            
            if (2 * i + 2 < n && ary[2 * i + 2] > ary[i]) 
            { 
                return false; 
            } 
        } 
        return true;
   }
}