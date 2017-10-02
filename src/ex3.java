import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int i = scn.nextInt() % 2;
        if(i==0){
            System.out.println("偶數");
        }else{
            System.out.println("奇數");
        }
    }
}
