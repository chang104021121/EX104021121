import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt() ;
        int b = scn.nextInt() ;
        int c = scn.nextInt() ;
        if(a<=b && b<=c && (a+b)>c){
            System.out.println("true");

        }else{
            System.out.println("false");

        }
    }
}
