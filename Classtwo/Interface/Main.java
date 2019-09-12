public class Main
{
    public static void main(String args[])
    {
        Main m = new Main();
        m.go();
    }

    public void go()
    {
        IAnimal p = new Pig("Piggy");
        IAnimal d = new Duck("Ducky");
        System.out.println(p.makeSound());
        System.out.println(d.makeSound());
        
    }
}