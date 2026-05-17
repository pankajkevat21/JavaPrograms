public class Hanoi {
    public static void towerofhanoi(int n, String src, String helper , String Dest){
        if(n==1){
            System.out.println("Transfer disk "+n +" from "+src +"  to "+Dest);
      return;
        }
        towerofhanoi(n-1,src,Dest,helper);
        System.out.println("Transfer disk "+n +" from "+src +" to "+Dest);
        towerofhanoi(n-1,helper,src,Dest);
    }
    public static void main(String[] args) {
        int n =5;
  towerofhanoi(n,"S","H","D");
    }
}
