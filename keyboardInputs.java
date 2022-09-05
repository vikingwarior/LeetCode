import java.util.Scanner;

public class keyboardInputs {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an Int:");
        int x = s.nextInt();
        System.out.print("Enter a float:");
        float f = s.nextFloat();
        System.out.print("Enter an word:");
        String st = s.next();
        System.out.print("Enter an sentence:");
        String sen = s.nextLine();
        System.out.println("Enter an Boolean:");
        Boolean b = s.nextBoolean();

        System.out.println("Value of Int: " + x);
        System.out.println("Value of Float: " + f);
        System.out.println("Value of Word: " + st);
        System.out.println("Value of Sentence: " + sen);
        System.out.println("Value of Boolean: " + b);
       

    }
}
