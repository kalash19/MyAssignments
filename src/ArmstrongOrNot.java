import java.util.Scanner;

public class ArmstrongOrNot {

    public boolean armstrongCheck(int num) {
        int originalNum = num;
        int sum = 0;

        // Calculate the number of digits in the input number
        int numDigits = String.valueOf(num).length();

        // Calculate the sum of the cubes of each digit
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}

class Assignment1Q1 {
    public static void main(String[] args) {
        ArmstrongOrNot obj = new ArmstrongOrNot();

        // Test the armstrongCheck method
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isArmstrong = obj.armstrongCheck(number);
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}


