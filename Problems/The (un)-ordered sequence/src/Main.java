import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            boolean ascending = true;
            boolean descending = true;
            
            int number = sc.nextInt(); 
            int previousNumber = number;
           
            while (number != 0) {
            
               if (number > previousNumber) {
                   descending = false;
                   previousNumber = number;
                   
               } else if (number < previousNumber) {
                   ascending = false;
                   previousNumber = number;
               }
            number = sc.nextInt();
            
            } 
            System.out.println(ascending || descending);
            
        



    }
}
