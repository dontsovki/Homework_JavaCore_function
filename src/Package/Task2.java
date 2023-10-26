package Package;

public class Task2 {
    public static int findDifference(int[] nums) {
        if (nums.length <= 1) {
            return 0; // или другое значение по умолчанию
        }

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }
}
