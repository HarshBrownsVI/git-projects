import java.util.*;
public class Ex5 {

    public static void main(String[] args)
    {
         Scanner kb = new Scanner(System.in);
             String num1 = "";
             String num2 = "";
             System.out.println("What is the first number?");
             num1 = kb.next();
             System.out.println("What is the second number?");
             num2 = kb.next();
            int upd1 = Integer.parseInt(num1);
            int upd2 = Integer.parseInt(num2);
            System.out.println(upd1 + " + " + upd2 + " = " + (upd1+upd2) );
            System.out.println(upd1 + " - " + upd2 + " = " + (upd1-upd2) );
            System.out.println(upd1 + " * " + upd2 + " = " + (upd1*upd2) );
            System.out.println(upd1 + " / " + upd2 + " = " + (upd1/upd2) );
    }

 }