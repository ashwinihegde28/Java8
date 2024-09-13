package org.example.enumeration;

public enum Apple {
    Gala(2), HoneyCrisp(2), Cortland(1),RedDel;



    private int price;


    Apple(int p) {
        price = p;
    }

    Apple() {
        price = 1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
