package auto_java.basis_part2;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = reader.nextInt();
        reader.close();

        if (num % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }
}
