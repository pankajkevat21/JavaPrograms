package Java_Advanced;

public class Concurrency  extends Thread{
    static int amount = 0;
    public static void main(String[] args) {
        Concurrency cn = new Concurrency();
        cn.start();
        while (cn.isAlive())
        {
            System.out.println("Waiting");
        }
        System.out.println("Main:"+amount);
        amount++;
        System.out.println("Main:"+amount);


    }
    public void run(){
        amount++;
    }
}
