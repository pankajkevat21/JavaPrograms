class A{
    A(){
        System.out.println("this is a constructor");
    }
}
class B extends A {
    B(int i){
        System.out.println("this is another constructor");
    }
    B(){
        System.out.println("This is a another constructor");
    }
}
public class Cons {
 public static void main(String[] args) {
     B b1 = new B(2);
     B b2 = new B();
 }

}
