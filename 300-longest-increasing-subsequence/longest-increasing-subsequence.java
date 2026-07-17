class Solution {
    public int lengthOfLIS(int[] nums) {
        int a[]=new int[nums.length];
        Arrays.fill(a,1);
        int max=1;
        for(int i=1;i<nums.length;i++)
        {
        for(int j=0;j<i;j++)
        {
            if(nums[j]<nums[i])
            {
                a[i]=Math.max(a[i],a[j]+1);
            }
        }
        max=Math.max(max,a[i]);
        }
        return max;
        
    }
}