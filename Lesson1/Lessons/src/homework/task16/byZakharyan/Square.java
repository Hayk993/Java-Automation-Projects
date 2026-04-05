package homework.task16.byZakharyan;

public class Square extends Table {
    private final int dim;

    Square(int legs,String legsMaterial, String tableSurfaceMaterial,int dim){
        super(legs,legsMaterial,tableSurfaceMaterial);
        this.dim = dim;
    }

    @Override
    public double tableSurfaceArea() {
        return dim * dim;
    }


}
