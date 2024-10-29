package Task1;

import static Task1.DrawingApp.startDrawing;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        startDrawing(rec);
        startDrawing(circle);
        startDrawing(triangle);
    }
}
