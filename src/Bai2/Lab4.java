package Bai2;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        menu();

    }
    public static void menu ()
    {
        System.out.println("+_________________________________+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("Kết thúc chương trình");
        System.out.println("+_________________________________+");
        System.out.print("Chọn chức năng :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n)
        {
            case 1 :
            System.out.print("Nhập a : ");
            float a = sc.nextFloat();
            System.out.print("Nhập b : ");
            float b = sc.nextFloat();
            Lab2.giaiPTBacNhat(a,b);
            break;
            case 2 :
                System.out.print("Nhập a : ");
                 a = sc.nextFloat();
                System.out.print("Nhập b : ");
                 b = sc.nextFloat();
                System.out.print("Nhập c : ");
                 float c = sc.nextFloat();
                 Lab2.giaiPTBacHai(a,b,c);
                 break;
            case 3 :
                float soDien;
                System.out.print("Nhập số điện :");
                soDien = sc.nextFloat();
                Lab3.tinhTienDien(soDien);
                break;
            default:
                System.exit(0);


        }

    }

}
