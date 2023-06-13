package feladat2;

import java.util.Comparator;
public class Product {
    protected int ID;
    private String name;
    private int amount;
    private int price;
    private int updated;

    public Product(int ID, String name, int amount, int price) {
        this.ID = ID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
    public void increaseAmount(int newAmount){
        this.amount += newAmount;
        this.updated +=1;
    }
    public static Comparator<Product> IDComparator = (o1, o2) ->{
        if (o1.getID() < o2.getID()) return -1;
        else if (o1.getID() > o2.getID()) return 1;
        return 0;
    };

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
