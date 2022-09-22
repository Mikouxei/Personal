import java.util.Scanner;

public class App {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("\nWELCOME TO ANGELS PIZZA!");

        System.out.println("\nPLEASE SELECT FROM OUR MENU: ");
        System.out.println("Enter 1 for Creamy Spinach Dip Pizza (P 400.00)");
        System.out.println("Enter 2 for Creamy Garlic & 5 Cheese Pizza (P 355.00).");

        System.out.print("\nEnter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;

        switch (choice) {
            case '1':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case '2':
                pizza = "Creamy Garlic & 5 Cheese Pizza";
                price = 355.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }
        
        String pizzaCrust = "";

        System.out.println("\nTYPE OF CRUST (CHOOSE 1): ");
        System.out.println("Enter 1 for Hand Tossed.");
        System.out.println("Enter 2 for Thin Crust.");
        System.out.print("\nEnter your choice here: ");
        char crust = scan.next().charAt(0);

        switch(crust) {
            case '1':
                pizzaCrust = "Hand Tossed";
                break;
            case '2':
                pizzaCrust = "Thin Crust";
                break;
            default:
                System.out.println("Invalid Crust.");
        }

        String pizzaSize = "";

        System.out.println("\nPIZZA SIZE (CHOOSE 1): ");
        System.out.println("Enter 1 for Medium size.");
        System.out.println("Enter 2 for Family size");
        System.out.println("Enter 3 for Big Family size.");
        System.out.print("\nEnter your choice here: ");
        char size = scan.next().charAt(0);

        switch(size) {
            case '1':
                pizzaSize = "Medium Size";
                break;
            case '2':
                pizzaSize = "Family Size";
                break;
            case '3':
                pizzaSize = "Big Family Size";
                break;
            default:
                System.out.println("Invalid Crust.");
        }

        System.out.print("\nENTER QUANTITY: ");
        int quantity = scan.nextInt();

        double total = quantity*price;

        System.out.println("\nYour Order is: " + quantity + " " + pizza);
        System.out.println("The Crust of your pizza/s is: " + pizzaCrust);
        System.out.println("The Size of your pizza/s is: " + pizzaSize);
        System.out.println("\nYour Total Amount is: " + "P " + total);

        System.out.print("\nEnter Payment: P ");
        double payment = scan.nextDouble();

        double change = payment - total;

        if (payment >= total) {
            System.out.println("\nHere's your change: " + "P " + change + " Thank you!");
        }
        else {
            System.out.println("Payment wasn't enough!");
        }
        

        scan.close();
    }
}
