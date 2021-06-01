package Bai5.Lab3;

import java.lang.ref.PhantomReference;

public class SanPhanModel {
    private String tenSp;
    private Double gia;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public SanPhanModel() {
    }

    public SanPhanModel(String tenSp, Double gia) {
        this.tenSp = tenSp;
        this.gia = gia;
    }


}
