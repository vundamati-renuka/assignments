package ThirdWeekAssignments;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > majorityCount) {
                return num;
            }
        }

        return -1; // This line won't be reached because a majority element is guaranteed
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element 1: " + findMajorityElement(nums1)); // Output: 3
        System.out.println("Majority Element 2: " + findMajorityElement(nums2)); // Output: 2
    }
}

