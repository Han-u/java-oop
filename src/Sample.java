import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Sample {

    public static boolean isHan(String str){
        if(str.equals("한우")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String str = "호이횡";
        System.out.println("Test");

        Date today = Calendar.getInstance().getTime();

        String str1 = "한우";
        String str2 = "한우";
        String str3 = null;

        Object obj1 = new Object();

        if(str1.equals(str2)){
            System.out.println("true");
        }

        System.out.println(isHan(str1));
        System.out.println(isHan(str2));
//        System.out.println(isHan(str3)); // nullPointerException


        System.out.println(str1.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString());

        String str4 = new String("gksgks");
        System.out.println(str.toString());

        System.out.println(today.toString());

        사람 사람 = new 사람("dsf", 123);
        System.out.println(사람.toString());

    }
}
