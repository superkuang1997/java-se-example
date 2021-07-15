package collection.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_demo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        set.add("d");

        for (Iterator iter = set.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
