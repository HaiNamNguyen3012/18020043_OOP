import java.util.Scanner;
public class UCLN {
    public static int gdc(int a, int b){
        int x;
        while (b!=0){
            x = a%b;
            a = b;
            b = x;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int x, y;
        x = nhap.nextInt();
        y = nhap.nextInt();
        int z = gdc(x,y);
        System.out.print(z);
    }
}