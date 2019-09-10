import java.util.ArrayList;

public class Schedule extends Course
{
    private ArrayList<Course> m_courses = new ArrayList<Course>();

    public Schedule()
    {

    } 
    
    public static void main(String args[])
    {
        Schedule s = new Schedule();
        s.go();
        
    }

    public void go()
    {
       Course a = new Course("Java", "10:00am", "11:00am");
       Course b = new Course("C++", "1:00pm", "2:00pm");
       Course c = new Course("Database", "3:00pm", "4:00pm");
       Schedule ss = new Schedule();
       ss.addCourse(a);
       ss.addCourse(b);
       ss.addCourse(c);
       System.out.println(ss.toString());
       System.out.println(c.toString());
    }

    public void addCourse(Course c)
    {
        m_courses.add(c);
    }
    
    public String toString()
    {
        String sched = "Your Schedule\n";
        for (Object o: m_courses)
        {
            sched += o.toString();
            sched += "\n";
        }
        return sched;
    }


}