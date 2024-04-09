
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        String itemName1 = scanner.nextLine();
        System.out.print("Enter the item price: ");
        int itemPrice1 = scanner.nextInt();
        System.out.print("Enter the item quantity: ");
        int itemQuantity1 = scanner.nextInt();

        
        scanner.nextLine();

        System.out.println("Item 2");
     System.out.print("Enter the item name: ");
        String itemName2 = scanner.nextLine();
        System.out.print("Enter the item price: ");
        int itemPrice2 = scanner.nextInt();
        System.out.print("Enter the item quantity: ");
        int itemQuantity2 = scanner.nextInt();

         ItemToPurchase item1 = new ItemToPurchase();
        item1.setName(itemName1);
        item1.setPrice(itemPrice1);
        item1.setQuantity(itemQuantity1);

        ItemToPurchase item2 = new ItemToPurchase();
        item2.setName(itemName2);
        item2.setPrice(itemPrice2);
        item2.setQuantity(itemQuantity2);
         
        int totalCost = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getPrice() * item1.getQuantity()));
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getPrice() * item2.getQuantity()));
        System.out.println("\nTotal: $" + totalCost);

        scanner.close();
    }
}
