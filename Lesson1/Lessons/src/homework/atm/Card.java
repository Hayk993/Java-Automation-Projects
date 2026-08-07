package homework.atm;

public class Card {

    private String cardNumber;
    private String pin;
    private boolean active;

    public Card(String cardNumber, String pin, boolean active) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.active = active;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public boolean isActive() {
        return active;
    }

    public void blockCard() {
        active = false;
    }

    public void activateCard() {
        active = true;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", active=" + active +
                '}';
    }
}
