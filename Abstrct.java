abstract  class abs{
    abstract  public  void mymethod();
    void sound(){
        System.out.println("hello this is abstract class");
    }
}
 class Abstrct extends abs{
public void mymethod(){
    System.out.println("abstract method body provided here");
}

     public static void main(String[] args) {
         Abstrct ab = new Abstrct();
         ab.mymethod();
         ab.sound();
     }
}
