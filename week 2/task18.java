public class task18 {
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;
        int temp = number;
        
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        
        System.out.println("Number of digits in " + number + " is " + count);
    }
}
