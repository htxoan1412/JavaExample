package Bai2;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soDien;
        soDien = sc.nextFloat();
    }
    public static void tinhTienDien(float soDien)
    {   float soTien;
        if(soDien<=50) {
            soTien =soDien*1000;
        }
        else soTien = 50*1000+(soDien-50)*1200;
        System.out.printf("Số tiền điện :"+soTien);
    }
}
