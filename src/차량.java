public class 차량 {
    public String 이름 = "차량";
    double 최대속도;
    int 정원;

    public 차량(){
        System.out.println("차량 생성자 호출");
    }

    public 차량(double 최대속도, int 정원){
        this.최대속도 = 최대속도;
        this.정원 = 정원;
    }

    public void 정보출력(){
        System.out.println("이름 = " + 이름);
        System.out.println("최대속도 = " + 최대속도);
        System.out.println("정원 = " + 정원);
    }
}

class 자동차 extends 차량{
    String 이름 = "자동차";
    String 배기량;

    public 자동차(){
        super();
        // System.out.println("자동차 생성자 호출");
    }

    public 자동차(double 최대속도, int 정원, String 배기량){
        super(최대속도, 정원);
//        super.최대속도 = 최대속도;
//        super.정원 = 정원;
        this.배기량 = 배기량;
    }

    public void 정보출력(){
        System.out.println("(차량)이름 = " + super.이름);
        System.out.println("최대속도 = " + 최대속도);
        System.out.println("정원 = " + 정원);

        System.out.println("배기량 = " + 배기량);
        System.out.println("(자동차)이름 = " + 이름);
    }
}

class 기차 extends 차량 {

}