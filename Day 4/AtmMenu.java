import java.util.Scanner;
public class AtmMenu {
    public  static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value:");
        int value=sc.nextInt();
        switch(value){
            case 1:
                System.out.print("Check Balance");
                break;
            case 2:
                System.out.print("Withdraw Money");
                break;
            case 3:
                System.out.print("Deposit Money");
                break;
            default:
                System.out.print("Invalid Option");
        }
        sc.close();
    }
    
}
