import java.util.*;

public class Main 
{
    private ArrayList<Person> m_people = new ArrayList<Person>();

    public static void main(String args[])
    {
        Main m = new Main();
        m.go();
    }

    public void go()
    {
        Person a = new Person("Abby", 15);
        Person b = new Person("Bob",27);
        Person c = new Person("Corey", 3);
        Person d = new Person("Dave", 1);

        m_people.add(d);
        m_people.add(c);
        m_people.add(b);
        m_people.add(a);

        Collections.sort(m_people);
        System.out.println(m_people);

        Collections.sort(m_people,
        
        new Comparator<Person>()
        {
            @Override
            public int compare(Person one, Person two)
            {
                if (one.getAge() < two.getAge())
                    return -1;
                else if (one.getAge() > two.getAge())
                    return 1;
                else
                    return 0;
            }
        }
         );
         System.out.println(m_people);
    }
}