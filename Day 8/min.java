public class min {
    
    public static void main(String[]args){
        int[] numbers={10,34,56,37,65,45};
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.print("Minimum:"+min);
    }
    
}
