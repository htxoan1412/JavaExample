package Bai5.Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanPhamController {
    public SanPhamModel nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        String tenSp = sc.nextLine();
        System.out.println("Giá sản phẩm :");
        Double gia = Double.parseDouble(sc.nextLine());
        SanPhamModel sanpham = new SanPhamModel(tenSp, gia);
        return sanpham;
    }

    public void xuat(ArrayList<SanPhamModel> list) {
        for (SanPhamModel x : list) {
            System.out.println("Sản phẩm :" + x.getTenSp() + "  Giá:" + x.getGia());
        }
    }
    public  void sapxep(ArrayList<SanPhamModel> list){
        Collections.sort(list,(a,b)->(int)(b.getGia()-a.getGia()));
        System.out.println("Danh sachs sản phẩm sau khi sắp xếp");
        xuat(list);
    }
    public void timkiem(ArrayList<SanPhamModel> list){
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhập tên sản phẩm cần xóa :");
        String tenSp= sc.nextLine();
        SanPhamModel t = null;
        for(SanPhamModel sp : list){
            if(sp.getTenSp().equals(tenSp)){
                t = sp;
                break;
            }
        }
        if(t!= null){
            list.remove(t);
            System.out.println("Sản phẩm đã được xóa");
        }
        else {
            System.out.println("Sản phẩm không có trong danh sách");
        }
    }
    public void tinhGiaTB(ArrayList<SanPhamModel>list){
        double sum = 0;

        for(SanPhamModel sp:list){
            sum+=sp.getGia();
        }
        double giaTb=sum/list.size();
        System.out.println("giá trung bình của sản phẩm :"+giaTb);
    }

    public void menu() {
        ArrayList<SanPhamModel> list = new ArrayList<SanPhamModel>();
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("------------------");
            System.out.println("1.Nhập thông tin sản phẩm ");
            System.out.println("2.Xem thông tin sản phẩm");
            System.out.println("3.Sắp xêp sản phẩm them giá giảm dần");
            System.out.println("4. Tìm kiếm và xóa sản phẩm");
            System.out.println("5.Tính giá trung bình của sản phẩm");
            System.out.println("-----------------------");
            System.out.printf("Nhập lựa chọn :");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Nhập thông tin sản phẩm");
                    list.add(nhap());
                    break;
                case 2:
                    System.out.println("Xem thông tin sản phẩm");
                    xuat(list);
                    break;
                case 3:
                    sapxep(list);
                    break;
                case 4:
                    timkiem(list);
                    break;
                case 5:
                    tinhGiaTB(list);
                    break;
                default:
                    System.exit(0);
                    break;

            }

        }
    }
}
