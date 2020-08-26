import java.util.ArrayList;
import java.util.List;

public class LTTQ {
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        int size = arr.size();

        for (int i = 0; i < size; ++i) {
            for (int j = i; j > 0; --j) {
                if (arr.get(j).compareTo(arr.get(j - 1)) < 0) {
                    T temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
            }
        }

        return arr;
    }

}
