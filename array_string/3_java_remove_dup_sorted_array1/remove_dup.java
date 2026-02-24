public class remove_dup{
    public static void display(int [] nums){
        for (int i : nums){
            System.out.print(i + " ");
        }
        /*
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        */
        System.out.println("");


    }
    // 652ms + 46.9mb
    // Too much writing when overwritting the dup position
    /*
    public static int removeDuplicates (int [] nums){
        int k = 1 , q =0;
        if (nums.length == 0){ // empty array
             return 0;
        }else{
            while (q + 1 < nums.length){
                if (nums[q+1]== -200){
                    break;
                }else if (nums[q] == nums[q+1]){
                    int z = q;
                    while (z+1 < nums.length){ // shifting forward to overwrite dup
                        nums[z] = nums[z+1];
                        z++;
                    }
                    nums[z] = -200;
                }else{
                    k++;
                    q++;
                }
            }
        }
        return k;
    }
    */
    // 2) 1ms + 43.82 mb
    // Using the additional array to track unique element
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int[] copy = new int[nums.length];
        copy[0] = nums[0];
        int q = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != copy[q]) {
                q++;
                copy[q] = nums[i];
                k++;
            }
        }
        // nums = copy; <-- Copying the address pointer only. Its value is not modified.
        // Thus, won't change the value in the main
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copy[i];
        }
        return k;
    }
    public static void main (String argc []){
        int[] nums = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        display(nums);
        System.out.println(removeDuplicates(nums2));
        display(nums2);
        int[] nums3 = {1,2};
        System.out.println(removeDuplicates(nums3));
        display(nums3);
    }
}
