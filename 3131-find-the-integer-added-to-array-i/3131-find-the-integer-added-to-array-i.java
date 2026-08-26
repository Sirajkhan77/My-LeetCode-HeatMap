class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i: nums2){
            if (i>=max) max=i; 
        }
        for (int i: nums1){
            if (i>=max2) max2=i;
        }
        return max-max2;

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // return nums2[nums2.length-1]-nums1[nums2.length-1];
    }
}