public class NestedTryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            try {
                int result = 10 / 0; 
                System.out.println(numbers[5]); 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic Exception");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array Index Out Of Bounds Exception");
        }
    }
}
