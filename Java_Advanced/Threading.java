package Java_Advanced;
/*
public class Threading extends  Thread{
    public void run(){
        System.out.println("this code is inside of thread");
    }
    public static void main(String[] args) {
           Threading th = new Threading();
           th.start();
        System.out.println("This code is outside of thread");
    }

}
*/
public class Threading implements Runnable{
    public void run(){
        System.out.println("this code is inside of thread");
    }
    public static void main(String[] args) {
        Threading th = new Threading();
       Thread obj = new Thread(th);
       obj.start();
    }
}