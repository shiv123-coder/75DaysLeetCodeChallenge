class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxaltitude=0;
        for(int num:gain){
            altitude+=num;

            if(altitude>maxaltitude){
                maxaltitude=altitude;
            }
        }
        return maxaltitude;
    }
}