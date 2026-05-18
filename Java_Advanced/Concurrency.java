package Java_Advanced;

public class Concurrency  extends Thread{
    static int amount = 0;
    public static void main(String[] args) {
        Concurrency cn = new Concurrency();
        cn.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run(){
        amount++;
    }
}
