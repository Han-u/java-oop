import java.util.Vector;

public class VectorTest {
    public static void main(String[] args){
        Vector vector = new Vector();
        vector.add("gdaf");
        vector.add("sdfa");
        vector.add(123);
        vector.add(80.13);

        String name = (String)vector.get(0);

        for(Object x : vector){
            System.out.println(x);
        }
    }
}
