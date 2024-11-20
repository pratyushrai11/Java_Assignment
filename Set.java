import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(34);
        set.add(56);
        set.add(45);
        System.out.println(set);
        HashSet set1 = new HashSet();
        set1.add(43);
        set1.add(65);
        set1.add(54);
        System.out.println(set1);

        set1.addAll(set);
        System.out.println(set1);
    }

}
