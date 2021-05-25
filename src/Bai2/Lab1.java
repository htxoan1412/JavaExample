package Bai2;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b= scanner.nextFloat();
        if(a==0) {
            if (b == 0) System.out.println("Phương trình có vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");

        }
        else
        {
            float n = -b/a;
            System.out.println(n);
        }




    }
}
