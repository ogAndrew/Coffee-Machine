import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


        boolean min = num1 >= Math.min(num2, num3);
        boolean max = num1 <= Math.max(num2, num3);

        System.out.println(min && max);
    }
}