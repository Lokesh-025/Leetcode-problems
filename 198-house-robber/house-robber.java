class Solution {
    public int rob(int[] nums) {
        int sum=0;
        int prev=0;
        for(int a:nums)
        {
            int temp=sum;
            sum=Math.max(a+prev,sum);
            prev=temp;

        }
        return sum;
        
        
        
    }
}