import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(11);
        System.out.println(list1);
        int len = list1.size();
        System.out.println("len: " + len);
        ArrayList list2 = new ArrayList();
        list2.add(34);
        list2.add(35);
        list2.add(36);
        list2.add(37);
        list2.add(38);
        list2.add(39);
        list2.add(40);
        System.out.println(list2);
        list1.addAll(3, list2);
        System.out.println(list1);

        Object obj = list1.get(1);
        System.out.println(obj);
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("Before set");
        System.out.println(list1);
        list1.set(3, 1000);
        System.out.println("After set");
        System.out.println(list1);
        list1.add("Hello");
        list1.add(1000);
        System.out.println(list1);
        */
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(10.4f);
        list1.add("GSV");
        list1.add(null);
        list1.add(true);
        list1.add("(");
        System.out.println(list1);
        for(int i = 0;i<list1.size();i++){
            Object obj1 = list1.get(i);
            if(obj1 instanceof Integer){
                System.out.println(obj1);
                Integer i1 = (Integer)obj1;
                System.out.println("Integer: " + i1);
            }
            if(obj1 instanceof Float){
                System.out.println(obj1);
                Float f1 = (Float)obj1;
                System.out.println("Float: " + f1);
            }
            if(obj1 instanceof String){
                String s1 = (String)obj1;
                System.out.println("String: " + s1);
            }
            if(obj1 instanceof Boolean){
                Boolean b1 = (Boolean)obj1;
                System.out.println("Boolean: " + b1);
            }
        }
//        Iterator iter = list1.iterator();
//        while (iter.hasNext()) {
//            Object obj2 = iter.next();
//            // list1.set(3, 4000);
//            System.out.println(obj2);
//        }
//        System.out.println(list1);
//        System.out.println("Forward....");
//        ListIterator listiter = list1.listIterator();
//
//        while (listiter.hasNext()) {
//            Object obj2 = listiter.next();
//            System.out.println(obj2);
//        }
//
//        System.out.println("Back...");
//        while (listiter.hasPrevious()) {
//            Object obj2 = listiter.previous();
//            System.out.println(obj2);
//        }
        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(34);
        i1.add(37);
        i1.add(39);
        i1.add(33);
        i1.add(31);
        ArrayList<Integer> i2 = new ArrayList<>();
        i2.add(24);
        i2.add(37);
        i2.add(19);
        i2.add(33);
        i2.add(31);
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);


        i1.remove(3);
        System.out.println("i1: " + i1);
        i1.removeAll(i2);
        System.out.println("i1: " + i1);

        i1.retainAll(i2);
        System.out.println("i1: "+ i1);

        i1.addAll(i2);
        System.out.println(i1);
        Collections.sort(i1);
        System.out.println(i1);
        System.out.println(Collections.binarySearch(i1,34));

        ArrayList combined = new ArrayList();
        combined.add(1);
        combined.add(2);
        combined.add("Hello");
        combined.add("Data Science");
        combined.add("Sarfaraz Khan");
        combined.add(true);
        combined.add(21);
        System.out.println("List: " + combined);
        // Collections.sort(combined);
        // System.out.println("List: " + combined);
        System.out.println(Collections.binarySearch(combined, true));
    }
}