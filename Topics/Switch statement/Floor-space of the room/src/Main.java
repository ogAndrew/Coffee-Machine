import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();

        if ("triangle".equals(shape)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println(area);
        } else if ("rectangle".equals(shape)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a * b);
        } else if ("circle".equals(shape)) {
            double pi = 3.14;

            double r = scanner.nextDouble();

            System.out.println(pi * (r * r));
        }
    }
}