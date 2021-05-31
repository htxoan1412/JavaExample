package Bai7.Lab2;

public class SinhVienIT extends SinhVienPoLy {
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT() {

    }

    public SinhVienIT(String ten, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(ten, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public Double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }


}
