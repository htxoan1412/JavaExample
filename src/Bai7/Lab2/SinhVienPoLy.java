package Bai7.Lab2;

import java.util.Scanner;

abstract public class SinhVienPoLy {
    String ten;
    String nganh;

    public SinhVienPoLy() {
    }

    public SinhVienPoLy(String ten, String nganh) {
        this.ten = ten;
        this.nganh = nganh;
    }

    abstract public Double getDiem();

    public String getHocLuc() {
        String hocLuc;
        Double diem = getDiem();
        if (diem < 5) hocLuc = "yếu";
        else if (diem >= 5 && diem < 6.5) hocLuc = "trung bình";
        else if (diem >= 6.5 && diem < 7.5) hocLuc = "khá";
        else if (diem >= 7.5 && diem < 9) hocLuc = "giỏi";
        else hocLuc = "xuất sắc";
        return hocLuc;
    }

    @Override
    public String toString() {
        return "SinhVienPoLy{" +
                "ten='" + ten + '\'' +
                ", nganh='" + nganh + '\'' +
                '}';
    }

    public void xuat() {
        System.out.println(toString() + " Học lực :" + getHocLuc());

    }

}
