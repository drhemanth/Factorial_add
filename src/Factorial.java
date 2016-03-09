import java.util.Scanner;

/**
 * Created by  hemanth on 07/03/2016.
 */
public class Factorial {

    public static void main(String args[]){
        //Recursion factorial
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value : ");
        n = scanner.nextInt();

        System.out.println("Factorial addition of the number " + n + " is "+calcFactorial(n));
    }

    public static int calcFactorial(int n){

        if(n == 0)
        {
            return 0;
        }else
            return n + calcFactorial(n-1); //check the factorial here
    }
}
