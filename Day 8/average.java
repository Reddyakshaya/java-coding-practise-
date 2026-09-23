public class average {
    public static void main(String[]args){
        int [] number={12,32,45,64,67,54};
        int sum=0;
        for (int i=0;i<number.length;i++){
            sum=sum+number[i];

        }
        double Average=(double)sum/number.length;
        System.out.print("Average:"+Average);
    }
    
}
