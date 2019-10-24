public class removeChar
{
    public static void main(String args[])
    {
        removeChar m = new removeChar();
        m.go();
    }

    public void go()
    {
        System.out.println(remove("egooooos", 'o'));
    }

    public String remove(String word, char a)
    {
        int index = word.indexOf(a);
        if (index == -1)
            return word;
        
      return remove(word.substring(0, index) +
       word.substring(index +1, word.length()), a);


    }
}

