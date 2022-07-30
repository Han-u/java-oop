public class 과일테스트 {

    public static void 과일확인(과일 과일체크){
        if(과일체크 instanceof 바나나){
            System.out.println("바나나입니다");
        }else if(과일체크 instanceof 배){
            System.out.println("배");
        }else if(과일체크 instanceof 사과){
            System.out.println("tkrhk");
        }else{
            System.out.println("셋다아님");
        }
    }

    public static void main(String[] args){
        과일 과일1 = new 과일();
        과일 과일2 = new 바나나(); // 업캐스팅
        과일 과일3 = new 배();
        과일 과일4 = new 사과();

        과일확인(과일1);
        과일확인(과일2);
        과일확인(과일3);
        과일확인(과일4);

        생선 생선1 = new 생선();
//        if(생선1 instanceof 바나나){
//            System.out.println("바나나입니다");
//        }
    }
}
