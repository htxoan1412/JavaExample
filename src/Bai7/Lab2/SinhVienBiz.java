package Bai7.Lab2;

public class SinhVienBiz extends SinhVienPoLy {
    double diemMarketing;
    double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(String ten, String nganh, double diemMarketing, double diemSales) {
        super(ten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public Double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }

}
