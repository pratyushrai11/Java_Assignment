import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Apple");
        list.add("Samsung");
        list.add("Oneplus");
        list.add("Nothing");
        list.add(12);
        list.add(19);
        list.add(13);
        list.addFirst(21);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        LinkedList<String> marvel = new LinkedList<>();
        marvel.add("Iron Man");
        marvel.add("Hulk");
        marvel.add("Hawkeye");
        marvel.addFirst("Steve Rogers");
        marvel.add("Moon Knight");
        marvel.add("Falcon");
        marvel.add("Daredevil");
        marvel.add(3,"Spider-Man");
        System.out.println(marvel);

        System.out.println(marvel.contains("Falcon"));
        System.out.println(marvel.contains("Ant Man"));

        System.out.println("Before Sortig: ");
        System.out.println(marvel);
        System.out.println("After Sorting: ");
        Collections.sort(marvel);
        System.out.println(marvel);
        for(int i = 0; i<marvel.size(); i++){
            System.out.print(marvel.get(i) + " -> ");
        }
        System.out.println("null");
    }
}