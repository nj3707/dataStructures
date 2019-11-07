import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;


public class Huffman 
{	
    public void populateNodesFromFile(String file, List nodes) throws FileNotFoundException
    {
        try
        {
            File f = new File(file);
            Scanner input = new Scanner(f);
            List<String> info = new ArrayList<String>();

            while (input.hasNextLine())
            {      
                String line = input.nextLine();
                String [] details = line.split(",");
                String let = details[0];
                char letter = let.charAt(0);
                int weight = Integer.parseInt(details[1]);
                nodes.add(new Node(letter, weight));
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
    }

    public Tree buildTreeFromNodes(List nodes)
    { 
        Collections.sort(nodes);
        System.out.println(nodes);
    }
	
	//public void printTree(Tree root)
	{
    
	}   
	
	//public String getCode(Tree root, char ch)
	{   
	   
	}
				
	//public String decode(Tree root, String code)
	{
	   
	}
    
    private class Node implements Comparable
	{
	 	private char m_char;
	 	private int m_weight;

		public Node(char letter, int weight)
		{
			m_char = letter;
			m_weight = weight;
		}
        public char getChar()
        {
            return m_char;
        }
        public int getWeight()
        {
            return m_weight;
        }
        
        @Override
        public String toString()
        {
            return Character.toString(m_char);
        }

        @Override
        public int compareTo(Node other)
        {
            if (m_weight.compareTo(other.m_weight) == 0)
            {
                return m_letter.compareTo(other.m_letter);
            }
            else
            {
                return m_weight.compareTo(other.m_weight);
            }
        }
	}
}