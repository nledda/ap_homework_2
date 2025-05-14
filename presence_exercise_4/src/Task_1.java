

public class Task_1 {
    public static void main(String[] args) {
        // Given arrays
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};

        // Task A: Count digits using primitive operations
        System.out.println("Task A - Count digits using primitives: " + countDigitsPrimitive(values));

        // Task B: Count digits using Character wrapper
        System.out.println("Task B - Count digits using Character wrapper: " + countDigitsWrapper(values));

        // Task C: Find maximum using primitives
        System.out.println("Task C - Maximum using primitives: " + findMaxPrimitive(nums));

        // Task D: Find maximum using Integer.compare
        System.out.println("Task D - Maximum using Integer.compare: " + findMaxCompare(nums));

        // Autoboxing and Unboxing examples
        autoboxingExample();
        unboxingExample();
    }

    // Task A: Count digits using primitive operations
    public static int countDigitsPrimitive(char[] values) {
        int count = 0;
        for (char c : values) {
            // A digit in ASCII is between '0' (48) and '9' (57)
            if (c >= '0' && c <= '9'){
                //if (c >= 48 && c <= 57) {
                count++;
            }
        }
        return count;
    }

    // Task B: Count digits using Character wrapper
    public static int countDigitsWrapper(char[] values) {
        int count = 0;
        for (char c : values) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    // Task C: Find maximum using primitives
    public static int findMaxPrimitive(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // Task D: Find maximum using Integer.compare
    public static int findMaxCompare(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Integer.compare(nums[i], max) > 0) {
                max = nums[i];
            }
        }
        return max;
    }

    // Example of autoboxing
    public static void autoboxingExample() {
        System.out.println("\nAutoboxing Example:");
        // Autoboxing: automatic conversion from primitive to wrapper
        Integer number = 42; // primitive int is automatically converted to Integer object

        // Using in collections (which require objects, not primitives)
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(number);
        numbers.add(10); // primitive int is autoboxed to Integer
        numbers.add(20);


        System.out.println("Autoboxed value: " + number);
        System.out.println("Collection with autoboxed values: " + numbers);
    }

    // Example of unboxing
    public static void unboxingExample() {
        System.out.println("\nUnboxing Example:");
        // Create Integer wrapper objects
        Integer wrappedValue = new Integer(100);

        // Unboxing: automatic conversion from wrapper to primitive
        int primitiveValue = wrappedValue; // Integer object is automatically converted to primitive int

        // Mathematical operations trigger unboxing
        Integer num1 = 50;
        Integer num2 = 25;
        int result = num1 + num2; // Both Integer objects are unboxed before addition

        System.out.println("Unboxed value: " + primitiveValue);
        System.out.println("Result after unboxing: " + result);
    }
}