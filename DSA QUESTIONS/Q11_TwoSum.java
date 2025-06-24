import java.util.HashMap;

public class Q11_TwoSum {
  public int[] twoSum(int[] nums, int target) {
    // 1. Brute Force
    // Nested Loop -> TC = O(n^2)
    // SC = O(1)

    // 2. Using HashMap
    //   TC = O(n)
    //   SC = O(n)

    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[] = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int rem = target - nums[i];
      if (map.containsKey(rem)) {
        arr[0] = i;
        arr[1] = map.get(rem);
        break;
      } else
        map.put(nums[i], i);

    }

    return arr;
  }
}
