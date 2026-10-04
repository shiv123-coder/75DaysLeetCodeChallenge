class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> lst=new HashSet<>();
        for(int num:nums){
            if(lst.contains(num)){
                return true;
            }
            lst.add(num);
        }
        return false;
    }
}