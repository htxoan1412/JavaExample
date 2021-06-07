package Bai5.Lab3;

import Assignment.NhanVienModel;

public class TruongPhong extends NhanVienModel {
    private double luongTrachNhiem;

    public TruongPhong(String manv, String hoTen, double luong, double luongTrachNhiem) {
        super(manv, hoTen, luong, "Truong phong");
        this.luongTrachNhiem = luongTrachNhiem;
    }
}
