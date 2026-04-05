package homework.task16;

public class Trapezium extends FigureGeometric {
    int height;
    int dim1;
    int dim2;
    int dim3;
    int dim4;

    Trapezium(String name, String color, int dim1, int dim2, int dim3, int dim4, int height) {
        super(name, color);
        this.height = height;
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;


    }

    @Override
    public double area() {

        return (double) (dim1 + dim2) / 2 * height;

    }

    public int perimeter() {
        return dim1 + dim2 + dim3 + dim4;

    }
}
