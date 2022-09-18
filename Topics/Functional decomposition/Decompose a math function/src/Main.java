import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        }

        if (0 < x && x < 1) {
            return f2(x);
        }


        return f3(x);
    }

    //implement your methods here
    public static double f1(double num) {
        return num * num + 1;
    }

    public static double f2(double num) {
        return 1 / (num * num);
    }

    public static double f3(double num) {
        return num * num - 1;
    }
}