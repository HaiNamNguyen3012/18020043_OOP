import java.util.Scanner;

public class SoNguyenTo {
    public static  boolean ktnt(int n){
        if(n<2) return false;
        else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void primes(int n){
        for(int i=2; i<=n; i++){
            if(ktnt(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primes(n);
    }
}
