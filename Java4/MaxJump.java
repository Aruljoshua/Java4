import java.util.Scanner;

public class MaxJump {
    public static void main(String[] args) {
        int step = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of elements in an array");
            int n = sc.nextInt();
            System.out.println("enter the elements intp an array");
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int goal = a.length - 1;
            for (int i = n - 1; i > 0; i--) {
                if (i + a[i] >= goal) {
                    step++;
                    goal = i;
                }
            }
            if (goal == 0)
                System.out.println("true! can reach the destination and steps=" + step);
            else
                System.out.println("can't reach the destination");
        }
    }
}
