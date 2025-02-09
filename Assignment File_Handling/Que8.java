import java.io.*;
class Item implements Serializable {
    private String itemName;
    private double price;
    private int quantity;
    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
         
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalCost() {
        return price * quantity;
    }
    @Override
    public String toString() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}
class Que8{
    public static void main(String[] args) {
        String fileName = "shopping.dat";
        double totalMoney = 0.0;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            while (true) {
                try {
                    Item item = (Item) objectIn.readObject();
                    totalMoney += item.getTotalCost();
                    System.out.println(item.toString()); 
                } catch (Exception f) {
                    break;
                }
            }                                                                                                                                                                                                                                                  
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Total money spent: " + totalMoney+"/-");
    }
}
