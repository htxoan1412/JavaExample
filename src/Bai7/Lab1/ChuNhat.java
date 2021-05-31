package Bai7.Lab1;

import java.util.Scanner;

public class ChuNhat {
    Double rong;
    Double dai;

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public ChuNhat() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        dai = sc.nextDouble();
        rong = sc.nextDouble();
    }

    public double getDienTich() {
        return dai * rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public void xuat() {
        System.out.println(toString() + " Dien tich:" + getDienTich());
    }

    @Override
    public String toString() {
        return "ChuNhat{" +
                "rong=" + rong +
                ", dai=" + dai +
                '}';
    }
}









