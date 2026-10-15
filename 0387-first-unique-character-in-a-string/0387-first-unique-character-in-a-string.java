class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character , Integer> result=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            result.put(ch,result.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(result.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}