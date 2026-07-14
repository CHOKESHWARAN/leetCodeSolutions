class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
       for(int j:nums){
        i^=j;
       }
       return i;
    }
}