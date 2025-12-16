class Solution {
    public int addDigits(int num) {
        if(num<10)return num;
        int a=0;
        while(num>9){
            int b=num/10;
            int c=num%10;
            a=b+c;
            num=a;
        }
    return a;
    }
}