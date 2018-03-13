import java.util.Scanner;
import org.checkerframework.checker.tainting.qual.Tainted;
import org.checkerframework.checker.tainting.qual.Untainted;

public class TaintedPrintln {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        @Untainted String input;

        System.out.print("Please enter two words separated: ");

        input = kb.next();
        System.out.println(input);
    }
}
