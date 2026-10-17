class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }

        boolean vowels = false; 
        boolean consonants = false;

        for (char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch)!=-1){
                    vowels = true;
                }
                else{
                    consonants=true;
                }
            }
        }
        return vowels && consonants;

    }
}