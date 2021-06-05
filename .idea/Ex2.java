import java.util.*;
public class Ex2 {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String s = "";
        System.out.println("What is the input string?");
        s = kb.next();
        while( s.equals(" ")){
            System.out.println("What is the input string?");
            s = kb.next();
        }
        System.out.println(s + " has " + s.length() + " characters.") ;
    }

}

}
