import java.util.Set;
import java.util.TreeSet;
// import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); takes the element into in random order
        // Set<Integer> set = new LinkedHashset<>(); takes the element inside in the
        // same order of insertion
        Set<Integer> set = new TreeSet<>(); // takes the element in an sorted array
        set.add(35);
        set.add(4);
        set.add(5);
        set.add(7);
        set.add(7);
        set.add(4);
        System.out.println(set);

    }
}
