public class MinDigit {
    public static void main(String[]args){
        int n=12345;
        int min=9;
        while(n>0){
            int digit=n%10;
            if(digit<min){
                min=digit;
                
            }
           n=n/10;
        } System.out.print(min);

    }
    
}
