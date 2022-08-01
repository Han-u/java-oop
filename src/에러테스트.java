public class 에러테스트 {
    public static void method1() throws ClassNotFoundException{
        Class.forName("abc");
    }

    public static void method2(int i, int j) throws Exception {
        if(j == 0){
            throw new Exception("0으로 나눌 수 없습니다");
        }

        int k = i / j;
        System.out.println(k);
    }

    public static void main(String[] args) throws ClassNotFoundException{
        int[] i = {10, 20};

        // 예외처리 방법
        // 1. 내가 try catch
        // 2. throw한다

        try{
            method1();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
