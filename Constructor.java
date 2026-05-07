class Base1{
    Base1(){
        System.out.println("I am base1 class defualt constructor");
    }
    Base1(int k){
        System.out.println("i am single parameter constructor of class Base1"+k);
    }
    Base1(int k, int l){

        System.out.println("i am double parametrerized constructor and sum:"+(k+l));
    }
}
class  Derived extends Base1 {
    Derived(){
        System.out.println("i am derived class default constructor");
    }
    Derived(int k){
        System.out.println("i am derived class Single parameterized constructor"+k);
    }
    Derived(int m, int n){
        super(m,n);
        System.out.println("i am derived class double parameterized constructor and sum:"+(m+n));
    }
}
public class Constructor {
    public static void main(String[] args) {

        Derived d2 = new Derived(5, 9);

    }
}
