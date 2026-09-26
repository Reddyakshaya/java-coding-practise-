public class Palindrom {
     public static void main(String[]args){
        String str="level";
        String reverse="";
        for(int i=0;i<=str.length();i++){
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.print("Palindrom");
        }
        else{
             System.out.print("Not a Palindrom");
        }
    }
    
}
