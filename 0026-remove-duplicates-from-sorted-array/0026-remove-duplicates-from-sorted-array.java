import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>(); 

        for (int n : nums) {
            set.add(n);
        }

        int i = 0;
        for (int n : set) {
            nums[i++] = n;
        }

        return set.size();
    }
}