import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int index,
                                  List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // valid combination found
            return;
        }
        if (target < 0 || index >= candidates.length) {
            return; // stop exploring this path
        }

        // Choose the current number
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        current.remove(current.size() - 1); // backtrack

        // Skip to next candidate
        backtrack(candidates, target, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println("Output 1: " + combinationSum(candidates1, target1));

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println("Output 2: " + combinationSum(candidates2, target2));

        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println("Output 3: " + combinationSum(candidates3, target3));
    }
}
