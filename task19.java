public class task19 {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;
        int digits = 3;
        
        while (number > 0) {
            int digit = number % 10;
            int power = 1;
            
            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }
            
            sum = sum + power;
            number = number / 10;
        }
        
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
