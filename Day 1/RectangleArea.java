import java.util.Scanner;
public class RectangleArea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth:");
        double breadth=sc.nextDouble();
        double area=length*breadth;
        System.out.println("Area of rectangle is:"+area);


    }
}