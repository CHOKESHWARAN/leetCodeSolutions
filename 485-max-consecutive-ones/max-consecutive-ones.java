class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0;
        int l=nums.length;
        int max=0;
        for(int i=0;i<l;i++){
            if(nums[i]==1){
                n+=1;
            
          if(max<n){
                    max=n;
                }}
            else{
                n=0;}
            }
        
        return max;
        
    }
}