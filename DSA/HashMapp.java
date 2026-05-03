import  java.util.*;
public class HashMapp {
    public static void main() {
     HashMap<String, Integer> map = new HashMap<>();


        map.put("petrol",45);
        map.put("Deisel",40);
        map.put("CNG",457);
        System.out.println(map);
        map.put("LPG",4580);
        for(Map.Entry<String,Integer> i: map.entrySet()){
            System.out.print(" "+i.getKey()+" ");
            System.out.print(i.getValue());
            System.out.println();
        }
        System.out.println(map);
        System.out.println(map.get("LPG"));
        System.out.println(map.get("indonasia"));
        if(map.containsKey("LPG"))
        {
            System.out.println("lpg  present in the map");
        }
        if(!map.containsKey("LPG"))
        {
            System.out.println("LPG not present in the map ");
        }


    }
}
