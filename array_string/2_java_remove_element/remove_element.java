public class remove_element {
    public static void display(int[] nums){
                for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.print("\n");

    }
    //1) 41.8 mb
    // Move all following elements forward to overwrite val positoin.
    /*
    public static  int removeElement(int[] nums, int val) {
        int k = nums.length;
		int q, z;
		for (int i = 0; i < nums.length; i++) {
			q = i + 1;
			z = i;
			if (nums[i] == val) {
				while (q < nums.length) {
					nums[z] = nums[q];
					z++;
					q++;
				}
				nums[k - 1] = -1;
				k = k - 1;
                i --; // since the current i position gets overwritten, it need to run again.
			}
		}
        display(nums);
		return k;
    }
    */
    // 2) 43.4 mb

    public static int removeElement(int[] nums, int val){
        int k =0, z =0;
        for (int q = 0 ; q < nums.length ; q ++){
            if (nums[q] == val){
                k++;
                if (q == z || q == nums.length-1){
                nums[q] = -1;
                }
            }else{
                if (z != q){
                    nums[z] = nums[q];
                    nums[q] = -1;
                }
                z++;
            }
        }

        display(nums);
        return nums.length - k;
    }

    public static void main (String argc[]){
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println(removeElement(nums1, val1));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));

        display(nums2);
    }

}
