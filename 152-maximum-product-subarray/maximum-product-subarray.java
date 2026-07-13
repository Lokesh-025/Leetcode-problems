class Solution {
    public int maxProduct(int[] nums) {
    int max=nums[0];
    int min=nums[0];
    int ans=max;
    int curr=nums[0];;
    for(int i=1;i<nums.length;i++)
    {
        int oldmax=max;
        int oldmin=min;
      
         curr=nums[i];
        max=Math.max(curr,Math.max(curr*oldmax,curr*oldmin));
        min=Math.min(curr,Math.min(curr*oldmax,curr*oldmin));
       
        ans=Math.max(max,ans);
        
    }
    return ans;
}
}