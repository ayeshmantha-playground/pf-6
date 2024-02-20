void main(){
    int[] nums = {10, 20, 30, 40, 50};

    for (int i = 0; i < nums.length; i++) {
        int x = nums[i];
        System.out.println(x);
    }

    // Only this can be converted into enhanced for loop

    for (int i = 0; i < nums.length; i+=2) {
        int x = nums[i];
        System.out.println(x);
    }
    for (int i = nums.length - 1; i >= 0; i--) {
        int x = nums[i];
        System.out.println(x);
    }

    int[][] coordinates = {{1, 2}, {4, 2}, {8, 2}, {9, 2}};
}