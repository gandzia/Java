package auto_java.basis_part2;

public class ComputePI {
    public static void main(String[] args) {
        double myPI = 0;
        for (int i = 2; i <= 50000; i = i + 4) {
            myPI = (double) 3 + (double) 4 / (i * (i + 1) * (i + 2)) - (double) 4 / ((i + 2) * (i + 3) * (i + 4));
        }
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Calculated PI = " + myPI);
    }
}
