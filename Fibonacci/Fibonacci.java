public class Fibonacci
{
    public static void main(String args[])
    {
        Fibonacci f = new Fibonacci();
        f.go();
    }

    public void go()
    {
        System.out.println(fib(40));
    }

    public int fib(int n)
    {
        if (n==1 || n==0)
        {
            return 1;
        }
        else
            return fib(n-2) + fib(n-1);
    }
}