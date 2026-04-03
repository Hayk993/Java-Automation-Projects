package homework.task16;

public class Rectangle extends FigureGeometric {
    int dim1;
    int dim2;

    Rectangle(String name, String color, int dim1, int dim2) {
        super(name, color);
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public double area() {
        return dim1 * dim2;
    }

    @Override
    public int perimeter() {
        return 2 * (dim1 + dim2);
    }
}
