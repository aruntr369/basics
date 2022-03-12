package oops;

interface Father{
    String name = "raj";
    void detailfather(String job, int age, String bloodgroup);
}
interface  Mother{
    String name ="amala";
    void detailmother(String job, int age, String bloodgroup);
}
public class Child implements Father,Mother{
    String name="arun";
    char genter ='m';

    @Override
    public void detailfather(String job, int age, String bloodgroup) {
        System.out.println("father name " +Father.name);
        System.out.println("job is " +job);
        System.out.println("age is " +age);
        System.out.println("blood group is"+bloodgroup);
    }

    @Override
    public void detailmother(String job, int age, String bloodgroup) {
        System.out.println("mother name " +Mother.name);
        System.out.println("job is " +job);
        System.out.println("age is " +age);
        System.out.println("blood group is"+bloodgroup);
    }


    public static void main(String[] args) {
        Child obj =new Child();
        System.out.println("child name " +obj.name);
        System.out.println("Child gender "+obj.genter );

        System.out.println("--------------");
        Child2 obj1 =new Child2();
        System.out.println("child name " +obj1.name);
        System.out.println("Child gender "+obj1.genter );
        System.out.println("--------------");
        obj.detailfather("police",55,"o");
        obj.detailmother("farmer",44,"o");

    }
}
 class Child2 implements Father,Mother {
    String name = "anu";
    char genter = 'f';

    @Override
    public void detailfather(String job, int age, String bloodgroup) {
        System.out.println("father name " + Father.name);
        System.out.println("job is " + job);
        System.out.println("age is " + age);
        System.out.println("blood group is" + bloodgroup);

    }

    @Override
    public void detailmother(String job, int age, String bloodgroup) {
        System.out.println("mother name " + Mother.name);
        System.out.println("job is " + job);
        System.out.println("age is " + age);
        System.out.println("blood group is" + bloodgroup);
    }
}

