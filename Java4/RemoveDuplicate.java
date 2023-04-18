public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 3, 4 };
        // int[] a1 = new int[a.length];
        // for (int i = 0; i < a.length; i++) {
        // int flag = 0;
        // for (int j = i + 1; j < a.length; j++) {

        // if (a[i] == a[j]) {
        // flag = 1;
        // continue;
        // }

        // }
        // if (flag == 0) {
        // a1[i] = a[i];
        // }
        // }
        // for (int j = 0; j < a1.length; j++) {
        // if (a1[j] != 0) {
        // System.out.println(a1[j]);
        // }
        // }
        int j = 0;
        int last = a.length - 1;
        for (int i = 0; i < last; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }

        }
        if (a[j] != a[last]) {
            a[j++] = a[last];
        }
        for (int i = 0; i < j; i++) {
            System.out.println(a[i]);
        }

    }
}
