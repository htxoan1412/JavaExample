package Bai2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        giaiPTBacHai(a,b,c);

    }
    public static void giaiPTBacNhat(float a,float b)
    {
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
    public static void giaiPTBacHai(float a,float b, float c){
        if(a==0) giaiPTBacNhat(b,c);
        else {
            float d = (float)Math.pow(b,2)-4*a*c;
            if(d<0) System.out.println("Phương trình vô nghiệm");
            else  if(d==0)
            {
                float x =-b/(2*a);
                System.out.printf("Phương trình có 1 nghiệm kép: "+x);
            }
            else {

                float x1 = (-b+(float)Math.sqrt(d))/(2*a);
                float x2 =(-b-(float) Math.sqrt(d))/(2*a);
                System.out.printf("Phương trình có 2 nghiệm "+x1 +"và"+x2);
            }


        }
    }
}
