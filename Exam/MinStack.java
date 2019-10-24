public class MinStack<T extends Comparable<T>> implements IStack<T>
{

    private IStack<T> allElements = new StackLL<T>();
    private IStack<T> history = new StackLL<T>();

	@Override
	public void push(T item)
	{

        if (history.isEmpty())
        {
            history.push(item);
        }
		if (!history.isEmpty())
        {
            if (item.compareTo(history.top()) < 0)
            {
                history.push(item);
            }


        }

        allElements.push(item);
	}

	@Override
	public T pop()
	{


		return allElements.pop();
	}

	@Override
	public T top()
	{
		
		return  allElements.top();
	}

	@Override
	public boolean isEmpty()
	{
		// runs in constant time...

		return allElements.getSize() == 0;
	}

	@Override
	public int getSize()
	{
		

		return allElements.getSize();
	}

	@Override
	public String toString()
	{
        return allElements.toString();
	}

    public T min()
    {
        return history.top();
    }
    


	/**
	 * <p>Internal class used to represent a link in a linked list
	 * structure.  Each node in the list contains the element
	 * that was added to the stack, as well as a reference to the
	 * next item in the stack.</p>
	 */

    
}