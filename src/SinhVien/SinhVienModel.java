package SinhVien;

public class SinhVienModel {
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

    public SinhVienModel(String hoTen, Double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVienModel{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
}
