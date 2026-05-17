package  TestingPrograms;
class Myemployee{
    private  int id;
    private String name;
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }
    void setName(String name ){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
public class Setter_Getter {
    public static void main(String[] args) {
Myemployee m1 = new Myemployee();
    m1.setId(123);
        System.out.println(m1.getId());
        m1.setName("pankaj kevat");
        System.out.println(m1.getName());
    }
}
