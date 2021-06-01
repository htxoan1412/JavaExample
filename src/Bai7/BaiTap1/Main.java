package Bai7.BaiTap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien>list = new ArrayList<SinhVien>() ;
        for(int i= 0;i<3;i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
        for (SinhVien x: list){
            x.xuat();
        }
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhập điểm cần tìm :");
        Double diemCanTim = sc.nextDouble();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getDiem().equals(diemCanTim)){
                list.get(i).xuat();
            }
        }
    }

}
