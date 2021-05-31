package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    public static void main(String[] args) {
        ArrayList<SanPham> listSp = new ArrayList<SanPham>();

        for (int i = 0; i < 3; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            listSp.add(sp);
        }
        for (SanPham x : listSp) {
            x.xuat();
        }
    }

    String tenSp;
    Double donGia;
    String hangSp;
    ArrayList<SanPham> listSp = new ArrayList<SanPham>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tên sản phẩm:");
        tenSp = sc.nextLine();
        System.out.printf("Nhập giá sản phẩm:");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.printf("Nhập hãng sản phẩm:");
        hangSp = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("Tên sản phẩm :" + tenSp + "\n Giá sản phẩm :" + donGia + "\n Hãng sản phẩm :" + hangSp + "\n");
    }
}
