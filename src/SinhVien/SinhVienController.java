package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienController {
    public SinhVienModel nhap(){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Họ tên :");
        String ten = sc.nextLine();
        System.out.printf("Điểm :");
        Double diem = Double.parseDouble(sc.nextLine());

//       tạo contructor SinhVienModel(ten,diem) để lưu vào sinh viên
        SinhVienModel sinhVien = new SinhVienModel(ten,diem);
        return sinhVien;
    }

    public void xuat(ArrayList<SinhVienModel> list){
        list.stream().forEach(System.out::println);
    }

    public void timkiem(ArrayList<SinhVienModel> list) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập điểm cần tìm :");
        double d = Double.parseDouble(sc.nextLine());
        for (SinhVienModel x : list) {
            if (x.getDiem() == d) {
                System.out.println("Họ tên :" + x.getHoTen() + " Điểm :" + x.getDiem());
            }
        }
    }

    public void menu(){
        ArrayList<SinhVienModel> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("------------------");
            System.out.println("1.Nhập thông tin sinh viên ");
            System.out.println("2.Xem thông tin sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo điểm");
            System.out.println("-----------------------");
            System.out.printf("Nhập lựa chọn :");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên");
                    list.add(nhap());
                    break;
                case 2:
                    System.out.println("Xem thông tin sinh viên");
                    xuat(list);
                    break;
                case 3:
                    System.out.println("Tìm kiếm sinh viên theo điểm");
                    timkiem(list);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
