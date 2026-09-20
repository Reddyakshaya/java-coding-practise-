public class prime {
    public static void main(String[]args){
        int n=76;
        boolean prime=true;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
    if(prime){
        System.out.print("prime number");
    }else{
        System.out.print("not a prime number");
    }
    }
}