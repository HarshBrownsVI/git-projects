import java.util.*;
public class Ex7 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int len = 0;
        int width = 0;
        System.out.println("What is the length in the room in ft");
        len = kb.nextInt();
        System.out.println("What is the width in the room in ft");
        width = kb.nextInt();
        System.out.println("The dimensions of the room are " + len + " feet by " + width + " .");
        int area = len * width;
        System.out.println("The area is " + area + " square feet");
        DecimalFormat df = new DecimalFormat("#,###,##0.000");

        double sqmeters = area * 0.09290304;
        System.out.println(df.format(sqmeters) + " square meters");

    }
}