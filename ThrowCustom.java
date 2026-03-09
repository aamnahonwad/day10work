public class ThrowCustom{
    public static void main(String[] args){

        try{
           throw new ArithmeticException("Access Denied");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("The try catch is finished");
        }
    }
}
