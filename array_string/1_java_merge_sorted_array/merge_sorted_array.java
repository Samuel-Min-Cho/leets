public class merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and the end of merged array
        int indexm = m - 1;          // Last valid element in nums1
        int indexn = n - 1;          // Last element in nums2
        int mergeIndex = m + n - 1;  // Last index in nums1 (total length)

        // Merge from the end to avoid overwriting nums1 elements
        // big -> small
        while (indexm >= 0 && indexn >= 0) {
            if (nums1[indexm] > nums2[indexn]) {
                nums1[mergeIndex] = nums1[indexm];
                indexm--;
            } else {
                nums1[mergeIndex] = nums2[indexn];
                indexn--;
            }
            mergeIndex--;
        }

        // Copy any remaining elements from nums2
        while (indexn >= 0) {
            nums1[mergeIndex] = nums2[indexn];
            indexn--;
            mergeIndex--;
        }

        for (int i = 0 ; i < m + n ; i ++ ){
            System.out.print(nums1[i] + " ");
        }

        System.out.print("\n");
    }

    public static void main (String argc[]){
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        merge (num1, 3, num2, 3);

        int[] num1b = {1};
        int[] num2b = {};
        merge (num1b, 1, num2b, 0);

        int[] num1c = {0};
        int[] num2c = {1};
        merge (num1c, 0, num2c, 1);
    }
}
