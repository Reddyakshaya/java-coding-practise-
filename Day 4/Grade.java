public class Grade {
    public static void main(String[]args){
        int marks=85;
        if(marks<=100 && marks>=90){
            System.out.print("A");
        }else if(marks<90 && marks>=80){
            System.out.print("B");
        }else if(marks <80 && marks >=70){
            System.out.print("C");
        }else if(marks <70 && marks >=60){
            System.out.print("D");
        }else if(marks <60 && marks >=50){
            System.out.print("E");
        }else{
            System.out.print("Invalid marks");
        }
    }
    
}
