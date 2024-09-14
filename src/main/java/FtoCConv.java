import java.util.Scanner;

public class FtoCConv {
    public static  void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        double f = sc.nextInt();
        double c = ( f-32)*(5.0/9.0);
        System.out.println(" Temp in Celsius "+c);
    }
}
