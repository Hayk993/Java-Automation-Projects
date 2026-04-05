package homework.task16.byZakharyan;

public class Circle extends Table {
    private final double pi = 3.14;
    private int r;

    public Circle(int numberOfLegs, String legsMaterial, String tableFaceMaterial, int r) {
        super(numberOfLegs, legsMaterial, tableFaceMaterial);
        this.r = r;
    }

    @Override
    public double tableSurfaceArea() {
        return pi * (r * r);
    }

}
