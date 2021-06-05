import java.util.*;
public class Ex6 {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Date d = new Date();
        System.out.println("What is your current age?");
        int age = kb.nextInt();
        System.out.println("At what age would you like to retire?");
        int retire = kb.nextInt();
        int diff = retire - age;
        int currYr = d.getYear() + 1900;
        System.out.println("You have " + diff + " years left until you can retire.");
        System.out.println("It's " + currYr + ", so you can retire in " + (currYr + diff));
    }
}