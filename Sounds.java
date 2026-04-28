import org.w3c.dom.ls.LSOutput;

import javax.net.ssl.SNIHostName;

class Animal{
    void sound(){
        System.out.println("this is dog barking sound");
    }
}
class Snake extends Animal{
    void sound(){
        System.out.println("this is snake bite sound");
    }
}
class Owl extends Animal{
    void sound(){
        System.out.println("this is 360 degree rotate by owl");
    }
}
public class Sounds {
   public static void main(String[] args) {
       Animal anml = new Animal();
       anml.sound();
       anml = new Snake();
       anml.sound();
       anml = new Owl();
       anml.sound();


    }

}
