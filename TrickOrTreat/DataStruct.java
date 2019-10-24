import java.util.*;

public class DataStruct implements IDataStruct
{
    private int m_curI = -1;
    private String m_curV = "";
    private List<String> m_choices;

    public static void main(String args[])
    {
        
    }

    public DataStruct(String a, String b, String c, String d, String e, String f)
    {
        m_choices = new ArrayList<String>();
            m_choices.add(a);
            m_choices.add(b);
            m_choices.add(c);
            m_choices.add(e);
            m_choices.add(f);
            Collections.shuffle(m_choices);
    }

    public DataStruct(List<String> l)
    {
        m_choices = new ArrayList<String>();
        m_choices.addAll(l);
        Collections.shuffle(m_choices);
    }

    public boolean hasNext()
    {
        int nextI = nextAvailIndex();
        return nextI != -99;
    }

    public String grabNext()
    {     
        int nextI = nextAvailIndex();
        if (nextI == -99)
        {
            throw new IllegalStateException("can't grab next");
        }

        m_curI = nextI;
        m_curV = m_choices.get(nextI);  
        m_choices.set(m_curI, null);

        return m_curV;
    }

    public void release()
    {  
        m_choices.set(m_curI, m_curV);                 
    }
    
    public IDataStruct copyMe()
    {
        IDataStruct ret = new DataStruct(m_choices);
        return ret;
    }

    private int nextAvailIndex()
    {
        int loc = m_curI+1;
        while (loc < m_choices.size() && m_choices.get(loc) == null)
        {
            loc = loc+1;  
        }

        if (loc >= m_choices.size())
        {
            loc = -99;
        }
        
        return loc;
    }
}