package pack1;
class Mytask implements Runnable{

    @Override
    public void run() {
        System.out.println("My task");
    }
}
public class ThreadEx2 implements Runnable {
    @Override
    public void run() {
        System.out.println("currently working thread  "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadEx2 obj= new ThreadEx2();
        Thread t=new Thread(obj); //only run fun in runnable, to access thread fun
        t.setName("hello");
        t.setPriority(10);
        t.start();

//        Mytask obj2= new Mytask();
//        Thread t2=new Thread(obj2);
//        t2.start();      //or
        new Thread(new Mytask()).start();

    }
}
