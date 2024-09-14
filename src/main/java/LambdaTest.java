import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaTest {


    interface FunctionsOdd{
        boolean isOdd(int i);

    }

    interface FunctionsPrime{
        boolean isPrime(int i);
    }

    interface FunctionsPalindrome{
        boolean isPalindrom(int i);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        FunctionsOdd odd = (int i) -> i%2!=0?true:false;

        FunctionsPrime prime = (int n) -> {  if (n <= 1)
            return false;

            // Check from 2 to n-1
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;

            return true;};

        FunctionsPalindrome pali = (int i)->{
            int reversed_n = 0;
            int n=i;
            while (n > 0) {
                reversed_n = reversed_n * 10 + n % 10;
                n = n / 10;
            }
            if(i==reversed_n)
                return true;
            else
                return false;
        };
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n=0;

        while(n<i){
            int j = sc.nextInt();

            int k = sc.nextInt();

            switch(j){
                case 1:
                    System.out.println(odd.isOdd(k)?"ODD":"EVEN");
                    break;
                case 2:
                    System.out.println(prime.isPrime(k)?"PRIME":"COMPOSITE");
                    break;
                case 3:
                    System.out.println(pali.isPalindrom(k)?"PALINDROME":"NOT PALINDROME");
                    break;
                default:
                    System.out.println("Doesn't Match");
                    break;
            }

            n++;
        }

        sc.close();

    }
}
