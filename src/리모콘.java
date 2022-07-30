public interface 리모콘 {
    public void 전원켜기();

    public void 전원끄기();
}

class 삼성리모콘 implements 리모콘 {
    public void 음악듣기(){
        System.out.println("딩가딩가");
    }

    @Override
    public void 전원켜기() {
        System.out.println("킴");
    }

    @Override
    public void 전원끄기() {
        System.out.println("끔");
    }
}

class 엘지리모콘 implements 리모콘, 전화{
    public void 전화받기(){
        System.out.println("때릉때릉");
    }
    @Override
    public void 전원켜기() {
        System.out.println("ㅎㅇㅎㅇ");
    }

    @Override
    public void 전원끄기() {
        System.out.println("ㅂㅇㅂㅇ");
    }
}