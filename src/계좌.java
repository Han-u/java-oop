import java.util.Calendar;
import java.util.Date;

public class 계좌 {
    public String 이름;
    protected Date 개설일;
    int 계좌번호;
    private long 금액;
}

class 저축계좌 extends 계좌{
    public void 값설정(){
        이름 = "은행계좌";
        개설일 = Calendar.getInstance().getTime();
        계좌번호 = 12345;
    }
}

