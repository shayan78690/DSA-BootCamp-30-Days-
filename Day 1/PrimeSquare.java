import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = getNthPrimeSquare(n);
        System.out.print(ans);

    }

    public static int getNthPrimeSquare(int n) {
        int i = 0;
        int num = 2;
        while(true) {
            if(isPrime(num)) {
                i++;
                if(i == n) {
                    return num * num;
                }
            }
            num++;
        }
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