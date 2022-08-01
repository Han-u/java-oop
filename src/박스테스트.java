public class 박스테스트 {
    public static void main(String[] args){
        Box<String> b1 = new Box<String>();
        b1.setBox("asdf");
        String name = (String)b1.getBox();
        System.out.println(name);

        Box<Integer> b2 = new Box<Integer>();
        b2.setBox(25);
        Integer age = (Integer)b2.getBox();
        System.out.println(age);


    }
}
