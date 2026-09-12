//Maximum sum of subarray equal size K
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0||k==0){
            return 0;
        }
        int i=0,j=0,maxSum=Integer.MIN_VALUE; int sum=0;
        while(j<nums.length){
           
            sum=sum+nums[j];
            if(j-i+1 <k){
                j++;
            }else if(j-i+1==k){
                maxSum=Math.max(maxSum,sum);
                sum=sum-nums[i];
                i++;
                 j++;
            }
            
          
        }
        return maxSum;
    }
}