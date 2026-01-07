class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int d=0;
        int a=nums1.length;
        int b=nums2.length;
        int c[]=new int[a+b];
        for(int i=0;i<a;i++)
        {
            c[d]=nums1[i];
            d++;
        }
        for(int j=0;j<b;j++)
        {
            c[d]=nums2[j];
            d++;
        }
        Arrays.sort(c);
        int mid=c.length/2;
        if(c.length%2==0)
        {
            
            double sum=c[mid]+c[mid-1];
            return sum/2.0;


        }
        else
        {
        return (double)c [mid];
        }

       
        
    }
}