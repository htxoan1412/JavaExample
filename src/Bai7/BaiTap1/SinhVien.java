package Bai7.BaiTap1;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private Double diem;


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public SinhVien() {
    }

    public SinhVien(String hoTen, Double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        diem = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Họ tên :" + hoTen + "\n Điểm:" + diem);
    }

    public void tim() {
        Scanner sc = new Scanner(System.in);
        Double d = Double.parseDouble(sc.nextLine());
        if (d == diem) {
            System.out.println("Họ tên :" + hoTen + "\n Điểm:" + diem);
        }
    }

}


