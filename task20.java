public class task20 {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reverse);
    }
}
