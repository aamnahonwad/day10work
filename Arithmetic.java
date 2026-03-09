import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the numerator");
        int numerator = sc.nextInt();

        System.out.println("Enter the denominator");
        int denominator = sc.nextInt();

        try{
            int result = numerator/denominator;
            System.out.println("The result after dividing both the numbers is :" + result);
        }
        catch(ArithmeticException e){
             System.out.println("Cannot divide by zero.");
        }
        sc.close();
    }
}
