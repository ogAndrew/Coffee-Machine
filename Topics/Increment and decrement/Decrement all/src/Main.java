import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(--num);
        }

        System.out.println(numbers.get(0) + " " + numbers.get(1) + " " +  numbers.get(2) + " " + numbers.get(3));
    }
}