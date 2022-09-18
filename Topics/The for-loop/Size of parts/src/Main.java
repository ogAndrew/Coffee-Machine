import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parts = scanner.nextInt();

        int fix = 0;
        int reject = 0;
        int ready = 0;

        for (int i = parts; i > 0; i--) {
            int part = scanner.nextInt();

            if (part > 0) {
                fix++;
            }
            if (part < 0) {
                reject++;
            }
            if (part == 0) {
                ready++;
            }
        }

        String result = String.format("%d %d %d", ready, fix, reject);

        System.out.println(result);
    }
}