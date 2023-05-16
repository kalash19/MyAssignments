import java.util.Scanner;

public class resultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        if (subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60) {
            return "Passed";
        } else if ((subject1Marks > 60 && subject2Marks > 60) ||
                (subject2Marks > 60 && subject3Marks > 60) ||
                (subject1Marks > 60 && subject3Marks > 60)) {
            return "Promoted";
        } else if (subject1Marks > 60 || subject2Marks > 60 || subject3Marks > 60) {
            return "Failed";
        } else {
            return "Failed";
        }
    }
}

     class Assignment1Q4 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double subject1Marks = sc.nextDouble();
            double subject2Marks = sc.nextDouble();
            double subject3Marks = sc.nextDouble();

            resultDeclaration obj = new resultDeclaration();

            String result = obj.declareResults(subject1Marks, subject2Marks, subject3Marks);

            System.out.println("Result: " + result);
        }
    }


