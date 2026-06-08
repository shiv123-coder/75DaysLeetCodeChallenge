class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] temp = new int[nums.length];
        int len = 0;

        for (int num : nums) {
            int left = 0;
            int right = len;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (temp[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            temp[left] = num;

            if (left == len) {
                len++;
            }
        }

        return len;
    }
}