public class main 
{

    public static void main(String args[])
    {
        new main().go();
    }

    public void go()
    {
        ITriplet t = new triplet(23,4,9);
        if (t.getFirst() != 23)
        {
            throw new IllegalStateException("Get first Failed");
        }

        if (t.getSecond() != 4)
        {
            throw new IllegalStateException("Get second Failed");
        }

        if (t.getThird() != 9)
        {
            throw new IllegalStateException("Get third Failed");
        }
        t.sort();

        if (t.getFirst() != 4)
        {
            throw new IllegalStateException("Get first Failed after sort");
        }

        if (t.getSecond() != 9)
        {
            throw new IllegalStateException("Get second Failed after sort");
        }

        if (t.getThird() != 23)
        {
            throw new IllegalStateException("Get third Failed after sort");
        }

        t.clear();

        if (t.getFirst() != 0)
        {
            throw new IllegalStateException("Get first Failed zero test");
        }

        if (t.getSecond() != 0)
        {
            throw new IllegalStateException("Get second Failed zero test");
        }

        if (t.getThird() != 0)
        {
            throw new IllegalStateException("Get third Failed zero test");
        }
    }   


}