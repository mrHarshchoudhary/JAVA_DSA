package JAVA_basic;
import java.util.Arrays;

public class aggressivecows {
    
    public static boolean isPossible(int[] stalls, int k, int mid, int n) {
        int cowCount = 1;
        int lastPos = stalls[0];
        
        for (int i = 1; i < n; i++) {
            if (stalls[i] - lastPos >= mid) {
                cowCount++;
                if (cowCount == k) {
                    return true;
                }
                lastPos = stalls[i];
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int s = 0;
        int n = stalls.length;
        int e = stalls[n - 1];
        int ans = -1;
        int mid = s + (e - s) / 2;
        
        while (s <= e) {
            if (isPossible(stalls, k, mid, n)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
}
public static void main(String[] args) {
    int []stalls={1,2,4,8,9};
    int k=3;
    System.out.println("the answer is"+aggressiveCows(stalls, 3));
}

}
