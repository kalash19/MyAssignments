import java.util.Scanner;

public class SiCi {
    public double simpleInterest(double principalAmount, int time, double interestRate) {
        double interest = (principalAmount * time * interestRate) / 100;
        return interest;
    }

    public double compoundInterest(double principalAmount, int time, double interestRate) {
        double amount = principalAmount * Math.pow((1 + interestRate / 100), time);
        double interest = amount - principalAmount;
        return interest;
    }
}

     class Assignment1Q3 {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            double principalAmount = sc.nextDouble();
            int time = sc.nextInt();
            double interestRate = sc.nextDouble();

            SiCi obj = new SiCi();

            // Calculate and print simple interest
            double simpleInterest = obj.simpleInterest(principalAmount, time, interestRate);
            System.out.println("Simple Interest: " + simpleInterest);

            // Calculate and print compound interest
            double compoundInterest = obj.compoundInterest(principalAmount, time, interestRate);
            System.out.println("Compound Interest: " + compoundInterest);
        }
    }


