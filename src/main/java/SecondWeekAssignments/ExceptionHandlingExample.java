package SecondWeekAssignments;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]);  // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }


        try {
            String invalidNumber = "abc";
            int parsedNumber = Integer.parseInt(invalidNumber);  // invalid integer
            System.out.println("Parsed number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

