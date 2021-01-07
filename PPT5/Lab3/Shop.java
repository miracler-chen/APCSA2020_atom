import java.util.ArrayList;
import java.util.Scanner;



public class Shop{
    static class Item{
        private String name;
        private double prize;
        private int quantity;

        public Item(String nm, double prz, int qtt){
            name = nm;
            prize = prz;
            quantity = qtt;
        }

        public String getName(){
            return name;
        }

        public double getPrize(){
            return prize;
        }

        public int getQuantity(){
            return quantity;
        }

        public String toString(){
            return name + "\t\t" + prize + "\t\t\t" + quantity + "\t\t\t" +  quantity * prize;
        }
    }

    public static void main (String[] args){
        ArrayList<Item> shopping = new ArrayList<Item>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        double totalPrice = 0;
        int totalQuan = 0;

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do
        {
            System.out.println("Enter the name of the item: ");
            itemName = scan.next();

            System.out.println("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.println("Enter the quantity: ");
            quantity = scan.nextInt();
            totalPrice += itemPrice * quantity;
            totalQuan += quantity;

            // *** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            shopping.add(item);

            // *** print the contents of the cart object using println
            for (Item itm : shopping){
                System.out.println(itm);
            }

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();

        }
        while (keepShopping.equals("y"));
        System.out.println();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Shopping List");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|Item|" + "\t\t|Unit Price|" + "\t\t|Quantity|" + "\t\t|Total for this|");
        for (Item itmspe : shopping)
        {
            System.out.println(itmspe.toString());
        }
        System.out.println();
        System.out.println("You need to pay: " + "$" + totalPrice);
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println();
    }
}
