import java.util.Scanner;

public class PrimeNumber {
    /**
     there are 2 partions
     sortedpartion
     unsorted partions
     **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether its prime or not");
        int a = sc.nextInt();
        boolean prime = false;
        if(a==1){
            System.out.println("1 is neither prime nor composite");
            return;
        }else {
            for(int i = 2; i<= a ;i++){
                if(a%i==0&& i == a){
                    prime = true;
                }
            }
        }
        if(prime){
            System.out.println("Its prime");
        }else{
            System.out.println("not prime");
        }
    }
}