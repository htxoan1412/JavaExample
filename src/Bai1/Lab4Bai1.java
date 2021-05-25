package Bai1;

import java.util.Scanner;

public class Lab4Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b =sc.nextDouble();
        Double c =sc.nextDouble();
        Double d = Math.pow(b,2)-4*a*c;
        System.out.printf("Delta : %f \n",d);
        System.out.printf("Căn delta : %f \n",Math.sqrt(d));


    }
}
