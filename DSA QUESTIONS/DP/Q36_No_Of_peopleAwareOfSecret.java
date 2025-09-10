package DP;

import java.util.Arrays;

public class Q36_No_Of_peopleAwareOfSecret {
  // Global constant for modulo (to avoid integer overflow in large results)
  int MOD = 1_000_000_007;

  // Recursive function to calculate how many people first learn the secret on a
  // given 'day'
  int solve(int day, int delay, int forget, int dp[]) {
    // Base case: On day 1, exactly 1 person knows the secret
    if (day == 1)
      return 1;

    // If already computed, return from memoization array
    if (dp[day] != -1)
      return dp[day];

    long result = 0;

    // Iterate over all possible "previous days" when people could have shared the
    // secret
    // Condition: delay ≤ day - prev < forget
    // This translates to range: [day - forget + 1, day - delay]
    for (int i = day - forget + 1; i <= day - delay; i++) {
      if (i > 0) { // Only valid if the previous day index is positive
        // Add the number of people who first learned on 'i' (recursive call)
        result = (result + solve(i, delay, forget, dp)) % MOD;
      }
    }

    // Store the result in dp[] to avoid recomputation
    return dp[day] = (int) result;
  }

  // Main function to compute how many people still remember the secret on day 'n'
  public int peopleAwareOfSecret(int n, int delay, int forget) {
    // Memoization array, initialized to -1 (meaning not yet computed)
    int dp[] = new int[n + 1];
    Arrays.fill(dp, -1);

    long total = 0;

    // Only people who learned the secret in the last 'forget - 1' days
    // will still remember it on day 'n'
    for (int day = n - forget + 1; day <= n; day++) {
      if (day > 0) {
        total = (total + solve(day, delay, forget, dp)) % MOD;
      }
    }

    // Final answer modulo 1e9+7
    return (int) total;
  }

}
