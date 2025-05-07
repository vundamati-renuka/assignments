package ThirdWeekAssignments;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Found a duplicate
            }
            seen.add(num);
        }

        return false; // All elements are distinct
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Output 1: " + containsDuplicate(nums1)); // true
        System.out.println("Output 2: " + containsDuplicate(nums2)); // false
        System.out.println("Output 3: " + containsDuplicate(nums3)); // true
    }
}

