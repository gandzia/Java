package auto_java.introduction;

import java.util.Scanner;

public class InputData {
public static double a, b, c;

    public static void inputData (){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = reader.nextDouble();

        System.out.println("Enter number b: ");
        b = reader.nextDouble();

        System.out.println("Enter number c: ");
        c = reader.nextDouble();
        reader.close();
    }
}
