public class Reversing {
    public static void main(String[]args){
        int number []={1,2,3,4,5};
        int left=0;
        int right=number.length-1;
        while(left<right){
            int temp=number[left];
            number[left]=number[right];
            number[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
    
}
