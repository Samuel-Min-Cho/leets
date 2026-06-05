class Solution {
    public boolean canJump(int[] nums) {
        int current = 0, end = nums.length - 1;
        Stack <Integer> tracer = new Stack<>();
        
        if (nums[0] == 0) return false;
        
        while (current < end){
            if (tracer.isEmpty()){  
                break;
            }else if (tracer.peek() == 0){
                tracer.pop();
                if (tracer.isEmpty()) break;
                Integer trace = tracer.pop();
                current = current - trace;
                tracer.push(trace - 1);
                current += tracer.peek();
            }else {
                tracer.push(nums[current]); 
                current = current + tracer.peek();
            }
        }
        if (current < end) return false; 
        return true; 
    }
}
