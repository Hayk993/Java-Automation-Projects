package homework.task16.byZakharyan;

public abstract class Table {
    protected int numberOfLegs;
    protected String legsMaterial;
    protected String tableSurfaceMaterial;

    Table(int numberOfLegs, String legsMaterial, String tableFaceMaterial) {
        this.tableSurfaceMaterial = tableFaceMaterial;
        this.legsMaterial = legsMaterial;
        this.numberOfLegs = numberOfLegs;
    }

    public abstract double tableSurfaceArea();

    //geter
    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    public String getLegsMaterial(){
        return legsMaterial;
    }
    public String getTableSurfaceMaterial(){
        return tableSurfaceMaterial;
    }


}