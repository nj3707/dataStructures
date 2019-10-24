import java.util.Arrays;

public class triplet implements ITriplet
{
    private int one;
    private int two;
    private int three;

   public triplet(int one, int two, int three)
   {
       this.one = one;
       this.two = two;
       this.three = three;
   }

   public int getFirst()
   {
       return one;
   }

   public int getSecond()
   {
       return two;
   }

   public int getThird()
   {
       return three;
   }

   public void sort()
   {
       int[] m = new int[]{one,two,three};
       Arrays.sort(m);
       one = m[0];
       two = m[1];
       three = m[2];
   }

   public void clear()
   {
       one = 0;
       two = 0;
       three = 0;
   }


}