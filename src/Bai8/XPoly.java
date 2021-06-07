package Bai8;

final public class XPoly {
    public static void main(String[] args) {
        XPoly.sum(7,8,1,2);
        XPoly.sum(3,2.1);
        XPoly.min(8,1,7,12);
        XPoly.max(23,1.6,56);
        XPoly.toUpperFirstChar("hoàng thị xoan");


    }
    public static void min(double...x){
        double min =x[0];
        for(double a:x){
            min=Math.min(min,a);
        }
        System.out.println("Số nhỏ nhất :"+min);
    }
    public static void max(double...x){
        double m =x[0];
        for(double a:x){
            m=Math.max(m,a);
        }
        System.out.println("Số lớn nhất :"+m);
    }

    public static void sum(double ... x){
        double s = 0;
        for(double a:x ){
            s+=a;
        }
        System.out.println("Tổng:"+s);

    }
    public static void toUpperFirstChar(String s){
        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++){
            String x= words[i];
            if(!x.equals("")){
                String ch = x.substring(0,1).toUpperCase();
                x= ch+x.substring(1).toLowerCase();
                words[i]=x;
                 s=String.join(" ",words);
            }



        }
        System.out.println(s);

    }
}
