package oops;
//parent
public class Animal {
    String color = "Black";
    void eat(){
        System.out.println("Most of the animals are non veg");
    }
    void vaccine(){
        System.out.println("Pets should be vaccinated");
    }
}
//child 1
class Dog extends Animal{
    String breed = "Lab";
    void sound(){
        System.out.println(breed+" is barking");
    }
}
class Cat extends Animal{
    String breed = "Persian Cat";
    void age(){
        System.out.println("My pet "+breed+ " is 1 yr old");
    }
}

class Main{

    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println("My pet is a Dog and it is  "+obj.breed);
        obj.sound();
        System.out.println("My lab color is  "+obj.color);
        obj.eat();

        System.out.println("----------------------------------------");

        Cat obj1 = new Cat();
        System.out.println("My pet is a Cat and it is "+obj1.breed);
        obj1.age();
        System.out.println("My pet color is "+obj1.color);
        obj1.vaccine();


    }
}