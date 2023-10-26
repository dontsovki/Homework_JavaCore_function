import Package.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {2, 1, 2, 3, 4, 8, 9, 3, 0};
        int[] nums2 = {2, 2, 0, 0, 2, 3, 8, 0, 0, 0};
        int[] nums3 = {1, 3, 5, 3, 33, 0, 333, 0};

        printResult(nums1, "Количество чётных элементов", Task1.countEvens(nums1));
        printResult(nums2, "Количество чётных элементов", Task1.countEvens(nums2));
        printResult(nums3, "Количество чётных элементов", Task1.countEvens(nums3));

        System.out.println();

        printResult(nums1, "Разница между мин. и макс.", Task2.findDifference(nums1));
        printResult(nums2, "Разница между мин. и макс.", Task2.findDifference(nums2));
        printResult(nums3, "Разница между мин. и макс.", Task2.findDifference(nums3));

        System.out.println();

        printResult(nums1, "Имеются ли два соседних элемента, с нулевым значением",
                Task3.hasZeroNeighbors(nums1));
        printResult(nums2, "Имеются ли два соседних элемента, с нулевым значением",
                Task3.hasZeroNeighbors(nums2));
        printResult(nums3, "Имеются ли два соседних элемента, с нулевым значением",
                Task3.hasZeroNeighbors(nums3));

    }

    public static void printResult(int[] nums, String label, Object result) {
        System.out.print(Arrays.toString(nums) + " ");
        System.out.println(label + ": " + result);
    }

}