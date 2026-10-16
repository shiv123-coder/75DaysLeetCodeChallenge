class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();

        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch=(char) (ch+32);
            }
            result.append(ch);
        }
        return result.toString();
    }
}