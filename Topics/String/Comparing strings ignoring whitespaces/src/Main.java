import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine().replaceAll(" ", "");
        String str2 = scanner.nextLine().replaceAll(" ", "");

        System.out.println(str1.equals(str2));


    }
}