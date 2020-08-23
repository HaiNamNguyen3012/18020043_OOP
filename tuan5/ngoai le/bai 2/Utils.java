import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public boolean NPEx() {
        //TODO: Truy cap vao mot doi tuong co gia tri null
        String test = null;
        return test.equals(null);
    }

    public int AIOoBEx() {
        //TODO: Truy cap vao vi tri chi muc khong ton tai trong mot mang
        int[] test = {1, 2, 3};
        return test[3];
    }

    public int ArithEx() {
        //TODO: Thuc hien phep chia cho 0
        int a = 1;
        int b = 0;
        return a / b;
    }

    public void FNFEx() throws FileNotFoundException {
        //TODO: Su dung lop FileReader doc noi dung mot tep khong ton tai
        File file = new File("");
        FileReader fr = new FileReader(file);
    }

    public void IOEx() throws IOException {
        //TODO: Cac ngoai le lien quan den van de Vao/Ra cua file
        File file = new File("");
        FileReader fr = new FileReader(file);
    }

    public String NPExTest() {
        try {
            NPEx();
        } catch (NullPointerException e) {
            return "Loi Null Pointer";
        }

        return "Không có loi";
    }

    public String AIOoBExTest() {
        try {
            AIOoBEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Loi Array Index Out of Bounds";
        }

        return "Không có loi";
    }

    public String ArithExTest() {
        try {
            ArithEx();
        } catch (ArithmeticException e) {
            return "Loi Arithmetic";
        }

        return "Không có loi";
    }

    public String FNFExTest() {
        try {
            FNFEx();
        } catch (FileNotFoundException e) {
            return "Loi File Not Found";
        }
        return "Không có loi";
    }

    public String IOExTest() {
        try {
            IOEx();
        } catch (IOException e) {
            return "Loi IO";
        }
        return "Không có loi";
    }
}
