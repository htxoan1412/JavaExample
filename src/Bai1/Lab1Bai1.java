package Bai1;

import java.util.Scanner;
public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Điểm trung bình : ");
        Double diemTB = Double.parseDouble(scanner.nextLine());
//        Double diemTB = scanner.nextDouble();
//        scanner.nextLine();
        System.out.print("Họ và tên : ");
        String hoTen = scanner.nextLine();
        System.out.printf("%s %f điểm ",hoTen,diemTB);

    }
}
