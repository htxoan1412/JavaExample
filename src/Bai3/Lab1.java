package Bai3;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        boolean ok = true;
        if(a<2)
        {
            ok=false;
        }
            for (int i=2 ;i<=Math.sqrt(a);i++)
            {
                if(a%i==0)
                {
                    ok =false;
                    break;
                }
            }
            if(ok ==true) System.out.println(a+" là số nguyên tố");
            else System.out.println(a+" không phải là số nguyên tố");
        }


}
