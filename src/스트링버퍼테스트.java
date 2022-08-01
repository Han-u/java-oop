public class 스트링버퍼테스트 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("홍길동")
                .append(System.lineSeparator())
                .append("학생");

        System.out.println(sb.toString());


        StringBuilder sb2 = new StringBuilder();
        sb2.append("홍길동")
                .append(System.lineSeparator())
                .append("학생");

        System.out.println(sb2.toString());

        String name = "김길동";
        String dept = "학생";
        int age = 20;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format("이름 %s", name))
                .append(System.lineSeparator())
                .append("학생");

        System.out.println(sb2.toString());

//        sb2.appendLine(); //println
//        sb2.appendFormat(); //printf

        StringPlus sp = new StringPlus();
        sp.append(String.format("이름: %s", name));

    }
}
