package auto_java.introduction;

import static auto_java.introduction.InputData.a;
import static auto_java.introduction.InputData.b;
import static auto_java.introduction.InputData.c;

public class EQSolver {
    public static void calculate() {
        double x1, x2;
        x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

}

