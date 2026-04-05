package homework.task16.byZakharyan;

public class TableDemo {
    public static void main(String[] args) {
        Square sq1 = new Square(4, "metal", "wood", 2);
        System.out.println(sq1.tableSurfaceArea());
        AdvancedRectangle ad1 = new AdvancedRectangle(4, "metal", "wood", 3, 2, 4);
        System.out.println(ad1.getExtendedSurfaceArea());
        System.out.println(ad1.getExtensionArea());
    }
}
