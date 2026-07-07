class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h]){
                l=mid+1;
            }
            else{
                h=mid;
            }
            
            }return nums[l];
        }
}










//       int m=nums[0];
//        for(int i=0;i<nums.length;i++){
//         m=Math.min(m,nums[i]);
//        }
//        return m;
//     }
// }