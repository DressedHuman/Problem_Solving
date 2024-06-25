package Lessons;

import java.util.Scanner;

/**
 * BigMod
 */
public class BigMod {

    public static int bigMod(int a, int b, int M){
        if(b==0) return 1%M;
        int x = bigMod(a, b/2, M);
        x = (x*x)%M;
        if(b%2==1) x = (x*a)%M;
        return x;
    }

    public static void main(String[] args) {
        int a, b, M;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Enter a : ");
        a = scanner.nextInt();
        
        System.out.printf("Enter b : ");
        b = scanner.nextInt();
        
        System.out.printf("Enter M : ");
        M = scanner.nextInt();
        scanner.close();

        int x = bigMod(a, b, M);
        System.out.println(x);
    }
}