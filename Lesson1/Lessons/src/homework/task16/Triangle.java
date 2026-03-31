package homework.task16;

public class Triangle extends FigureGeometric {
    double dim1;
    double dim2;
    double dim3;
    private boolean isRight;

    public Triangle(String name, String color, double dim1, double dim2, double dim3) {
        super(name, color);
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        if (dim1 + dim2 > dim3 && dim1 + dim3 > dim2 && dim2 + dim3 > dim1) {
            if ((dim1 * dim1) + (dim2 * dim2) == (dim3 * dim3) || (dim1 * dim1) + (dim3 * dim3) == (dim2 * dim2) || (dim2 * dim2) == (dim1 * dim1) * (dim3 * dim3)) {
                isRight = true;
            } else {
                isRight = false;
            }

        } else {
            System.out.println("this is not a triangle");
            this.dim1 = 0;
            this.dim2 = 0;
            this.dim3 = 0;
        }
    }

    @Override
    public double area() {
        double perimeter = (double) perimeter() / 2;
        return Math.sqrt(perimeter * (perimeter - dim1) * (perimeter - dim2) * (perimeter - dim3));

    }

//    public void isRightTriangle(Triangle t) {
//        if ((dim1 * dim1) + (dim2 * dim2) == (dim3 * dim3)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }

    @Override
    public int perimeter() {
        return (int) (dim1 + dim2 + dim3);
    }

    public double getDim3() {
        return dim3;
    }

    public boolean isRight() {
        return isRight;
    }
}
