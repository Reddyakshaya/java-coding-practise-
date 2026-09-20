public class Palindrom {
    public static void main(String[]args){
        int n=121;
        int x=n;
        int i=0;
        while(n>0){
            int digit=n%10;
            i=i*10+digit;
            n = n / 10;
        }
        if(x==i){
            System.out.print("Palindrom");
        }else{
            System.out.print("Not a Plindrom");
        }
    }
    
}
