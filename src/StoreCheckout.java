import java.util.Scanner;

public class StoreCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = 0;
        int itemsPurchased = 0;
        boolean running = true;
        int mouse=0, keyboard=0, headphones=0, laptopStand=0;
        //menu loop
        while (running) {
            System.out.println("===== SIMPLE STORE =====");
            System.out.println("\n1. Mouse         - $20");
            System.out.println("2. Keyboard      - $40");
            System.out.println("3. Headphones    - $50");
            System.out.println("4. Laptop Stand  - $30");
            System.out.println("5. Checkout");
            System.out.print("\nChoose a product: ");
            int product = scanner.nextInt();

            switch (product) {

                case 1 -> {
                    System.out.println("\nYou selected: Mouse\nPrice: $20");
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (quantity <= 0) {
                        System.out.println("\nInvalid quantity.\nQuantity must be greater than 0.");
                    } else {
                        mouse += quantity;
                        double itemCost = quantity * 20;
                        subtotal += itemCost;
                        itemsPurchased += quantity;
                        System.out.println("\nAdded to cart!");
                        System.out.println("Current total: $" + subtotal);
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("\nYou selected: Keyboard\nPrice: $40");
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (quantity <= 0) {
                        System.out.println("\nInvalid quantity.\nQuantity must be greater than 0.");
                        System.out.println();
                    } else {
                        keyboard += quantity;
                        double itemCost = quantity * 40;
                        subtotal += itemCost;
                        itemsPurchased += quantity;
                        System.out.println("\nAdded to cart!");
                        System.out.println("Current total: $" + subtotal);
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("\nYou selected: Headphones\nPrice: $50");
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (quantity <= 0) {
                        System.out.println("\nInvalid quantity.\nQuantity must be greater than 0.");
                    } else {
                        headphones += quantity;
                        double itemCost = quantity * 50;
                        subtotal += itemCost;
                        itemsPurchased += quantity;
                        System.out.println("\nAdded to cart!");
                        System.out.println("Current total: $" + subtotal);
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("\nYou selected: Laptop Stand\nPrice: $30");
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (quantity <= 0) {
                        System.out.println("\nInvalid quantity.\nQuantity must be greater than 0.");
                    } else {
                        laptopStand += quantity;
                        double itemCost = quantity * 30;
                        subtotal += itemCost;
                        itemsPurchased += quantity;
                        System.out.println("\nAdded to cart!");
                        System.out.println("Current total: $" + subtotal);
                        System.out.println();
                    }
                }
                case 5 -> {
                    System.out.println("\n===== CHECKOUT =====");
                    System.out.println();
                    System.out.println("Items purchased: " + itemsPurchased);
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println();
                    running = false;
                }
                default -> System.out.println("\nInvalid option.\nPlease choose a number from 1 to 5");
            }
        }
        //calculate discount
        double discount = 0;
        if (subtotal >= 200) {
            discount = subtotal * 0.15;
            System.out.println("You received a 15% discount!");
        } else if (subtotal >= 100) {
            discount = subtotal * 0.10;
            System.out.println("You received a 10% discount!");
        }
        if (mouse >= 5) {
            discount += (mouse * 20 * 0.05);
        }
        if (keyboard >= 5) {
            discount += (keyboard * 40 * 0.05);
        }
        if (headphones >= 5) {
            discount += (headphones * 50 * 0.05);
        }
        if (laptopStand >= 5) {
            discount += (laptopStand * 30 * 0.05);
        }
        double finalTotal = subtotal - discount;
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);
        double payment = 0;
        //payment loop
        while (payment < finalTotal) {
            System.out.print("\nEnter payment amount: $");
            payment = scanner.nextDouble();
            if (payment < finalTotal) {
                double remaining = finalTotal - payment;
                System.out.println("\nInsufficient payment.\nYou still need to pay: $" + remaining);
            }
        }
        //receipt
        double change = payment - finalTotal;
        System.out.println();
        System.out.println("Payment successful! Change: $" + change);
        System.out.println();
        System.out.println("========================");
        System.out.println("      SIMPLE STORE      ");
        System.out.println("========================");
        System.out.println();
        System.out.println("===== ITEMS PURCHASED =====");
        System.out.println("Mouse: " + mouse);
        System.out.println("Keyboard: " + keyboard);
        System.out.println("Headphones: " + headphones);
        System.out.println("Laptop Stand: " + laptopStand);
        if (mouse >= keyboard && mouse >= headphones && mouse >= laptopStand) {
            System.out.println("Most purchased product: Mouse");
            System.out.println("Quantity: " + mouse);
        }
        else if (keyboard >= mouse && keyboard >= headphones && keyboard >= laptopStand) {
            System.out.println("Most purchased product: Keyboard");
            System.out.println("Quantity: " + keyboard);
        }
        else if (headphones >= keyboard && headphones >= mouse && headphones >= laptopStand) {
            System.out.println("Most purchased product: Headphones");
            System.out.println("Quantity: " + headphones);
        }
        else if (laptopStand >= keyboard && laptopStand >= headphones && laptopStand >= mouse) {
            System.out.println("Most purchased product: Laptop Stand");
            System.out.println("Quantity: " + laptopStand);
        }
        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);
        System.out.println("Payment: $" + payment);
        System.out.println("Change: $" + change);
        if (itemsPurchased >= 10){
            System.out.println("You earned a $10 coupon for your next visit!");
        }
        System.out.println();
        System.out.println("========================");
        System.out.println("Thank you for shopping!");
        System.out.println("========================");
        scanner.close();
    }
}