class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[]=new int[2*n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            result[a++]=nums[i];
            result[a++]=nums[i+n];
        }
        return result;
        
    }
}