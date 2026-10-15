class Solution {
    public int sumCounts(List<Integer> nums) {

        int count=0,res=0;

        for(int i=0;i<nums.size();i++){
         HashSet<Integer> result=new HashSet<>();
           for(int j=i;j<nums.size();j++){
                result.add(nums.get(j));
                count=result.size();
                res+=count*count;
            }
        }
        return res;
        
    }
}