public class Rectangle
{
    private int m_width;
    private int m_height;

    public static void main(String args[]) 
    {
        Rectangle r = new Rectangle(3,4);
        System.out.println("Area: " + r.getArea());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Perimiter: " + r.getPerimiter());
        

    }

    public Rectangle(int width, int height) 
    {
        m_width = width;
        m_height = height;
    }

    public Rectangle () 
    {
        m_width = 0;
        m_height = 0;
    }

    public int getWidth() 
    {
        return m_width;
    }

    public int getHeight() 
    {
        return m_height;
    }

    public int getArea()
    {
        return m_height * m_width;
    }

    public int getPerimiter() 
    {
        return (2 * m_height) + (2 * m_width);
    }

}