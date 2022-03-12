package pack1;

public class ThreadEx extends Thread{
    void add(){
        int sum =10+20;
        System.out.println(sum);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("currently working thread is "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread obj=new ThreadEx();
        Thread obj1=new ThreadEx();
        obj.setName("name is 1");
        obj1.setName("name is 2");

        obj1.setPriority(MAX_PRIORITY);
        obj.setPriority(9);
        ((ThreadEx) obj).add();
        obj.start();
        obj1.start();
    }
}
