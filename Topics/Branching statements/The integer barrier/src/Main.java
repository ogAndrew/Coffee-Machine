import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();

            sum += value;
            if (value == 0) {
                break;
            }

            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }

        System.out.println(sum);

    }
}