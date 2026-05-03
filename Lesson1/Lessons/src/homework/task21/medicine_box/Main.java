package homework.task21.medicine_box;

public class Main {

    public static void main(String[] args) {

        PillBottle<Aspirin> bottle1 = new PillBottle<>();
        bottle1.addPill(new Aspirin());

        PillBottle<VitaminC> bottle2 = new PillBottle<>();
        bottle2.addPill(new VitaminC());
    }
}
