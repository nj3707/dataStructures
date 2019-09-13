public class Person implements Comparable<Person>
{
    private String m_name;
    private int m_age;


    public Person(String name, int age)
    {
        m_name = name;
        m_age = age;
    }

    public int getAge()
    {
        return m_age;
    }

    @Override
    public int compareTo(Person other)
    {
        if (m_age < other.m_age)
            return 1;
        else if (m_age > other.m_age)
            return -1;
        else
            return 0;
    }

    public String toString()
    {
        return String.format("(%s, %s)", m_name, m_age);
    }
}