package Bai7.BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class SvController {
    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    Scanner sc = new Scanner(System.in);
    String ten;
    Double diem;

    public void nhap() {
        for (int i = 0; i < 3; i++) {
            SinhVien sinhVien = new SinhVien();
            System.out.printf("Họ tên :");
            sinhVien.setHoTen(sc.nextLine());
            System.out.printf("Điểm :");
            sinhVien.setDiem(Double.parseDouble(sc.nextLine()));
            list.add(sinhVien);
        }
    }

    public void xuat() {
        for (SinhVien x : list) {
            System.out.println("Họ tên :" + x.getHoTen() + " Điểm :" + x.getDiem());
        }
    }
    public void timkiem() {
        System.out.printf("Nhập điểm cần tìm :");
        double d = Double.parseDouble(sc.nextLine());
        for (SinhVien x : list) {
            if (x.getDiem() == d) {
                System.out.println("Họ tên :" + x.getHoTen() + " Điểm :" + x.getDiem());
            }
        }
    }

    public void menu() {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------");
            System.out.println("1.Nhập thông tin sinh viên ");
            System.out.println("2.Xem thông tin sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo điểm");
            System.out.println("-----------------------");
            System.out.printf("Nhập lựa chọn :");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên");
                    nhap();
                    break;
                case 2:
                    System.out.println("Xem thông tin sinh viên");
                    xuat();
                    break;
                case 3:
                    System.out.println("Tìm kiếm sinh viên theo điểm");
                    timkiem();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
