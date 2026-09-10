package Interview;

class Inherit {
    public void mymethod(int m) {

            System.out.println("The value of n = 13");

    }
}
class Inherit2 extends Inherit{
    public void mymethod(int k){

        super.mymethod(12);
        System.out.println("The code is inside the base2 class");
    }
}
public class Inheritance extends Inherit2 {

    public static void main(String[] args) {

        Inheritance in = new Inheritance();

        in.mymethod(1);
    }
}