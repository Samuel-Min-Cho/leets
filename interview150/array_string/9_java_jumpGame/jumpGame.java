import java.util.Stack;

class jumpGame {
  public static boolean canJump(int[] nums) {
    int current = 0, end = nums.length - 1;
    Stack<Integer> tracer = new Stack<>();

    if (nums[0] == 0 && current == end) return true;
    tracer.push(nums[0]);

    while (current < end) {
      System.out.println(current + " : " + tracer);
      if (tracer.isEmpty()) {
        break;
      } else if (tracer.peek() == 0) {
        tracer.pop();
        if (tracer.isEmpty()) break;
        Integer trace = tracer.pop();
        current = current - trace;
        tracer.push(trace - 1);
      } else {
        current = current + tracer.peek();
        if (current <= end) tracer.push(nums[current]);
      }
    }
    if (current < end) return false;
    return true;
  }

  public static void main(String argc[]) {
    /*
    // 1) true case
    int[] nums1 = {2, 3, 1, 1, 4};
    System.out.println("nums1:");
    System.out.println(canJump(nums1));
    // 2) false case
    int[] nums2 = {3, 2, 1, 0, 4};
    System.out.println("nums2:");
    System.out.println(canJump(nums2));
    // 3) true : current = final
    int[] nums3 = {0};
    System.out.println("nums3:");
    System.out.println(canJump(nums3));
    int[] nums4 = {0, 1};
    System.out.println("nums4:");
    System.out.println(canJump(nums4));
    */
    int[] nums5 = {
      2, 0, 6, 9, 8, 4, 5, 0, 8, 9, 1, 2, 9, 6, 8, 8, 0, 6, 3, 1, 2, 2, 1, 2, 6, 5, 3, 1, 2, 2, 6,
      4, 2, 4, 3, 0, 0, 0, 3, 8, 2, 4, 0, 1, 2, 0, 1, 4, 6, 5, 8, 0, 7, 9, 3, 4, 6, 6, 5, 8, 9, 3,
      4, 3, 7, 0, 4, 9, 0, 9, 8, 4, 3, 0, 7, 7, 1, 9, 1, 9, 4, 9, 0, 1, 9, 5, 7, 7, 1, 5, 8, 2, 8,
      2, 6, 8, 2, 2, 7, 5, 1, 7, 9, 6
    };
    System.out.println("nums5:");
    System.out.println(canJump(nums5));
  }
}
