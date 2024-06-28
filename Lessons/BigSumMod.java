package Lessons;

import java.util.Scanner;

public class BigSumMod {
    public static int big_sum_mod_recursive(int a, int b, int M){
        if(b==1){
            return 1%M;
        }
        else if(b==2){
            return (1+a)%M;
        }
        
        int x = big_sum_mod_recursive((a*a)%M, b/2, M); // calculating the of the part with half the power, b
        x = (x*(1+a))%M; // calculating the full expression with even power (even b)
        if(b%2==1){ // checking if the power, b is odd
            x = (1+(a*x))%M; // calculating the full expression with power, b being odd
        }
        /* if(b%2==1){
            x = big_sum_mod_recursive(a, b-1, M);
            x = (1+(a*x))%M;
        }
        else{
            x = big_sum_mod_recursive((a*a)%M, b/2, M);
            x = x*(1+a)%M;
        } */

        return x;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, M;

        System.out.printf("Enter a: ");
        a = scanner.nextInt();
        
        System.out.printf("Enter b: ");
        b = scanner.nextInt();

        System.out.printf("Enter c: ");
        M = scanner.nextInt();

        scanner.close();

        int mod = big_sum_mod_recursive(a, b, M);
        System.out.println(mod);
    }
}
