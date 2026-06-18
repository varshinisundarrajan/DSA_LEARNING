import java.util.*;

class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];

            if (L == 0) {
                ans.add(prefix[R]);
            } else {
                ans.add(prefix[R] - prefix[L - 1]);
            }
        }

        return ans;
    }
}