package Bai6;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập họ và tên : ");
        String hoTen = sc.nextLine();
        int i = hoTen.indexOf(" ");
        String ho = hoTen.substring(0, i);
        ho = ho.toUpperCase();
        System.out.println("Họ : " + ho);
        int j = hoTen.lastIndexOf(" ");
        String ten = hoTen.substring(j);
        ten = ten.toUpperCase();
        System.out.println("Tên :" + ten);
        String tenDem = hoTen.substring(i, j);
        System.out.println("Tên đệm:" + tenDem);
    }
}
