import java.util.*;
public class Ex3 {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String quote = "";
        String author = "";
        System.out.println("What is the quote?");
        quote = kb.nextLine();
        System.out.println("Who said it");
        author = kb.nextLine();
        System.out.println(author + " says " + \"quote\");
        System.out.println(" \"ROM\" ");
    }
}