public class 다운캐스팅테스트 {
    public static void main(String[] args){
        사람 남자 = new 사람("홍길동", 1111);

//        교직원 교직원1 = 남자;
//        교직원 교직원1 = (교직원)남자;
//        System.out.println("교직원1.학교명 = " + 교직원1.학교명); // 에러

        교직원 남자교직원 = new 교직원("홍길동",111,"ㅁㄴㅇㄹ",22);
        사람 남자사람 = 남자교직원;
        System.out.println("남자사람.이름 = " + 남자사람.이름);
        System.out.println("남자사람.번호 = " + 남자사람.번호);

        교직원 남자교직원2 = (교직원)남자사람;
        System.out.println("남자교직원2. = " + 남자교직원2.학교명);
    }
}
