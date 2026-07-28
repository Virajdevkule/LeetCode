class Solution {
    public int maxProduct(int[] nums) {
        
        for ( int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length-1-i ; j++){
                if (nums[j] > nums[j+1] ){
                    
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp ;
                }
            }
            
        }
        int max = (nums[nums.length-1]-1 )*( nums[nums.length - 2]-1);
        return max ;
        
        
    }
}