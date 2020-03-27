package zad;

public class Zad {

    private static int price;

    private int quantity;
    private int age;
    private int year;
    private String name;

    public Zad(int q, int a, int y, String n){
        this.quantity = q;
        this.age = a;
        this.year = y;
        this.name = n;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getName(){
        return name;
    }

}
