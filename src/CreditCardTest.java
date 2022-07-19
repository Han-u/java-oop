public class CreditCardTest {
    public static void main(String[] args){
        CreditCard myCard = new CreditCard();
        /*
        CreditCard myOtherCard;
        myOtherCard = new CreditCard();
         */

        myCard.cardNumber = 1234_5678_1234_1234L;
        myCard.cardOwner = "홍길동";

        System.out.println(myCard.cardNumber);
        System.out.println(myCard.cardOwner); // null

        myCard.use(8000);
        myCard.use(12000);
        myCard.use(21000);
        myCard.payBill(30000);

        System.out.println(myCard.cardNumber);
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.balance);
        System.out.println(myCard.point);
        }

}
