public abstract class 도형 {
    protected int x좌표값;
    protected int y좌표값;

    public 도형(int x좌표값, int y좌표값){
        this.x좌표값 = x좌표값;
        this.y좌표값 = y좌표값;
    }

    public void 초기화(){
        x좌표값 = 0;
        y좌표값 = 0;
    }

    public abstract void 그리기();
}


class 삼각형 extends 도형{
    int 길이;
    int 높이;

    public 삼각형(int x좌표값, int y좌표값, int 길이, int 높이){
        super(x좌표값, y좌표값);
        this.길이 = 길이;
        this.높이 = 높이;
    }

    @Override
    public void 그리기(){
        System.out.println(x좌표값 +", "+y좌표값);
    }
}

class 사각형 extends 도형{
    int 길이;
    int 높이;

    public 사각형(int x좌표값, int y좌표값, int 길이, int 높이){
        super(x좌표값, y좌표값);
        this.길이 = 길이;
        this.높이 = 높이;
    }

    @Override
    public void 그리기(){
        System.out.println(x좌표값 +", "+y좌표값);
    }
}

class 원 extends 도형{
    int 반지름;
    public 원(int x좌표값, int y좌표값, int 반지름){
        super(x좌표값, y좌표값);
        this.반지름 = 반지름;
    }

    @Override
    public void 초기화(){
        x좌표값 = 0;
        y좌표값 = 0;
        반지름 = 0;
    }

    @Override
    public void 그리기(){
        System.out.println(x좌표값 +", "+y좌표값);
    }
}