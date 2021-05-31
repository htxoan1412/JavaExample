package Bai5.Lab2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class DanhSachHoTen {
    public static void main(String[] args) {
        DanhSachHoTen ds = new DanhSachHoTen();
        ds.hienThiMenu();
    }
    private ArrayList<String> list =  new ArrayList<String>();
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ho ten:");
            String hoTen = sc.nextLine();

            if(hoTen.isEmpty()){
                break;
            }
            list.add(hoTen);
        }while (true);
    }
    public void hienthi ()
    {
        System.out.println("Danh sach ho ten :");
        for( String x:list)
        {
            System.out.println("Ho ten :"+x);
        }
    }
    public void  xuatNgauNhien()
    {
        Collections.shuffle(list);
        hienthi();
    }
    public void sapXep()
    {
        Collections.sort(list,(a,b)->a.compareTo(b));
        hienthi();
    }
    public  void timVaXoa()
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Nhao ho ten can tim va xoa");
        String hoten = s.nextLine();
        for(String item :list)
        {
            if(item.equals(hoten))
            {
                list.remove(item);
                break;
            }
        }
        hienthi();
    }
    public void  hienThiMenu() {
        for (; ; ) {
            Scanner s = new Scanner(System.in);
            System.out.println("------------------");
            System.out.println("Menu chuc nang cua chuong trinh");
            System.out.println("1.Nhap danh sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3.Sap xep danh sach");
            System.out.println("4.Hien thi ngau nhien danh sach");
            System.out.println("5.Tim hiem va xoa ho ten trong danh sach");
            System.out.println("6.Thoat chuong trinh");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    nhap();
                    break;
                case 2:
                    hienthi();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    xuatNgauNhien();
                    break;
                case 5:
                    timVaXoa();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
