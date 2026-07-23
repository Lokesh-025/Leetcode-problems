// class Solution {
//     public int numMatchingSubseq(String s, String[] words) {
//         int count=0;
//         for(String a:words)
//         {
//             int i=0;
//             int j=0;
//             while(i<s.length() && j<a.length())
//             {
//                 if(s.charAt(i)==a.charAt(j))
//                 {
//                     j++;
//                 }
//                 i++;
//             }
//             if(j==a.length())
//             {
//                 count++;
//             }
//         }
//         return count;
        
//     }
// }
class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        int count = 0;
        HashMap<String, Boolean> map = new HashMap<>();

        for (String a : words) {

            if (map.containsKey(a)) {
                if (map.get(a))
                    count++;
                continue;
            }

            int i = 0;
            int j = 0;

            while (i < s.length() && j < a.length()) {
                if (s.charAt(i) == a.charAt(j))
                    j++;
                i++;
            }

            boolean found = (j == a.length());
            map.put(a, found);

            if (found)
                count++;
        }

        return count;
    }
}