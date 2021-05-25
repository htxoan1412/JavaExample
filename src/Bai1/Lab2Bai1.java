package Bai1;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều dài :");
        Double dai = sc.nextDouble();
        System.out.printf("Chiều rộng :");
        Double rong = sc.nextDouble();
        System.out.printf("Chu vi hình chữ nhật %f \n",(dai+rong)*2);

        System.out.printf("Dien tích hình chữ nhật %f \n", dai*rong);
        Double canhNhoNhat = Math.min(dai,rong);
        System.out.printf("Cạnh nhỏ nhất %f",canhNhoNhat);

    }
}
