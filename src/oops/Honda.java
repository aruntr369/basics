package oops;

class Car{
    final String color = "Black";

    void milage(){
        System.out.println("honda has an avg milage of 14.5km/ltr");
    }
}
public class Honda extends  Car{

    String color = "red";

    @Override
    void milage() {
        System.out.println("My fvrt color for car is "+(super.color));
        super.milage();
    }
    public static void main(String[] args) {
        Honda obj = new Honda();
        System.out.println((obj.color="yellow")+" is a common color for car");
        obj.milage();

    }
}