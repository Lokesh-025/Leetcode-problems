class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int a=text1.length();
        int b=text2.length();
        int arr[][]=new int[a+1][b+1];
        for(int i=a-1;i>=0;i--)
        {
            for(int j=b-1;j>=0;j--)
            {
                if(text1.charAt(i)==text2.charAt(j))
                {
                    arr[i][j]=1+arr[i+1][j+1];
                }
                else
                {
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j+1]);
                }
            }
        }
        return arr[0][0];
        
    }
}