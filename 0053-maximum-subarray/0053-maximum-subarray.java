class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE ;
        int currSum =  0; 
        for(int st = 0 ; st < nums.length ; st++){
            currSum = currSum + nums[st];
            maxSum = Math.max(maxSum,currSum);   
                
            if(currSum < 0 ){
                currSum = 0 ;
            }         
                
        }
        
        return maxSum;


        
    }
}