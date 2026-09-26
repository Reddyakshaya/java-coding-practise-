public class Revers{
    public static void main(String[]args){
        String str="Computer";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.print("reversing:"+reverse);
    }
}