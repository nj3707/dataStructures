public static void main(String args[])
{

}

public void moveTower(int height, String from, String to, String via)
{
    main m = new main();
    m.go();
}

public void go()
{
    if (h > 0)
    {
        moveTower(height - 1, from, to, via);
        moveDisk(from, to);
        moveTower(height-1, via, to, from;)
    }
}