package auto_java.introduction;

import auto_java.introduction.EQSolver;
import auto_java.introduction.InputData;

import static auto_java.introduction.InputData.a;
import static auto_java.introduction.InputData.b;
import static auto_java.introduction.InputData.c;

public class Tests_for_EQSolver {
    public static void main(String[] args) {
        InputData.inputData();
        if (a == 0) {
            System.out.println("Value of a cannot equal to 0!");
        }
        else if ((b*b-4*a*c) < 0){
            System.out.println("Value under square root is negative!");
        }
        else EQSolver.calculate();

    }
}
