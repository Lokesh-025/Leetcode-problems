class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int d=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]==0&&d<n)
            {
                nums1[i]=nums2[d];
                d++;
            }
        }
            Arrays.sort(nums1);
        


        
    }
}