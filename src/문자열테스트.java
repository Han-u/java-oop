import java.util.Locale;
import java.util.Objects;

public class 문자열테스트 {

    public static void p(Object obj){
        System.out.print(obj);
    }
    public static void main(String[] args){
        String url = "https://www.naver.com/";
        final String naver = "https://www.Naver.com/";

        int length = url.length();

        for (int i = 0; i < length; i++) {
            p(url.charAt(i));
        }

        System.out.println();

        for (char c1: url.toCharArray()){
            p(c1);
        }

        System.out.println();

        System.out.println(url.contains("http"));
        System.out.println(url.indexOf("http")); // 시작되는
        System.out.println(url.lastIndexOf("http"));

        System.out.println(url.toLowerCase());
        System.out.println(url.toUpperCase());

        System.out.println(url.trim());

        System.out.println(url.equals(naver));
        System.out.println(url.equalsIgnoreCase(naver));

        String url2 = "http://www.naver.com/news/tv/sbs";


        String[] url2List = url2.replace("http://www.naver.com/", "").split("/");
        for(String s : url2List){
            System.out.println(s);
        }

        System.out.println(url2.concat("/index.html"));

        System.out.println(url.substring(8, 10));

        String v1 = String.valueOf(12);
        Integer n1 = Integer.valueOf(v1);

        String s1 = "han";
        String s2 = "woo";
        System.out.println(s1.compareTo(s2)); // 앞에 있으면 음수 뒤면 양수 같으면 0
        System.out.println(s2.compareTo(s1));
    }
}
