public class Maximum {
    public static void main(String[]args){
    int arr[][]={{13,26,33},{45,54,56},{67,89,19}};
    int max=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
        System.out.print("Maximum:"+max);
    }
    
}
