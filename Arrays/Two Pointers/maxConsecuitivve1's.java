import java.util.*;
class Solution {
    public int longestOnes(int[] arr, int k) {
        int maxlength=0,length=0,left=0,right=0,zeros=0;

        while(right<arr.length){
            if(arr[right]==0)
            zeros++;
            while(zeros>k){
                if(arr[left]==0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=k){
                length=right-left+1;
                maxlength=Math.max(maxlength,length);
            }
            right++;
        }
        return maxlength;
    }
}