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
class Que7{
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 1200.0, 1);
        Item item2 = new Item("PC",6000.0,2);
        Item item3 = new Item("Phone",2000.0,4);
        Item items[]={item1,item2,item3};
        String fileName = "shopping.dat";
        try{
        	FileOutputStream fout=new FileOutputStream(fileName);
        	ObjectOutputStream objectOut=new ObjectOutputStream(fout);
        	for(Item item:items){
        		objectOut.writeObject(item);
        	}
        	System.out.print("Shopping details have been serialized and stored: "+fileName);
        }catch(Exception e){
        	e.printStackTrace();
        }
    }
}
