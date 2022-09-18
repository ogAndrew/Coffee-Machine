import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    public static int counter = 0;


    public static String requestProduct(String product) {
        ManufacturingController.counter += 1;
        return String.format("%d. Requested %s", ManufacturingController.counter, product);
    }

    public static int getNumberOfProducts() {
        return ManufacturingController.counter;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}