class Solution {
    public int rob(int[] nums) {
        int prev2 = 0; // max money till house i-2
        int prev1 = 0; // max money till house i-1

        for (int money : nums) {
            int robCurrent = prev2 + money;
            int skipCurrent = prev1;

            int current = Math.max(robCurrent, skipCurrent);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}