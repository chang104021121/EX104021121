import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int v1 = scn.nextInt() ;
        int a , b, c, d;

        if(v1>=1000){
            a=v1/1000;
            v1=v1%1000;
            b=v1/100;
            v1=v1%100;
            c=v1/10;
            v1=v1%10;
            d=v1/1;
            System.out.println(a+"thousand"+b+"hundred"+c+"ten"+d+"dollar");
        }else{
            if(100<=v1&& v1<1000){
                b=v1/100;
                v1=v1%100;
                c=v1/10;
                v1=v1%10;
                d=v1/1;
                System.out.println((b+"hundred")+(c+"ten"+d)+(d+"dollar"));
            }else{
                if(10<=v1&&v1<100){
                    c=v1/10;
                    v1=v1%10;
                    d=v1 ;
                    System.out.println(c+"ten"+d+"dollar");
                }
//                else{
//                    if(v1<10 && v1 >= 0){
//                        System.out.println(d+"dollar");
//
//                    }
//                }
            }

        }
    }
}
