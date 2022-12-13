import Factory.*;
import Pizzas.*;
import java.util.Scanner;

public class PizzaTest {
    public static void main(String[] args) {
        int totalCost = 0;
        String finalOrder = null;
        PizzaFactory pizzaFactory = new PizzaFactory();

        int firstInput = 0; // first input
        int secondInput = 0; // second input
        int choice = 0;

        Pizza orderedPizza = null;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Small, 300NTD");
        System.out.println("2. Big, 400NTD");

        System.out.println("Choose the size of the pizza:");
        firstInput = input.nextInt();

        switch (firstInput) {
            case 1:

                orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("small", orderedPizza);
                break;
            case 2:

                orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("big", orderedPizza);
                break;

            default:

                System.out.println("Invalid input");
                System.exit(0);

        }

        System.out.println("1. CheeseCrust, 50NTD");
        System.out.println("2. ThickCrust, free");
        System.out.println("3. ThinCrust, free");

        System.out.println("Choose the crust of the pizza:");
        secondInput = input.nextInt();

        switch (secondInput) {
            case 1:

                orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("CheeseCrust", orderedPizza);
                break;
            case 2:

                orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("ThickCrust", orderedPizza);
                break;
            case 3:

                orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("ThinCrust", orderedPizza);
                break;

            default:

                System.out.println("Invalid input");
                System.exit(0);
        }

        do {
            System.out.println("Enter the ingredients of your choice: ");
            System.out.println("1. Bacon, 50NTD");
            System.out.println("2. Mushrooms, 40NTD");
            System.out.println("3. Onions, 30NTD");
            System.out.println("4. Pepperoni, 60NTD");
            System.out.println("5. Sausage, 50NTD");
            System.out.println("Press 6 to see the total price");

            choice = input.nextInt();

            switch (choice) {
                case 1:

                    orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("Bacon", orderedPizza);

                    finalOrder = orderedPizza.getDescription();
                    // finalOrder = finalOrder.substring(0, finalOrder.length() - 2);

                    totalCost = orderedPizza.cost();

                    System.out.println("Order: " + finalOrder + " - $" + totalCost);

                    break;
                case 2:

                    orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("Mushrooms", orderedPizza);

                    finalOrder = orderedPizza.getDescription();
                    // finalOrder = finalOrder.substring(0, finalOrder.length() - 2);

                    totalCost = orderedPizza.cost();

                    System.out.println("Order: " + finalOrder + " - $" + totalCost);

                    break;
                case 3:

                    orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("Onions", orderedPizza);

                    finalOrder = orderedPizza.getDescription();
                    // finalOrder = finalOrder.substring(0, finalOrder.length() - 2);

                    totalCost = orderedPizza.cost();

                    System.out.println("Order: " + finalOrder + " - $" + totalCost);

                    break;
                case 4:

                    orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("Pepperoni", orderedPizza);

                    finalOrder = orderedPizza.getDescription();
                    // finalOrder = finalOrder.substring(0, finalOrder.length() - 2);

                    totalCost = orderedPizza.cost();

                    System.out.println("Order: " + finalOrder + " - $" + totalCost);

                    break;
                case 5:

                    orderedPizza = (Pizza) pizzaFactory.orderRequestedOrder("Sausage", orderedPizza);

                    finalOrder = orderedPizza.getDescription();
                    // finalOrder = finalOrder.substring(0, finalOrder.length() - 2);

                    totalCost = orderedPizza.cost();

                    System.out.println("Order: " + finalOrder + " - $" + totalCost);

                    break;
                case 6:

                    finalOrder = orderedPizza.getDescription();
                    // finalOrder = finalOrder.substring(0, finalOrder.length() - 2);

                    totalCost = orderedPizza.cost();

                    System.out.println("Final Order: " + finalOrder + " - $" + totalCost);
                    System.out.println("End order");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }

        } while (choice != 6);

        input.close();

    }

}