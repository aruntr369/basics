package pack1;

public class Maths {
    synchronized void  table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num +"*"+i +"="+(num*i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread1 extends Thread{
    Maths obj;
    Thread1(Maths obj){
        this.obj =obj;
    }
    @Override
    public void run() {
        obj.table(2);
    }
}
class Thread2 extends Thread{
    Maths obj;
    Thread2(Maths obj){
        this.obj =obj;
    }
    @Override
    public void run() {
        obj.table(4);
    }
}
class Thread3 extends Thread{
    Maths obj;//no constructor invoke becz of no new
    Thread3(Maths obj){
        this.obj =obj;
    }
    @Override
    public void run() {
        obj.table(6);
    }
}
class  main{
    public static void main(String[] args) {
        Maths obj =new Maths();
        Thread1 t1 =new Thread1(obj);
        Thread2 t2 =new Thread2(obj);
        Thread3 t3 =new Thread3(obj);

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

    }
}