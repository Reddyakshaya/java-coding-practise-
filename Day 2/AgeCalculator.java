import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter DOB:");
        int DOB =sc.nextInt();
        System.out.print("Enter current year:");
        int current =sc.nextInt();
        int age=current -DOB ;
        System.out.print("Your age is:"+age);


    }
    
}
