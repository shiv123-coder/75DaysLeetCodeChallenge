class Solution {
    public double average(int[] salary) {
        int max=salary[0],min=salary[0];
        int total=0;
        for(int num:salary){
            total+=num;
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        double sum=total-max-min;
        double avg=sum/(salary.length-2);
        return avg;
    }
}