class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=digitsum(nums[i]);
            arr[i][2]=i;
        }

        Arrays.sort(arr,(a,b) -> {
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });

        boolean visited[]=new boolean[n];
        int swaps=0;

        for(int i=0;i<n;i++){
            if(visited[i] || arr[i][2]==i){
                continue;
            }

            int j=i;
            int count=0;
            while(!visited[j]){
                visited[j]=true;
                j=arr[j][2];
                count++;
            }
            swaps+=count-1;
        }
        return swaps;

    }

        public int digitsum(int num){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            return sum;
        }

}