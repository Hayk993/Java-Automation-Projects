package homework.Task11;

public class Rectangle {
    double length;
    double width;

    Rectangle() {

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}
