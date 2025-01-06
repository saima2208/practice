package ClassWork;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Denmark");
        linkedList.add("Nepal");
        linkedList.add("Srilanka");
        linkedList.add("Bangladesh");
        linkedList.add("Pakistan");
        linkedList.add("Thailand");

        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
