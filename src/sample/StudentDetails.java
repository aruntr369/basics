package sample;

import java.util.Scanner;

public class StudentDetails {
    int age;
    String name;
    static String course;
    static  String inst;

    void display(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(course);
        System.out.println(inst);
    }
    void datas(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter name");
        name =obj.next();
        System.out.println("enter age");
        age =obj.nextInt();
    }
}
class student extends StudentDetails{
    public static void main(String[] args) {
        StudentDetails obj1=new StudentDetails();
        obj1.datas();
        obj1.display();
        StudentDetails.course="BE";
        StudentDetails.inst="cusat";
        obj1.display();
        System.out.println(StudentDetails.course);
        System.out.println(StudentDetails.inst);
    }
}
