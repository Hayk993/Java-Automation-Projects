package homework.task16;

public class FigureDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Triangle", "red", 3, 4, 5);
        Rectangle r1 = new Rectangle("Rectangle", "blue", 5, 9);
        Circle c1 = new Circle("Circle", "green", 3);
        Trapezium trapezium1 = new Trapezium("Trapezium", "pink", 2, 4, 8, 12, 5);
        System.out.println(t1.area());
        System.out.println(t1.isRight());
        System.out.println(r1.perimeter());
        FigureGeometric[] array = {t1, r1, c1, trapezium1};
        FigureGeometric maxPerimeter = array[0];
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].perimeter() > maxPerimeter.perimeter()) {
                maxPerimeter = array[i];
            }
        }
        System.out.println(maxPerimeter.getName());
        System.out.println(maxPerimeter.perimeter());


    }
}
