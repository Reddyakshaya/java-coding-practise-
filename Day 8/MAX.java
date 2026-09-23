public class MAX {
    public static void main(String[]args){
        int[] numbers={10,34,56,37,65,45};
        int max=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.print("Maximum:"+max);
    }
}
