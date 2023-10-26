package Package;

public class Task3 {
    public static boolean hasZeroNeighbors(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {

                return true;
            }
        }

        return false;
    }
}
