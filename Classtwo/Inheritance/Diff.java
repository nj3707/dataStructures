public class Diff extends sum
{
    public Diff(int op1, int op2)
    {
        m_op1 = op1;
        m_op2 = op2;
    }
    

    @Override
    public int operate()
    {
        return m_op1 - m_op2;
    }

}