import java.util.Scanner;
public class Calculator {
    public static double add(double a,double b){
        System.out.print(a+b);
        return a+b;
    }
    public static double subtract(double a,double b){
        System.out.print(a-b);
        return a-b;
    }
    public static double multiply(double a,double b){
        System.out.print(a*b);
        return a*b;
    }
    public static double divide(double a,double b){
        System.out.print(a/b);
        return a/b;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter secondnumber: ");
        double num2 = scanner.nextDouble();
        double result;
        switch(operator){
            case '+':
                result=add(num1,num2);
                break;
            case '-':
                result=subtract(num1,num2);
                break;  
            case '*':
                result=multiply(num1,num2);
                break; 
            case '/':
                if(num2==0){
                    System.out.print("cant divideby zero");
                    scanner.close();
                    return;
                }
                result=divide(num1,num2);
                break;
            default:
                System.out.print("Invalid operator");
                return;

        }
        System.out.print("result:"+result);
    }
}
