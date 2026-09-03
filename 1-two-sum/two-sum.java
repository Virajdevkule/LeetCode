class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans [] = new int [2];
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int ft = nums[i];
            int sec = target - ft ;
            if (m.containsKey(sec)) {
                ans[0] = i;
                ans[1] = m.get(sec);
                
            }
            m.put(ft , i ) ; 
        }

        return ans ; 
    }
}