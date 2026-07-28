class Solution {
    public void rotate(int[] nums, int k) {
     List<Integer>a=new ArrayList<>();
     for(int num:nums)
     {
        a.add(num);
     }
     Collections.rotate(a,k);
     for(int i=0;i<nums.length;i++)
     {
        nums[i]=a.get(i);
     }

        
    }
}