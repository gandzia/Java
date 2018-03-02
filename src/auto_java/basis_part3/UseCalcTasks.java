package auto_java.basis_part3;

public class UseCalcTasks {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        CalcTasks res = new CalcTasks();
        System.out.println("a + b = " + res.add(a,b));
        System.out.println("a - b = " + res.sub(a,b));
        System.out.println("a / b = " + res.div(a,b));
        System.out.println("a * b = " + res.mult(a,b));
    }
}
