public class main{

    public static void main(String args[])
    {
        main m = new main();
        m.go();
    }

    public void go()
    {
        int factorial = factorial(10);
        System.out.println(factorial);
    }
    public int factorial(int n)
    {
        if (n==1)
            return 1;
        else
            return n * factorial(n-1);
    }
}