import java.util.ArrayList;
import java.util.List;

public class RemoveRangeMethod extends ArrayList {
    public static void main(String[] args) {
        RemoveRangeMethod rd = new RemoveRangeMethod();
        rd.add(34);
        rd.add(324);
        rd.add(348);
        rd.add(314);
        rd.add(344);
        System.out.println(rd);
        rd.removeRange(0, 4);
        System.out.println(rd);
        System.out.println(rd.isEmpty());

        ArrayList list = new ArrayList();
        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);
        list.add(38);
        list.add(39);
        list.add(40);
        list.add(41);
        list.add(42);
        System.out.println("list: " + list);
        Object all[] = list.toArray();
        for(Object el:all){
            System.out.println(el);
        }
        System.out.println(list.indexOf(34));
        System.out.println(list.indexOf(314));
        List sublist = list.subList(2, 5);
        System.out.println(sublist);
    }
}