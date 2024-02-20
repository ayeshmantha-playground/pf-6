void main(){
    int[] nums = {10, 20, 30, 40, 50};

    for (int i = 0; i < nums.length; i++) {
        int x = nums[i];
        System.out.println(x);
    }

    // Only this can be converted into enhanced for loop

    for(int x : nums) System.out.println(x);
}