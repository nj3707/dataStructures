public class Stack<T> implements IStack<T>
{

    private int m_count;
    private T[] m_ary;


    public Stack()
    {
        m_ary = (T[])new Object[2];
        m_count = 0;
    }


    @Override
	public void push(T item)
    {
        if (isFull())
        {
           T[] ary = (T[])new Object[m_ary.length * 2];
            for (int i = 0; i < m_ary.length; i++)
            {
                ary[i] = m_ary[i];
            }
            m_ary = ary;
        }
        m_ary[m_count] = item;
        
        m_count++;
    }

	
    @Override
	public T pop()
    {
        if (!isEmpty())
        {
            T temp = m_ary[m_count - 1];
            m_ary[m_count - 1] = null;
            m_count--;
            return temp;
        }
        else
        {
            throw new IllegalStateException("Empty"); 
        }
        
    }


    @Override	
	public T top()
    {
        if(!isEmpty())
        {
        return m_ary[m_count - 1];
        }
        else
        {
            throw new IllegalStateException("Empty");
        }
    }

	
    @Override
	public boolean isEmpty()
    {
        boolean b = true;


        // if any of the indecies don't equal null
        // return false
        for(int i = 0; i < m_ary.length; i++)
        {
            if(m_ary[i] != null)
            {
                b = false;
            }
        }
        return b; 
    }

	
    @Override
	public int getSize()
    {
        return m_count;
    }


    public boolean isFull()
    {
        
        boolean b = true;

            // if any of the indecies equal
            // null return false
        for(int i = 0; i < m_ary.length; i++)
        {
            if(m_ary[i] == null)
            {
                b = false;
            }
        }
        return b;
    }

    @Override
	public String toString()
	{
		

		StringBuffer sb = new StringBuffer("top->");
		if (!isEmpty())
		{
            int i = m_count - 1;
			if (m_ary[i] != null)
            {
                sb.append(m_ary[i]);
                i--;
            }
			while ((i >= 0) &&  (m_ary[i] != null))
			{
				
				sb.append("->");
				sb.append(m_ary[i]);
                i--;
			}
		}
		return sb.toString();
	}


}