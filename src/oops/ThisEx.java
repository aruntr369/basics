package oops;

public class ThisEx {

    String name;
    int age;
    long phone;

    ThisEx(String name,int age, long phone){
        this.name = name;
        this.age = age;
        this.phone=phone;
    }

    void display(){

        System.out.println("Student name "+name);
        System.out.println("Student age  "+age);
        System.out.println("Student phone "+phone);
    }
    public static void main(String[] args) {
        ThisEx obj = new ThisEx("anu",20,9876543210l);
        obj.display();
    }
}