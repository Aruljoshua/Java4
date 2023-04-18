import java.util.Scanner;

public class MinJump {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of elements in an array");
            int n = sc.nextInt();
            System.out.println("enter the elements intp an array");
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int res = 0; // number of minimum jumps
            int r = 0; // right pointer
            int l = 0; // left pointer
            while (r < a.length - 1) {
                int farthest = 0;
                for (int i = l; i < r + 1; i++) {
                    farthest = Integer.max(farthest, i + a[i]);

                }
                l = r + 1;
                r = farthest;
                res += 1;
            }
            System.out.println("the total number of minimum number of jumps : " + res);
        }
    }
}
