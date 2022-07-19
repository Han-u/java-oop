public class 학생 {
    public String 이름;

    public 학생(){ // 임의 생성자 추가하는 순간 기본 생성자 생성 안 됨
        System.out.println("학생 생성자 호출");
    }

    public 학생(String 이름){
        System.out.println("이름 파라미터를 갖는 학생 생성자가 호출됨");
        this.이름 = 이름;
    }
}
