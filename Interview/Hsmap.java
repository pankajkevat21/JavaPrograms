package Interview;
import java.util.HashMap;
import java.util.Map;

public class Hsmap {
    public  static void main(String[] args) {
       HashMap<Integer,String> map = new HashMap<>();
        map.put(121,"Pankaj");
        map.put(122,"Rohit");
        map.put(123,"Rahul");
        map.put(124,"Aman");
//        System.out.println(map);
        for(Map.Entry<Integer,String>e:map.entrySet()){
            System.out.print(e.getKey()+ " ");
            System.out.println(e.getValue()+" ");
        }
    }
}
