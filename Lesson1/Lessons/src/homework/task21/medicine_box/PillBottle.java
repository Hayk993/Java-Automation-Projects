package homework.task21.medicine_box;

public class PillBottle <T extends Medicine> {
    private T pill;

    public void addPill(T pill) {
        this.pill = pill;
    }

    public T getPill() {
        return pill;
    }
}
