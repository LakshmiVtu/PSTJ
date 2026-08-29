import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] salary = new int[n];
            for(int i=0;i<n;i++){
                salary[i] = sc.nextInt();
            }
            String updatedSalary = Arrays.stream(salary)
                    .map(value -> (int) (value * 1.10))
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.println(updatedSalary);

            }
            sc.close();
        }
    }