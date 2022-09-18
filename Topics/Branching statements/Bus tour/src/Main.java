import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        int counter = 1;

        boolean isCrash = false;

        while (scanner.hasNextInt() && numberOfBridges > 0) {
            int bridge = scanner.nextInt();

            if (bus >= bridge) {
                isCrash = true;
                break;
            }
            counter++;
            numberOfBridges--;
        }

        if (isCrash) {
            System.out.println("Will crash on bridge " + counter);
        } else {
            System.out.println("Will not crash");
        }
    }
}