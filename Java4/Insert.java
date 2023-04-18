import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array");
            int n = sc.nextInt();
            int[] a = new int[n]; // old array
            System.out.println("enter the elements into an array");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("enter the position of an element to insert along with element to insert");
            int pos = sc.nextInt(); // position to insert
            int x = sc.nextInt(); // element to be inserted
            int[] newarr = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                if (i < pos - 1)
                    newarr[i] = a[i];
                else if (i == pos - 1)
                    newarr[i] = x;
                else
                    newarr[i] = a[i - 1];
            }
            System.out.println("the elements in the new array are:");
            // for (int i = 0; i < newarr.length; i++) {
            // System.out.print(newarr[i]);
            // }
            // for (int i : newarr) {
            // System.out.print(i);
            // }
            System.out.println(Arrays.toString(newarr));
        }

        /*
         * //2nd approach
         * // Converting array to ArrayList
         * List<Integer> list = new ArrayList<>(
         * Arrays.asList(arr));
         * 
         * // Adding the element at position
         * list.add(position - 1, element);
         * 
         * // Converting the list back to array
         * arr = list.toArray(arr);
         * 
         * // Printing the updated array
         * System.out.println("\nArray with " + element
         * + " inserted at position "
         * + position + ":\n"
         * + Arrays.toString(arr));
         */
    }
}
