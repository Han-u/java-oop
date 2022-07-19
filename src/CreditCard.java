public class CreditCard {
    private long cardNumber;
    public String cardOwner;
    public long balance;
    public long point;

    CreditCard(){}

    public void use(long amount){
        balance += amount;
    }

    public void payBill(long amount){
        balance -= amount;
        addPoint(amount / 1000);
    }

    private void addPoint(long point){
        this.point = this.point + point;
    }

    public void setCardNumber(long cardNumber) {
        if(cardNumber < 1000_0000_0000_0000L){
            System.err.println("카드번호에 문제가 있다ㅋ");
        }else{
            this.cardNumber = cardNumber;
        }

    }

    public long getCardNumber() {
        return cardNumber;
    }
}
