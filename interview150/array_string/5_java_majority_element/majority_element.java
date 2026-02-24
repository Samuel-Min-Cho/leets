// :!javac % && java %:r

public class majority_element {
    public static int majorityElement (int[] nums){
        int n = nums.length; int[] countNums = new int[n];
        for (int i = 0; i < n ; i++){
            int count = 0;
            for (int j = i+1 ; j < n ; j++){
                if (nums[i] == nums[j]){
                    count ++;
                }
            }
            countNums[i] = count;
        }
        int biggest = 0;
        for (int q = 0; q < n-1 ; q++){
            if (countNums[biggest] < countNums[q+1]){
                biggest = q+1;
            }
        }
       return nums[biggest];
    }
    public static void main (String[] args){
        int[] nums = {3, 2, 3};
        int[] nums2 ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums2));
    }

}

/*
   class Solution {

    static {
        for(int i=0; i<500; i++)
            majorityElement(new int[]{0});
    }
    public static int majorityElement(int[] nums) {

        int majority = 0, count = 0;
        for(int i : nums) {
            if(count == 0) {
                majority = i;
            }

            if(majority == i) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }
}
*/

