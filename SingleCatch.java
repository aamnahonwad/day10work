public class SingleCatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int result = 10 / 0;
            System.out.println(arr[5]); 
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
