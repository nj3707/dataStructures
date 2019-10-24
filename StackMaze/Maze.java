import java.util.Scanner;

public class Maze
{


     private String[][] map = new String[10][10];
     private int x_position = 0;
     private int y_position = 0;
     private boolean gameOn = true;

     IStack<String> undo = new Stack<String>();
     IStack<String> redo = new Stack<String>();
     IStack<String> grog = new Stack<String>();





    public static void main(String args[])
    {
        Maze m = new Maze();
        m.game();
    }

    public void game()
    {
        makeMap();
        while (gameOn)
        {
            printGame();
            move();
        }

    }


// asks the user to make a move
// then does the user's selected action
private void move()
{

    String input = getUserInput();

    if (input.equalsIgnoreCase("n"))
    {
        if (y_position !=0)
        {
            emptyRedoStack();
            map[y_position][x_position] = "-";
            y_position--;
            map[y_position][x_position] = "*";
            undo.push(input);
        }
        else
        {
            
            System.out.println("\n\nouch!");
        }
    }
    else if (input.equalsIgnoreCase("s"))
    {
        if (y_position !=9)
        {
            emptyRedoStack();
            map[y_position][x_position] = "-";
            y_position++;
            map[y_position][x_position] = "*";
            undo.push(input);
        }
        else
        {
            System.out.println("\n\nouch!");
        }
    }
    else if (input.equalsIgnoreCase("e"))
    {
        if (x_position !=9)
        {
            emptyRedoStack();
            map[y_position][x_position] = "-";
            x_position++;
            map[y_position][x_position] = "*";
            undo.push(input);
        }
        else
        {
            System.out.println("\n\nouch!");
        }
    }
    else if (input.equalsIgnoreCase("w"))
    {
        if (x_position !=0)
        {
            emptyRedoStack();
            map[y_position][x_position] = "-";
            x_position--;
            map[y_position][x_position] = "*";
            undo.push(input);
        }
        else
        {
            System.out.println("\n\nouch!");
        }
    }
    else if (input.equalsIgnoreCase("g"))
    {
        if (grog.isEmpty())
        {
            System.out.println("Gulp!");
            grog.push("Blah!");
        }
        else
        {
            System.out.println(grog.pop());
        }
    }
    else if (input.equalsIgnoreCase("u"))
    {
        undoMove();
    }

    else if (input.equalsIgnoreCase("r"))
    {
        redoMove();
    }
    else
    {
        System.out.println("\nGame Over! Thanks for playing!");
        gameOn = false;
    }
}


// displays the map contents
private void printMap()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            System.out.print(map[i][j] + " ");
        }
        System.out.println("\n");
    }
}


// creates the map by filling blank array
private void makeMap()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            map[i][j] = "-";
        }
    }
}


// asks for userinput until correct option is selected
private String getUserInput()
{
    Scanner input = new Scanner(System.in);

    System.out.print("Choose your move: ");
    String s = input.nextLine();
    while (!s.equalsIgnoreCase("n") && !s.equalsIgnoreCase("s") && !s.equalsIgnoreCase("e") && 
        !s.equalsIgnoreCase("w") && !s.equalsIgnoreCase("g") && !s.equalsIgnoreCase("u") &&
        !s.equalsIgnoreCase("r") && !s.equalsIgnoreCase("q"))
    {
        System.out.print("Please choose a valid option: ");
        s = input.nextLine();
    }
    return s;
}


// clears the redo stack
private void emptyRedoStack()
{
    while(!redo.isEmpty())
    {
        redo.pop();
    }
}

// undos user previous move
private void undoMove()
{
if (!undo.isEmpty())
{
    
    String move = undo.pop();
    redo.push(move);
    if (move.equalsIgnoreCase("s"))
    {
        if (y_position !=0)
        {
            map[y_position][x_position] = "-";
            y_position--;
            map[y_position][x_position] = "*";
        }
    }
    else if (move.equalsIgnoreCase("n"))
    {
        if (y_position !=9)
        {
            map[y_position][x_position] = "-";
            y_position++;
            map[y_position][x_position] = "*";
        }
    }
    else if (move.equalsIgnoreCase("w"))
    {
        if (x_position !=9)
        {
            map[y_position][x_position] = "-";
            x_position++;
            map[y_position][x_position] = "*";
        }
    }
    else if (move.equalsIgnoreCase("e"))
    {
        if (x_position !=0)
        {
            map[y_position][x_position] = "-";
            x_position--;
            map[y_position][x_position] = "*";
        }
    }
    else 
    {
        System.out.println("Can't undo that!");
    }
}

}


// prints the game out
private void printGame()
{
    System.out.println("Undo Stack: " + undo.toString());
    System.out.println("Redo Stack: " + redo.toString());
    System.out.println("");
    printMap();


    System.out.println("What have you mage?");
    System.out.println("N: North");
    System.out.println("S: South");
    System.out.println("E: East");
    System.out.println("W: West");
    System.out.println("G: Grog");
    System.out.println("U: Undo");
    System.out.println("R: Redo");
    System.out.println("Q: Quit");
}


//pops from redo Stack
// redoes undo
// then pushes back to undo stack
private void redoMove()
{
if (!redo.isEmpty())
{
    
    String move = redo.pop();
    undo.push(move);
    if (move.equalsIgnoreCase("n"))
    {
        if (y_position !=0)
        {
            map[y_position][x_position] = "-";
            y_position--;
            map[y_position][x_position] = "*";
        }
    }
    else if (move.equalsIgnoreCase("s"))
    {
        if (y_position !=9)
        {
            map[y_position][x_position] = "-";
            y_position++;
            map[y_position][x_position] = "*";
        }
    }
    else if (move.equalsIgnoreCase("e"))
    {
        if (x_position !=9)
        {
            map[y_position][x_position] = "-";
            x_position++;
            map[y_position][x_position] = "*";
        }
    }
    else if (move.equalsIgnoreCase("w"))
    {
        if (x_position !=0)
        {
            map[y_position][x_position] = "-";
            x_position--;
            map[y_position][x_position] = "*";
        }
    }
    else 
    {
        System.out.println("Can't undo that!");
    }
}

}

}














