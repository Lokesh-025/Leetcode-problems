class Solution {
    public int maxSubArray(int[] nums) {
       int a=nums[0];
       int b=nums[0];
       for(int i=1;i<nums.length;i++)
       {
          b=Math.max(nums[i],b+nums[i]);
          if(b>a)
          {
            a=b;
          }
       }
       return a;
        
    }
}