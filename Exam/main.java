public class main
{
    public static void main(String args[])
    {
        main m = new main();
        m.go();
    }

    public void go()
    {
        MinStack<Integer> m = new MinStack<Integer>();

        m.push(4);
        m.push(2);
        m.push(5);
        m.push(6);
        
        System.out.println(m.min());
    }
}