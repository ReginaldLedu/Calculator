import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        out.println("Input");
        String ex = s.next();
        String ex1 = s.next();
        String ex2 = s.next();


        //out.println(ex + ex1 + ex2);
        try {
            parseInt(ex);
        } catch (NumberFormatException exception) {
            out.println("Invalid Input");

        }
        try {
            parseInt(ex2);
        } catch (NumberFormatException exception) {
            out.println("Invalid Input");
        }
        int a = parseInt(ex);
        int b = parseInt(ex2);
        int c = parseInt(a + "" + b);
        switch (ex1) {
            case "+" -> c = (a + b);
            case "-" -> c = (a - b);
            case "*" -> c = (a * b);
            case "/" -> c = (a / b);
        }
        if (a > 10 || b > 10){
            out.println("Invalid input");
        }
        else {out.println("Output");
            out.println(c);

        }
    }
}


