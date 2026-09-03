import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int ft = nums[i];
            int sec = target - ft;

            if (m.containsKey(sec)) {
                return new int[] {i, m.get(sec)};
            }

            m.put(ft, i);
        }

        return new int[] {};
    }
}