import java.util.Scanner;
public class NumberException {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
       
        System.out.println("enter the value");

        try{
            String value=sc.nextLine();
            int num=Integer.parseInt(value);
            System.out.println(num);
         }
         catch(NumberFormatException e){
            System.out.println("Invalid number format");
         }
        
    }
}
