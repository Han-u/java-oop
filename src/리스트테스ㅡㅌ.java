import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class 리스트테스ㅡㅌ {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add("A");



        for(String x : arrayList){
            System.out.println(x);
        }

        for(String x : linkedList){
            System.out.println(x);
        }


        Collections.sort(arrayList);

    }
}
