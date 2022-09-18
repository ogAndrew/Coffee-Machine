import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        StringBuilder str = new StringBuilder();

        int counter = 0;

        for (int i = 1; counter < n; i++) {

            for (int j = i; j > 0; j--) {
                str.append(i);
                counter++;
                if (counter == n) {
                    break;
                }
                str.append(" ");
            }

        }

        System.out.println(str);
    }
}