public class GeMethod {
    public static <T> void print(T[] item){
        for (T s : item) {
            System.out.println(s);
        }
    }

    public static <T extends String> void firstStringPrint(T str){
        if(str.length() > 0){
            System.out.println(str.charAt(0));
        }
    }

//    public static <T extends Person> void displayAge(T item){
//        System.out.println(item.getAge());
//    }
}
