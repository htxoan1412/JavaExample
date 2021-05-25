package Bai4;

import java.util.Scanner;

public class SanPham {
     String tenSp;
     double donGia;
     double giamGia;
     public  SanPham(String tenSp,double donGia,double giamGia){
         this.tenSp =tenSp;
         this.donGia = donGia;
         this.giamGia = giamGia;

     }
     public SanPham(String tenSp,double donGia){
         this.tenSp = tenSp;
         this.donGia = donGia;
         this.giamGia = 0;

     }
     private double getThueNhapKhau()
     {
         return  donGia*0.1;

     }
    public void xuat(){
         System.out.println("Tên : "+tenSp+"\nĐơn giá "+donGia+"\nGiam giá "+giamGia+"\nThuế nhập khẩu " +getThueNhapKhau());
     }
     public void nhap()
     {
         Scanner scanner = new Scanner(System.in);
         System.out.printf("Tên sản phẩm : ");
         tenSp = scanner.nextLine();
         System.out.printf("Đơn giá : ");
         donGia = scanner.nextDouble();
         System.out.printf("Giảm giá: ");
         giamGia = scanner.nextDouble();

     }


}
