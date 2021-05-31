package Lab4.Model;

public class SanPhamModel {
    private String tenSp;
    private Double donGia;
    private Double giamGia;

    public SanPhamModel(){

    }

//    ctrl + n .. để tạo getter và setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }

//    tao constructor
    public SanPhamModel(String tenSp, Double donGia, Double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    @Override
    public String toString() {
        return "tenSp='" + tenSp + '\'' +
                ", donGia=" + donGia +
                ", giamGia=" + giamGia;
    }
}
