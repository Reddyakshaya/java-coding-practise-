public class SumofDigits {
    public static void main(String[]arhs){
        int n=12345;
        int sum=0;
        while(n==0){
            System.out.print("Invalid:");
        }
            while(n>0){
                int digit=n%10;
                sum=sum+digit;
                n=n/10;
            }System.out.print(sum);
            
        }
    }
    

