import java.util.*;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(2);
        list.add(1, 6);
        list.remove(0);
        list.remove(Integer.valueOf(6));
        list.add(5);
        list.add(4);
        list.add(9);
        list.add(8);

        list1.add(5);
        list1.add(4);
        list1.add(9);
        list1.add(8);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        System.out.println();
        list.set(2, 0);
        System.out.println(list);
        list1.addAll(list);
        System.out.println(list1);
        System.out.println(list.contains(6));
    }
}