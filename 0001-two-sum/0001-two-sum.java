class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++) {
        int need=target-nums[i];

        if(map.containsKey(need)){
            int result[]=new int[2];
            result[0]=i;
            result[1]=map.get(need);
            return result;
        }
        map.put(nums[i],i);
       }
       return new int[]{-1,-1};
    }
}