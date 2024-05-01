package card;

public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance(); // 싱글톤 패턴
        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber());
        System.out.println(yourCard.getCardNumber());

    }
}
