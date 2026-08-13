class Solution {
    public int climbStairs(int n, int[] costs) 
    {
        int a=0;
        int b=0;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            int cost=costs[i-1];
            int d=a+cost+1;
            if(i>=2)
            {
                d=Math.min(d,b+cost+4);
            }
            if(i>=3)
                {
                    d=Math.min(d,c+cost+9);
                }
              c=b;
              b=a;
              a=d;
        }
      return a;
    }
}