package test.java;
import java.util.Scanner;

public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b){
        if(a>b) return a;
        else return b;
    }
    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height){
        String a = "Thiếu cân";
        String b = "Bình thường";
        String c = "Thừa cân";
        String d = "Béo phì";
        double BMI = weight/(Math.pow(height, 2));
        BMI = (double) Math.round(BMI*10)/10;
        if(BMI<18.5) {
            return a;
        }
        else if (BMI >= 18.5 && BMI <= 22.9){
            return b;
        }
        else if (BMI >= 23 && BMI <= 24.9){
            return c;
        }
        else return d;
    }
    public static void main(String[] args){
    }
}
