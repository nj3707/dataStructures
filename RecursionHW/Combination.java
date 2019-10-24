public class Combination
{
    public static void main(String args[])
    {
        Combination m = new Combination();
        m.go();
    }

    public void go()
    {
        System.out.println(C(49,6));
    }

    public int C(int n,int k)
    {
        if (k == 0 || n == 0 || k == n)
            return 1;
        return C(n-1, k) + C(n-1, k-1);
    }
}