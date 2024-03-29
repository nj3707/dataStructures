import java.util.*;

public class Main3
{
    private final int N = 3*3;
    private Integer m_square[] = new Integer[N];

    private int c = 0;

    public static void main(String args[])
    {
        new Main3().go();
    }

    private void go()
    {
        IDataStruct nums = new DataStruct(N);        
        setAtAndRight(0, nums.copyMe());   
        System.out.println(c);     
    }

    private void setAtAndRight(int i, IDataStruct nums)
    {       
        if (i == N)
        {
            // terminate when I have set all of the values in the square...
        }
        else if (i < N)
        {
            while (nums.hasNext())
            {
                m_square[i] = nums.grabNext();
                setAtAndRight(i+1, nums.copyMe());
                nums.release();
            }
            nums.release();

            // if I just set the last value test for magic...
            if (i == N-1)
            {    
                c += 1;
                if (isMagic())
                {
                    System.out.println("MAGIC!");
                    System.out.println(printSquare());
                }
            }
        }
    }

    private boolean isMagic()
    {
        boolean yes = true;
   
        // rows...
        int total = m_square[0] + m_square[1] + m_square[2];
        yes = yes && (m_square[3] + m_square[4] + m_square[5] == total);
        yes = yes && (m_square[6] + m_square[7] + m_square[8] == total);
   
        // cols...
        yes = yes && (m_square[0] + m_square[3] + m_square[6] == total);
        yes = yes && (m_square[1] + m_square[4] + m_square[7] == total);
        yes = yes && (m_square[2] + m_square[5] + m_square[8] == total);

        // diags...
        yes = yes && (m_square[0] + m_square[4] + m_square[8] == total);  
        yes = yes && (m_square[2] + m_square[4] + m_square[6] == total);   
   
        return yes; 
    }

    private String printSquare()
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++)
        {
            if (i%Math.sqrt(N) == 0)            
               sb.append("\n");
            sb.append(String.format("%s ", m_square[i]));            
        }
        sb.append("\n");
        return sb.toString();
    }

    private void initNums(List<Integer> nums)
    {
        nums.clear();
        for (int i = 0; i < N; i++)
            nums.add(i+1);
    }
}