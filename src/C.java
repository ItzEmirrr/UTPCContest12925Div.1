import java.util.Scanner;

public class C {
    public static int longestDragonDance(int n, int k, int[] heights) {
        int l = 0, maxLength = 0;

        for (int r = 0; r < n; r++) {
            if (r > 0 && Math.abs(heights[r] - heights[r - 1]) > k) {
                l = r;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(longestDragonDance(n, k, heights));
    }
}
