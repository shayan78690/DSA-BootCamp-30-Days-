import java.util.Scanner;

public class Main {
    public static int countBraveSoldiers(int n) {
       int count = 0;
        for(int i = 1; i <= n; i++) {
            if(isPrime(i)) {
                count++;
            }
        } 
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);
    }



    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}