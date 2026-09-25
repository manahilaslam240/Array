class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        while(i<nums.length-1){
            if((nums[i]+nums[j])==target){
           return new int[]{i,j};
           }
            j++;
            // If j runs out of bounds, reset it and move i forward
            if (j == nums.length) {
                i++;
                j = i + 1; 
            }
        }
        
            return new int[]{};  
    }
}