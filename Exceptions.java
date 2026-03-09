public class Exceptions{
    public static void main(String[] args){

        try{
            int[] arr={10,20,30};
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}