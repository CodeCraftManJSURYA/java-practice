import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scanner.nextInt();

        System.out.println("Number entered :"+ number);

        if(number > 1 && number < 999) {
            for(int i = 1; i <= number; i ++){
                if(number % i == 0){
                   count++;
                }
            }
        if(count == 2){
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
        }    
    }
    
}
