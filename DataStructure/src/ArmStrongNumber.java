import java.util.Arrays;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number to check whether its Armstrong number or not");
        int a = sc.nextInt();
        boolean isArmStrong = isArmStrong(a);
        if (isArmStrong)
            System.out.println("Given number is Armstrong Number");
        else
            System.out.println("Given Number is not a Armstrong Number");
    }

    static boolean isArmStrong(int num) {
        int givenNumber = num;
        int total = 0;
        while (num > 0) {
            int a = num % 10;
            total = total + (a * a * a);
            num = num / 10;
        }
        return total == givenNumber;
    }
}
