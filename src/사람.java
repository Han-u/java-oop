public class 사람 {
    public String 이름;
    public long 번호; // 주민번호
    public 사람(){

    }
    public 사람(String 이름, long 번호){
        this.이름 = 이름;
        this.번호 = 번호;
    }

}

class 교직원 extends 사람{
    public String 학교명;
    public long 번호; // 직원번호

    public 교직원(){
        super();

    }

    public 교직원(String 이름, long 번호, String 학교명, long 교원번호){
        super(이름, 번호);
        this.학교명 = 학교명;
        this.번호 = 교원번호;
    }
}

class 사무직원 extends 교직원{
    public String 부서;

    public 사무직원(String 이름, long 번호, String 학교명, long 교직원번호, String 부서){
        super(이름, 번호, 학교명, 교직원번호);
        this.부서 = 부서;
    }
}

