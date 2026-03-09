public class MultipleCatch{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            int result = 10 / 0; 
            System.out.println(numbers[5]); 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
    }
}