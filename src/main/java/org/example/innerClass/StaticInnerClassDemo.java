package org.example.innerClass;

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Furniure.Chair obj1 = new Furniure.Chair();
        obj1.hasSeatingcapacity();

    }
}


class Furniure{
    private String color;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static class Chair{
        public void hasSeatingcapacity(){
            System.out.println("You can sit inside on chair");
        }
    }
}
