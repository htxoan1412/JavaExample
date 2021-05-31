package Bai7.Lab1;

import java.util.Scanner;

public class HinhVuong extends ChuNhat {
    Double canh;

    public Double getCanh() {
        return canh;
    }

    public void setCanh(Double canh) {
        this.canh = canh;
    }

    public HinhVuong() {
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + super.dai +
                '}';
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.dai = super.rong = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.println(toString() + "  " + getDienTich());
    }
}
