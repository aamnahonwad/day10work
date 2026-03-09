public class MultiExceptions {
    public static void main(String[] args){
        try{
            int[] arr={1,2,3};
            int result=10/0;
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index does not exist");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
