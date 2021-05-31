package Lab4.Action;

import Lab4.Model.SanPhamModel;

import java.util.Scanner;

public class SanPhamAction {
    public SanPhamModel inputData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tên sản phẩm:");
        String tenSanPham = sc.nextLine();
        System.out.println("Đơn giá:");
        Double donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Giảm giá:");
        Double giamGia = Double.parseDouble(sc.nextLine());

        SanPhamModel sanPhamAction = new SanPhamModel(tenSanPham,donGia,giamGia);
        return sanPhamAction;
    }

    public Double thueNhapVao(SanPhamModel sanPhamModel){
        return sanPhamModel.getDonGia()*0.1;
    }

    public void output(){
        SanPhamModel sanPhamModel = inputData();
        Double thue = thueNhapVao(sanPhamModel);
        System.out.println(sanPhamModel.toString() + " thueNhapVao="+ thue);
    }
}
