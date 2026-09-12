//Leetcode 1423: Maximum Points You Can Obtain from Cards
public class Maxpoints {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,maxsum,rightidx=cardPoints.length-1;
        for(int i=0;i<k;i++)
        lsum=lsum+cardPoints[i];
        maxsum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rightidx];
            rightidx--;

            maxsum=Math.max(maxsum,(lsum+rsum));
        }
       return maxsum;
    }
}