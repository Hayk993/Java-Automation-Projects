package homework.task16.byZakharyan;

public class AdvancedRectangle extends Rectangle {
    private final double extensionArea;

    AdvancedRectangle(int numberOfLegs, String legsMaterial, String tableSurfaceMaterial, double dim1, double dim2, double extensionArea) {
        super(numberOfLegs, legsMaterial, tableSurfaceMaterial, dim1, dim2);
        this.extensionArea = extensionArea;
    }

    public double getExtensionArea() {
        return extensionArea;
    }

    public double getExtendedSurfaceArea() {
        return tableSurfaceArea() + extensionArea;
    }


}
