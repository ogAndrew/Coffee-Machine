import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        int students = scanner.nextInt();

        for (int i = students; i > 0; i--) {

            String grade = scanner.next();

            if ("D".equals(grade)) {
                countD++;
            }
            if ("C".equals(grade)) {
                countC++;
            }
            if ("B".equals(grade)) {
                countB++;
            }
            if ("A".equals(grade)) {
                countA++;
            }
        }

        String result = String.format("%d %d %d %d", countD, countC, countB, countA);

        System.out.println(result);

    }
}