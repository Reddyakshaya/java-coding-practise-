public class MaxNumber {
    public static void main(String[]args){
        int n=123457;
        int max=0;
        while(n>0){
            int digit=n%10;
            if(digit>max){
                max=digit;
                 System.out.print(max);
            }
                n=n/10;

        }

    }
    
}
