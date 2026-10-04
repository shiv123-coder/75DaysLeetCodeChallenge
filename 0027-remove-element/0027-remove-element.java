class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        int i = 0;

        while (i < n) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
            i++;
        }

        return k;
    }
}