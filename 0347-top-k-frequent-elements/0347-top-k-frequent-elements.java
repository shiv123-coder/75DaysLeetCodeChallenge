import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); 
            }
        }

        int[] res = new int[k];
        int i = 0;
        for (int num : pq) {
            res[i++] = num;
        }

        return res;
    }
}