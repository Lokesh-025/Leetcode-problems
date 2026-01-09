class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int a=0;
        int b=arr.length-1;
        while(a<b)
        {
            if(!Character.isLetter(arr[a]))
            {
                a++;
            }
            else if(!Character.isLetter(arr[b]))
            {
                b--;
            }
            else
            {
                char temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                a++;
                b--;
            }
        }
        return new String(arr);

        
    }
}