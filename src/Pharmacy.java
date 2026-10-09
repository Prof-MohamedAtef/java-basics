import java.util.Scanner;

public class Pharmacy {

    public static void main(String[] args) {
        boolean isRunning = true;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Pharmacy Application");
        System.out.println("Add/Remove Items");
        System.out.println("Select Options:");
        System.out.println("1. Add Items");
        System.out.println("2. Remove Items");
        System.out.println("3. Stop Application");
        while (isRunning){
            String isWorking = scanner.nextLine();
            if (isWorking.equals("3")){
                isRunning = false;
                System.out.println("Application has been closed!");
                return;
            }else {
                System.out.println("Add Item Name");
                String itemName = scanner.nextLine();
                System.out.println("Add Item Price");
                float itemPrice = scanner.nextFloat();
                System.out.println("Add Item Discount");
                float itemDiscount = scanner.nextFloat();
                addItem(itemName, itemPrice, itemDiscount);
                System.out.println("Final Price: " + addItem(itemPrice, itemDiscount));
            }
        }
    }


    public static void addItem(String name, float price, float discount){ // arguments
        System.out.println(
                "Item Name: " + name + "\nPrice: " +price +"\nDiscount: " +discount
        );
    }

    public static float addItem(float price, float discount){
        return price - discount;
    }
}
