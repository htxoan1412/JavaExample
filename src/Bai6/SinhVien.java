package Bai6;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soCmnd;
        String email;
        String sdt;
        String reSdt = "0\\d{9,10}";
        String reCMND = "[0-9]{9}";
        String reEmail = "\\w+@\\w+\\.\\w+";
        do {
            System.out.printf("Nhập số CMND:");
            soCmnd = sc.nextLine();
        } while (!soCmnd.matches(reCMND));
        do {
            System.out.printf("Nhập Email:");
            email = sc.nextLine();
        } while (!email.matches(reEmail));
        do {
            System.out.printf("Nhập Sdt:");
            sdt = sc.nextLine();

        } while (!sdt.matches(reSdt));
        System.out.println("\nsdt:" + sdt + "\n Email:" + email + "\n Số CMND:" + soCmnd);
    }


}
