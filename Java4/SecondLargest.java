
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter n");
            int n = sc.nextInt();
            if (n < 2)
                System.out.println("Invalid Input");
            int[] a = new int[n];
            System.out.println("eter the elements");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();

            }
            // 1st type
            // int temp = 0;
            // for (int i = 0; i < a.length; i++) {
            // for (int j = i + 1; j < a.length; j++) {
            // if (a[j] < a[j - 1]) {
            // temp = a[j];
            // a[j] = a[j - 1];
            // a[j - 1] = temp;
            // }
            // }
            // }
            // System.out.println("the second largest" + a[a.length - 2]);

            // 2nd type
            /*
             * // Sort the array
             * // Arrays.sort(arr);
             * // // Start from second last element
             * // // as the largest element is at last
             * // for (i = arr_size - 2; i >= 0; i--) {
             * // // If the element is not
             * // // equal to largest element
             * // if (arr[i] != arr[arr_size - 1]) {
             * // System.out.printf("The second largest " +
             * // "element is %d\n", arr[i]);
             * // return;
             * // }
             * // }
             */

            int f = Integer.MIN_VALUE;
            int s = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > f) {
                    s = f;
                    f = a[i];
                } else if (a[i] > s && a[i] != f)
                    s = a[i];

            }
            if (s == Integer.MIN_VALUE) {
                System.out.println("there is no second largest element");
            } else
                System.out.println("the second largest element is " + s);
            // 3rd type
            /*
             * // Scanner sc = new Scanner(System.in);
             * // System.out.println("enter n");
             * // int n = sc.nextInt();
             * // int[] a = new int[n];
             * // System.out.println("eter the elements");
             * // for (int i = 0; i < a.length; i++) {
             * // a[i] = sc.nextInt();
             * 
             * // }
             * // for (int i = 0; i < a.length; i++) {
             * // set.add(a[i]);
             * // }
             * // int i = 0;
             * // for (int x : set)
             * // a[i++] = x;
             * // System.out.println("the seconf largeest element is " + a[n - 1]);
             */
        }

        // 4th type
        /*
         * // given ArrayList
         * List<Integer> v = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1));
         * // inserting all the elements from ArrayList v to TreeSet s.
         * Set<Integer> s = new TreeSet<>(v);
         * // clear the ArrayList.
         * v.clear();
         * // insert all elements back in ArrayList in sorted order.
         * for(
         * int value:s)
         * {
         * v.add(value);
         * }
         * // the size of updated ArrayList.
         * int n = v.size();
         * // printing the second largest element in ArrayList.
         * System.out.print("The Second Largest Element in ArrayList is: ");System.out.
         * println(v.get(n-2))
         */
        // 5th type
        /*
         * int largest = second = Integer.MIN_VALUE;
         * 
         * // Find the largest element
         * for(i=0;i<arr_size;i++)
         * {
         * largest = Math.max(largest, arr[i]);
         * }
         * 
         * // Find the second largest element
         * for(i=0;i<arr_size;i++)
         * {
         * if (arr[i] != largest)
         * second = Math.max(second, arr[i]);
         * }if(second==Integer.MIN_VALUE)System.out.printf("There is no second "
         * +"largest element\n");else
         * System.out.printf("The second largest "+"element is %d\n",second);
         */

        // 6th type
        /*
         * PriorityQueue<Integer> pq = new PriorityQueue<>(
         * Collections.reverseOrder());
         * // inserting all the element from vector v to
         * // priority queue pq.
         * for (int i = 0; i < v.size(); i++) {
         * pq.add(v.get(i));
         * }
         * 
         * // Remove largest element from pq
         * pq.poll();
         * 
         * // Now top of priority queue is second largest
         * // element
         * System.out.println(
         * "The Second Largest Element in Vector is: "
         * + pq.peek());
         */
    }
}
