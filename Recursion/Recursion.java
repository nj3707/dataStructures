public class Recursion
{

public static void main(String args[])
{
    Recursion m = new Recursion();
    m.go();
}

public void go()
{
    System.out.println(foo(4,7));
}

public int foo(int x, int y)
{
if (x > y)
   return -1;
else if (x ==  y)
   return 1;
else
   return x * foo(x + 1, y);
}

}