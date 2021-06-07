package Bai5.Lab3;

import Assignment.NhanVienModel;

public class NhanVienTiepThi extends NhanVienModel {
    private double doanhSo;
    private double hueHong;

    public NhanVienTiepThi(String manv, String hoTen, double luong, double doanhSo, double hueHong) {
        super(manv, hoTen, luong, "tiep thi");
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
}
