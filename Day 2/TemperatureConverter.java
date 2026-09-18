import java.util.Scanner;
public class TemperatureConverter {
       public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter celsius:");
        double celsius=sc.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println("fahrenheit:"+fahrenheit);
        double kelvin=celsius+273.15;
        System.out.print("kelvin:"+kelvin);

       }
    
}
