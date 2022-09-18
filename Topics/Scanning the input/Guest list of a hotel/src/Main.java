import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        while (scanner.hasNext()) {
            names.add(scanner.next());

        }

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();




    }
}