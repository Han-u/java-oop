public class CreditCard {
    public long cardNumber;
    public String cardOwner;
    public long balance;
    public long point;

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
    CreditCard(){}
}
