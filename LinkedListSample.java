package SchoolFolder;

import java.util.*;

public class LinkedListSample<T> {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(); 
        linkedList.add("Mika");
        linkedList.addFirst("Matt");
        linkedList.addLast("Hana");
        linkedList.add(1, "Hanazawa");
        System.out.println(linkedList.size());
    }
}