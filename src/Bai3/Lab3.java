package Bai3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Nhập phần tử của mảng : ");
        for(int i= 0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Các phần tử trong mảng :"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mảng sau khi sắp xếp :"+Arrays.toString(a));
        int min = a[0];
        for (int i=1;i<a.length;i++){
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.print("Số nhỏ nhất trong mảng là : "+min+"\n");
        int tong = 0,dem=0;

        for (int i= 0;i<a.length;i++)
        {
            if(a[i]%3==0)
            {
                tong += a[i];
                dem++;
            }

        }
        System.out.printf("Kết quả "+(float)tong/dem);



    }
}
