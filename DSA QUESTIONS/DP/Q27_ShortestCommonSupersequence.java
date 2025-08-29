package DP;

public class Q27_ShortestCommonSupersequence {
  String printlcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        String lcs = "";
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs += s1.charAt(i - 1);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1])
                i--;
            else
                j--;
        }
        StringBuilder sb = new StringBuilder(lcs);
        lcs = sb.reverse().toString();
        return lcs;
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        String lcs = printlcs(str1, str2);
        int i = 0, j = 0, k = 0;
        String ans = "";
        while (i < m && j < n && k < lcs.length()) {
            while (i < m && str1.charAt(i) != lcs.charAt(k)) {
                ans += str1.charAt(i);
                i++;
            }
            while (j < n && str2.charAt(j) != lcs.charAt(k)) {
                ans += str2.charAt(j);
                j++;
            }
            ans += str1.charAt(i);
            i++; j++; k++;
        }
        while (i < m) ans += str1.charAt(i++);
        while (j < n) ans += str2.charAt(j++);
        return ans;
    }
}
