package Bai5.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoThuc {
    ArrayList<Double> list = new ArrayList<Double>();

    public static void main(String[] args) {
        DanhSachSoThuc d = new DanhSachSoThuc();
        d.nhap();
        d.xuat();
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (true)
        {
            Double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            System.out.print("Nhập thêm(Y/N)?");
            if(sc.nextLine().equals("N")){
                break;
            }

        }
    }
    public void xuat()
    {
        for (int i=0;i<list.size();i++)
        {
            Double x = list.get(i);
            System.out.print(" "+x);
        }
    }

}













