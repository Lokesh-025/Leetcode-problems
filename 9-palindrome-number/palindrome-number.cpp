class Solution {
public:
    bool isPalindrome(int x) {
       if(x<0)
       return false;
       int a1=x;
       long long sum=0;
       while(x>0)
       {
        int a=x%10;
        sum=(sum*10)+a;
        x=x/10;
       }
       if(sum==a1)
       {
        return true;
       }
    
    return false;}
};
