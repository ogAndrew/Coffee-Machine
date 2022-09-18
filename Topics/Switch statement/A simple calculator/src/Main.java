import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long b = scanner.nextLong();

        long result = 0;

        String message = "";

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    message = "Division by 0!";
                } else {
                    result = a / b;
                }
                break;
            default:
                message = "Unknown operator";
                break;
        }

        if (!message.isEmpty()) {
            System.out.println(message);
        } else {
            System.out.println(result);
        }

    }
}