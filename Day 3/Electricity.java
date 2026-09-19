public class Electricity {
    public static void main(String[]args){
        int units=150;
        int bill;
        if(units<=100){
            bill=units*5;
        }else{
            bill=(100*5)+((units-100)*7);
            System.out.print(bill);
        }
        }
    }
    

