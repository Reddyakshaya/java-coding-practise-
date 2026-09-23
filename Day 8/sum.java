public class sum {
    public static void main(String[]args){
        int[] numbers={10,34,56,37,65,45};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.print("Sum:"+sum);
    }
    
}
