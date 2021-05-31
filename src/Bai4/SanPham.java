package Bai4;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSp='" + tenSp + '\'' +
                ", donGia=" + donGia +
                ", giamGia=" + giamGia +
                '}';
    }

    public void xuat() {
        System.out.println(toString() + "  Thuế nhập khẩu : " + getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Tên sản phẩm : ");
        tenSp = scanner.nextLine();
        System.out.printf("Đơn giá : ");
        donGia = scanner.nextDouble();
        System.out.printf("Giảm giá: ");
        giamGia = scanner.nextDouble();
    }
}
