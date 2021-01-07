public class Item{
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
