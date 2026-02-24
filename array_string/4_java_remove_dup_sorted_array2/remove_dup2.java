public class remove_dup2
{
    public static void display (int[] nums) {
        for (int i : nums){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    // 1) 147ms / 49.07mb
    public static int removeDuplicates(int[] nums){
        int k = 1; // counting unique elements
        int q = 0; // array index pointer
        int p = 0; // reapting/dup counter
        int flag = Integer.MIN_VALUE;
        if (nums.length ==0 ){
            return k;
        }else{
            while (q + 1 < nums.length){
                if (nums[q] > nums[q+1]){
                    System.out.println(nums[q]>nums[q+1]);
                    break;

                }else if (nums[q]!=nums[q+1]){
                    k++;
                    q++;
                    p = 0;
                }else { // nums[q] == nums [q+1]
                    p++;
                    if (p <= 1){
                        q++;
                        k++;
                    }else{ // p > 2: same value repeating more than twice
                        int z = q;
                        while (z+1 < nums.length){
                            nums[z] = nums[z+1];
                            z++;
                        }
                        nums[z] = flag;
                    }
                }
            }
        }
        return k;
    }
    /*
    // 2) 0ms
    public static int removeDuplicates(int[] nums) {
        int idx = 1;
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];
                cnt = 0;
            }
            else {
                cnt++;
                if (cnt < 2) nums[idx++] = nums[i];
            }
        }
        return idx;
    }
    */
    // 2) 44.3mb
    /*
    public static int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        // System.gc(); - for non-primitive like new __ objects
        return k;
    }
    */
    public static void main (String argc[]){
        int[] nums1 = {1,1,1,2,2,3};
        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums1));
        display(nums1);
        System.out.println(removeDuplicates(nums2));
        display(nums2);
        int[] nums3 = {0,0,0,0,0,0};
        System.out.println(removeDuplicates(nums3));
        display(nums3);
    }
}
