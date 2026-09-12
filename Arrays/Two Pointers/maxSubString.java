import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart=0, windowEnd=0;
        int n=s.length();
        HashSet<Character> set= new HashSet<>();
        int maxLength=Integer.MIN_VALUE;
        while(windowEnd<n){
            char ch =s.charAt(windowEnd);
            if(set.contains(ch)){
                while(windowStart<windowEnd && set.contains(ch)){
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            } 
            set.add(ch);
            maxLength=Math.max(maxLength,(windowEnd-windowStart+1));
            windowEnd++;
        }
        return (maxLength==Integer.MIN_VALUE)?0:maxLength;
    }
}


//approach 2
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int windowStart=0, windowEnd=0;
        int n=s.length();
        HashMap<Character,Integer> set= new HashMap<>();
        int maxLength=Integer.MIN_VALUE;
        while(windowEnd<n){
            char ch =s.charAt(windowEnd);
            if(set.containsKey(ch)&& set.get(ch)>=windowStart){
              windowStart=set.get(ch)+1;
            } 
            set.put(ch,windowEnd);
            maxLength=Math.max(maxLength,(windowEnd-windowStart+1));
            windowEnd++;
        }
        return (maxLength==Integer.MIN_VALUE)?0:maxLength;
    }
}