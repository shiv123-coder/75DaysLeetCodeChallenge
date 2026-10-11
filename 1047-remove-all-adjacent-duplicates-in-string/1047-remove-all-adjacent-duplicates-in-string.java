class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(result.length()>0 && result.charAt(result.length()-1)==ch){
                result.deleteCharAt(result.length()-1);
            }
            else{
                result.append(ch);
            }
        }
        if(result.length()==0){
            return "";
        }
        return result.toString();
    }
}