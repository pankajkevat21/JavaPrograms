import java.util.Iterator;
public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        set.add(125);
        set.add(124);
        set.add(112);
        set.add(123);
        System.out.println(set);
//        set.clear();
        System.out.println(set.isEmpty());

        System.out.println();
        System.out.println("the size of set: "+set.size());
        Iterator it  = set.iterator();

         while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
