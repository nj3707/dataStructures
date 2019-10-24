import java.util.*;

public class QueueLL<T extends Comparable<T>> implements IQueue<T> 
{
   public static void main(String args[])
   {
      /* 
      You can use this method to test or debug your program.
      */

      QueueLL<String> m = new QueueLL<String>();
      m.enqueue("e");
      m.enqueue("f");
      m.enqueue("a");
      m.enqueue("b");
      m.enqueue("c");
      System.out.println(m.toString());
      m.sort();
      System.out.println(m.toString());
   }

	private Node m_head;
	private int m_count;
	
	public QueueLL()
	{
		m_head = new Node(null);
		m_count = 0;
	}
	
	public void reverse()
	{
	   // Please implement this method so that the
	   // items in the queue are reversed.
	   // You should use a stack as part of your 
	   // solution.
        IStack<T> mystack = new StackLL<T>();
       while(!isEmpty())
       {
          T datas = dequeue();
          mystack.push(datas);
       }
       while (!mystack.isEmpty())
       {
           enqueue(mystack.pop());
       }

	}
	
	public void sort()
	{
	   // Please implement this method so that the items 
	   // are in the queue in ascending order
	   // (i.e. they will exit the queue in ascending order).  
	   // You can assume that the items in the 
	   // queue have a natural ordering.  In other words,
	   // the items implement Comparable and support the
	   // compareTo method.
	   
	   // You do not have to implement your own sorting 
	   // algorithm.  You can use a Java ArrayList, and the
	   // Collections.sort method provided by Java, to do 
	   // the actual sorting.
       ArrayList<T> m = new ArrayList<T>();
       while(!isEmpty())
       {
          T datas = dequeue();
          m.add(datas);
       }
       Collections.sort(m);
       for (int i = 0; i < m.size(); i++)
       {
           enqueue(m.get(i));
       }

       
	}
	
	@Override
	public void enqueue(T item)
	{
		// runs in constant time ...
		
		// FIFO: this queue places new items at the head of the queue
		// and removes items from the tail of the queue...
		
		Node n = new Node(item);
		n.m_next = m_head.m_next;
		m_head.m_next = n;
		m_count++;
	}

	@Override
	public T dequeue()
	{
		// runs in O(n) time
		
		// FIFO: this queue places new items at the head of the queue
		// and removes items from the tail of the queue...
		
		if (isEmpty())
			throw new IllegalStateException("dequeue error: queue is empty!");
		
		T ret = null;
		Node cur = m_head;
		
		// while not at the tail...
		while (cur.m_next != null)
		{
			// if I am at the second from the tail of the queue...
			if (cur.m_next.m_next == null)
			{
				// grab the data from the last item in the queue...
				ret = cur.m_next.m_data;
				
				// detatch the last item in the queue...
				cur.m_next = null;
				
				break;
			}
			else
			{
				// otherwise, continue moving towards the tail of the queue...
				cur = cur.m_next;
			}
		}
		
		m_count--;
		return ret;
	}

	@Override
	public boolean isEmpty()
	{ 
		return getSize() == 0;
	}
	
	@Override
	public int getSize()
	{
		return m_count;
	}
	
	@Override
	public String toString()
	{	
		// runs in linear time...
		
		StringBuffer sb = new StringBuffer("rear->");
		if (!isEmpty())
		{
			Node node = m_head.m_next;
			sb.append(node.m_data.toString());
			while (node.m_next != null)
			{
				node = node.m_next;
				sb.append("->");
				sb.append(node.m_data.toString());
			}
		}
		return sb.toString();
	}

	private class Node
	{
	 	private T m_data;
	 	private Node m_next;
		
		public Node(T data)
		{
			m_data = data;
			m_next = null;
		}
	}
}