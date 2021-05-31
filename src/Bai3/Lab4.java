package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        sc.nextLine();//để bắt kí tự enter bị thừa
        String ten[]= new String[n];
        float diem[] = new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Nhập tên : ");
            ten[i]=sc.nextLine();
            System.out.printf("Nhập điểm : ");
            diem[i]=sc.nextFloat();
            sc.nextLine();//để bắt ký tự enter bị thừa
        }
        System.out.println("Tất cả các sinh viên : "+ Arrays.toString(ten));

        for (int i=0;i<n ;i++)
        {
            if(diem[i]<5)
            {
                System.out.println("Tên: "+ten[i]+"\n điểm "+diem[i] +"\n học lực yếu");
            }
             if(diem[i]>=5&&diem[i]<6)
            {
                System.out.println("Tên: "+ten[i]+"\n điểm "+diem[i] +"\n học lực trung bình");

            }
             if(diem[i]>=6.5 && diem[i]<7.5){
                 System.out.println("Tên: "+ten[i]+"\n điểm "+diem[i] +"\n học lực khá");
             }
             if(diem[i]>=7.5&&diem[i]<9)
             {
                 System.out.println("Tên: "+ten[i]+"\n điểm "+diem[i] +"\n học lực giỏi");
             }
             if(diem[i]>=9)
             {
                 System.out.println("Tên: "+ten[i]+"\n điểm "+diem[i] +"\n học lực xuất sắc");
             }

        }
        for(int i= 0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(diem[i]>diem[j]){
                    float tmpDiem = diem[i];
                    diem[i]= diem[j];
                    diem[j]=tmpDiem;

                    String tmpTen = ten[i];
                    ten[i]=ten[j];
                    ten[j]=tmpTen;

                }
            }

        }
        System.out.println("Danh sách sinh viên sắp xếp theo điểm tăng dần : ");
        for (int i=0;i<n;i++)
        {
            System.out.println("Tên : "+ten[i]+ " Điểm: "+diem[i]);
        }


    }
}
