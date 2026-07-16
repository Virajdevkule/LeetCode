class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        
        Arrays.sort(merged);
        
        int total = merged.length;
        int mid = total / 2;
        
        if (total % 2 == 1) {
            return merged[mid];
        } else {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
        
    }
}