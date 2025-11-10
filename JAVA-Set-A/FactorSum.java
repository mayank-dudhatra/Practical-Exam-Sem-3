import java.util.Scanner;

class FactorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.print("Factors: ");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum = " + sum);
    }
}