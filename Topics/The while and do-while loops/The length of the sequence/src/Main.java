import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        boolean isNotZero = false;

        while (!isNotZero) {
            int num = scanner.nextInt();

            if (num != 0) {
                counter++;
            } else {
                isNotZero = true;
            }
        }
        System.out.println(counter);

    }
}