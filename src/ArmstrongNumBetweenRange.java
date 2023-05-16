public class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange(int min, int max) {
        int count = 0;
        int[] result;

        // Count the number of Armstrong numbers in the range
        for (int i = min; i <= max; i++) {
            if (isArmstrongNumber(i)) {
                count++;
            }
        }

        // Initialize the result array with the appropriate size
        result = new int[count];

        // Populate the result array with Armstrong numbers in the range
        int index = 0;
        for (int i = min; i <= max; i++) {
            if (isArmstrongNumber(i)) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }



        // Helper method to check if a number is an Armstrong number
        private boolean isArmstrongNumber(int num) {
            int originalNum = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, 3); // assuming 3-digit Armstrong numbers
                num /= 10;
            }

            return sum == originalNum;
        }
}

    class Assignment1Q2 {
        public static void main(String[] args) {
            int min = 100;
            int max = 999;

            ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
            int[] armstrongNumbers = obj.armstrongNumbersInRange(min, max);

            // Print the Armstrong numbers in the range
            System.out.println("Armstrong numbers between " + min + " and " + max + ":");
            for (int num : armstrongNumbers) {
                System.out.println(num);
            }
        }
    }


