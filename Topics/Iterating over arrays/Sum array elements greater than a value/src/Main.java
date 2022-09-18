import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }

        int n = scanner.nextInt();


        for (int num : array) {

            if (num > n) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}