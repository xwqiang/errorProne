import java.util.HashSet;
import java.util.Set;

/**
 * Created by xuwuqiang on 2017/2/21.
 */
public class Test {
    public static void main (String[] args) {
        test();
    }
    private static void test(){
        Set<Short> s = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.size());
    }

}
