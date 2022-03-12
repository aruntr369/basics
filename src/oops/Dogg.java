package oops;

public class Dogg {
    String pet= "Dog";
    void food(){
        System.out.println("Dogs eat non veg");
    }
    void show(){
        System.out.println("dog show");
    }
}
class Lab extends  Dogg{
    String breed = "Lab";
    void age (){
        System.out.println("My "+breed + " is 1 yr old");
    }

    @Override
    void show() {
        super.show();
        System.out.println("Lab show");

    }
}
class LabPuppy extends Lab{
    String name  ="Popy";
    void drink(){
        System.out.println("My "+name+" drinks Milk");
    }

    @Override
    void show() {
        super.show();
        System.out.println("Labpuppy show");

    }

    public static void main(String[] args) {

        LabPuppy obj = new LabPuppy();
        System.out.println("I have a pet she is a "+obj.pet +" it is "+obj.breed);
        System.out.println(obj.breed + " have a baby too , its name is "+obj.name);
        obj.food();
        obj.age();
        obj.drink();
        obj.show();
    }
}