package Bai7.Lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SinhVienPoLy sv = new SinhVienBiz();
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Xuất thông tin sinh viên");
            System.out.println("3.Xuất danh sách sinh viên đạt học lực giỏi");
            System.out.println("4.Sắp xếp sinh viên theo điểm");
            System.out.println("5.thoát khỏi chương trình");
            System.out.println("Nhập số nguyên :");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    nhapDanhSachSv();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    svGioi();
                    break;
                case 4:
                    sapXepDiem();
                    xuat();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }

    static ArrayList<SinhVienPoLy> arraySv = new ArrayList<SinhVienPoLy>();

    public static void nhapDanhSachSv() {
        String ten;
        String nganh;
        double diem1;
        double diem2;
        double diem3;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập danh sách sinh viên");
            System.out.println("Nhập tên :(Muốn thoát nhập 0)");
            ten = sc.nextLine();
            if (ten.equals("0")) {
                break;
            }
            System.out.println("Nhập ngành của sinh viên : ");
            nganh = sc.nextLine();
            if (nganh.equals("biz")) {
                System.out.println("Nhập điểm marketing,sales lần lượt là : ");
                diem1 = Double.parseDouble(sc.nextLine());
                diem2 = Double.parseDouble(sc.nextLine());
                SinhVienBiz sv = new SinhVienBiz(ten, nganh, diem1, diem2);
                arraySv.add(sv);

            } else if (nganh.equals("cntt")) {
                System.out.println("Nhập điểm java ,css, html lần lượt là : ");
                diem1 = Double.parseDouble(sc.nextLine());
                diem2 = Double.parseDouble(sc.nextLine());
                diem3 = Double.parseDouble(sc.nextLine());
                SinhVienIT sv = new SinhVienIT(ten, nganh, diem1, diem2, diem3);
                arraySv.add(sv);
            } else {
                System.out.println("Không có ngành này");
                break;
            }

        }
    }

    public static void xuat() {
        for (int i = 0; i < arraySv.size(); i++) {
            System.out.printf("Tên sv :" + arraySv.get(i).ten + "\n Ngành :" + arraySv.get(i).nganh + "\n Điểm :" + arraySv.get(i).getDiem()
                    + "\n Học lực : " + arraySv.get(i).getHocLuc() + "\n");
        }
    }

    public static void svGioi() {
        for (int i = 0; i < arraySv.size(); i++) {
            if (arraySv.get(i).getHocLuc().equals("giỏi")) {
                System.out.printf("Tên sv :" + arraySv.get(i).ten + "\n Ngành :" + arraySv.get(i).nganh);
            }
        }
    }

    public static void sapXepDiem() {
        Comparator<SinhVienPoLy> comp = new Comparator<SinhVienPoLy>() {
            @Override
            public int compare(SinhVienPoLy o1, SinhVienPoLy o2) {
                return o1.getDiem().compareTo((o2.getDiem()));
            }
        };
        Collections.sort(arraySv, comp);
    }
}
