package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public int water = 400;
    public int milk = 540;
    public int beans = 120;
    public int cups = 9;
    public int money = 550;

    public static void runMachine(String input) {
        while (!("exit".equals(input))) {
            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");

                    if (!(scanner.hasNextInt())) {
                        System.out.println("that wasn't one of the choices");
                        break;
                    }

                    int coffee = scanner.nextInt();

                    if (coffee == 1) {
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (beans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups");
                            break;
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            money += 4;
                            cups -= 1;
                        }
                    }

                    if (coffee == 2) {
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (beans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");

                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            cups -= 1;
                        }

                    }

                    if (coffee == 3) {
                        if (water < 200) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (beans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");

                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            cups -= 1;
                        }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += scanner.nextInt();

                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();

                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += scanner.nextInt();

                    System.out.println("Write how many disposable cups you want to add:");
                    cups += scanner.nextInt();

                    break;
                case "take":
                    String message = String.format("I gave you $%d", money);
                    System.out.println(message);
                    money = 0;
                    break;
                case "remaining":
                    String outro = String.format(" The coffee machine has:\n" +
                            "%d ml of water\n" +
                            "%d ml of milk\n" +
                            "%d g of coffee beans\n" +
                            "%d disposable cups\n" +
                            "$%d of money", water, milk, beans, cups, money);

                    System.out.println(outro);
                    break;
                default:
                    System.out.println("Please select a correct word choice");
                    break;

            }

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            input = scanner.next();
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");

        String input = scanner.next();

        CoffeeMachine.runMachine(input);


    }
}
