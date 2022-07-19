import java.util.Arrays;

public class 배열테스트 {
    public static void main(String[] args){
        // 얕은복사
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = a1;

        // 깊은 복사
        int[] b1 = {1, 2, 3, 4};
        int[] b2 = new int[b1.length];
        for (int i = 0; i < b1.length; i++) {
            b2[i] = b1[i];
        }

        //배열 복사1 - Object.clone()
        int[] c1 = {1, 2, 3, 4};
        int[] c2 = c1.clone();

        // 배열 복사 2 - Arrays.copyOf()
        int[] d1= {1, 2, 3, 4};
        int[] d2 = Arrays.copyOf(d1, d1.length);

        // 배열복사3 - System.arraycopy()
        int[] e1 = {1, 2, 3, 4};
        int[] e2 = new int[e1.length];
        System.arraycopy(e1, 0, e2, 0, e1.length);
    }
}
