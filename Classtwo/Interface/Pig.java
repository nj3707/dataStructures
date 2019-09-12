public class Pig implements IAnimal
{
    private String m_name;

    public Pig(String name)
    {
        m_name = name;
    }

    @Override
    public String makeSound()
    {
        return String.format("%s says: oink oink oink oink:",m_name);
    }
}