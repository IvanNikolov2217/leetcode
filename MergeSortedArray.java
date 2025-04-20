public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c1 = 0;
        int c2 = 0;
        int[] nums3 = new int[m+n];

        while(c1 < m && c2 < n) {
            if(nums1[c1] <= nums2[c2]) {
                nums3[c1 + c2] = nums1[c1++];
            }
            else
                nums3[c1 + c2] = nums2[c2++];

        }

        while(c1 < m)
            nums3[c1 + c2] = nums1[c1++];

        while(c2 < n)
            nums3[c1 + c2] = nums2[c2++];

        for(int i = 0; i < m + n; i++)
            nums1[i] = nums3[i];

    }

}
