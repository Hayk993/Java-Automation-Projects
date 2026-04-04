package homework.task16.byZakharyan;

public class Rectangle extends Table {
    private final double dim1;
    private final double dim2;

    Rectangle(int numberOfLegs, String legsMaterial, String tableSurfaceMaterial, double dim1, double dim2) {
        super(numberOfLegs, legsMaterial, tableSurfaceMaterial);
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public double tableSurfaceArea() {
        return dim1 * dim2;
    }
}
