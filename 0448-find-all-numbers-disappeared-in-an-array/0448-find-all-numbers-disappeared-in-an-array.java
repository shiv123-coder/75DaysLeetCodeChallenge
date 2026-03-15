class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length + 1];
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            present[num] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}