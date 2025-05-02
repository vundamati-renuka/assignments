package SecondWeekAssignments;

public class ArrayOperations {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // In case d > n
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }


        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int max = findMax(arr);
        System.out.println("\nMaximum number: " + max);

        rotateLeft(arr, d);
        System.out.println("Array after rotating left by " + d + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

