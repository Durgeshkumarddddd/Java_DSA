import java.util.*;

class OOPS {

    public static void main (String args[]){
        Pen p1 = new Pen();
        p1.setdata("blue", 15);
        p1.displaydata();
    }
}

class Pen {
    String color ;
    int price ;

    public void setdata(String newcolor, int price){
        this.color = newcolor ;
        this.price = price;
    }

    public void displaydata(){
        System.out.println("color is "+color + "price");
    }
}