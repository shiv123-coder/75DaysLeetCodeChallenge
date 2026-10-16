class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<s.length();j++){
            Character ch=s.charAt(j);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
        
    }
}