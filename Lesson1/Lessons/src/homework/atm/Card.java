package homework.atm;

public class Card {

    private String cardNumber;
    private String pin;
    private boolean active;

    public Card(String cardNumber, String pin, boolean active) {

        if (cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Card number must contain 16 digits.");
        }
        if (pin.length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("PIN must contain 4 digits.");
        }
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
}

