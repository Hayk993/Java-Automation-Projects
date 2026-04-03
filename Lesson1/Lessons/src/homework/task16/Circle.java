package homework.task16;

public class Circle extends FigureGeometric {
    final double pi = 3.14;
    int r;

    public Circle(String name, String color, int r) {
        super(name, color);
        this.r = r;

    }

    @Override
    public double area() {
        return pi * (r * r);
    }

    @Override
    public int perimeter() {
        return (int) (2 * pi * r);
    }
}
