package homework.atm;

public enum ATMState {
    IDLE,
    CARD_INSERTED,
    PIN_VERIFICATION,
    AUTHENTICATED,
    CARD_BLOCKED
}
