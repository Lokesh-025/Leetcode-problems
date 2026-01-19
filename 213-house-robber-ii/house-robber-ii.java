class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }

        int x=find(nums,0,n-2);
        int y=find(nums,1,n-1);
        return Math.max(x,y);
    }
    int find(int num[],int start,int stop)
    {
        int cur=0;
        int prev=0;
        for(int i=start;i<=stop;i++)
        {

            int temp=cur;
            cur=Math.max(prev+num[i],cur);
            prev=temp;
        }
        return cur;
        }
    }
        
        
